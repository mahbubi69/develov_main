package com.example.develovmain

import android.app.Application
import com.example.develovmain.core.value.Value
import dagger.hilt.android.HiltAndroidApp
import net.gotev.uploadservice.UploadServiceConfig
import net.gotev.uploadservice.logger.UploadServiceLogger
import net.gotev.uploadservice.okhttp.OkHttpStack
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import timber.log.Timber
import java.util.concurrent.TimeUnit

@HiltAndroidApp
class BaseApk : Application() {
    override fun onCreate() {
        super.onCreate()

        UploadServiceConfig.initialize(
            context = this,
            defaultNotificationChannel = Value.CHANNEL_NOTIFICATION_UPLOAD,
            debug = BuildConfig.DEBUG
        )

//        config to signal
        UploadServiceConfig.httpStack = OkHttpStack(getOkHttpClient())
        UploadServiceConfig.idleTimeoutSeconds = 60 * 5
        UploadServiceConfig.bufferSizeBytes = 4096
        UploadServiceLogger.setLogLevel(UploadServiceLogger.LogLevel.Debug)
    }


    private fun getOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder().followRedirects(true).followSslRedirects(true)
            .retryOnConnectionFailure(true).connectTimeout(15, TimeUnit.SECONDS)
            .writeTimeout(300L, TimeUnit.SECONDS).readTimeout(300L, TimeUnit.SECONDS)
            .addInterceptor(HttpLoggingInterceptor { message: String? ->
                if (message != null) {
                    Timber.tag("message").d(message)
                }
            }.setLevel(HttpLoggingInterceptor.Level.BODY)).cache(null).build()
    }
}