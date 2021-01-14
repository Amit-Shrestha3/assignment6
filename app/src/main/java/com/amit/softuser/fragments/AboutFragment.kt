package com.amit.softuser.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.amit.softuser.R


class AboutFragment : Fragment() {


    private lateinit var wbView: WebView
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view =inflater.inflate(R.layout.fragment_about, container, false)
        wbView= view.findViewById(R.id.wbView)
        wbView.loadUrl("https://softwarica.edu.np/")

        val WebSettings = wbView.getSettings();
        WebSettings.setJavaScriptEnabled(true)

        wbView.setWebViewClient(WebViewClient())



        return view

    }






}