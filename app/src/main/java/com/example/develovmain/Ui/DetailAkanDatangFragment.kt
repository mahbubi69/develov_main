package com.example.develovmain.Ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.develovmain.R


class DetailAkanDatangFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail_akan_datang, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()

    }
}