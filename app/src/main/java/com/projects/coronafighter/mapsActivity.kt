package com.projects.coronafighter

import android.app.Activity
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_maps.*

class mapsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        mapWebView.webViewClient = WebViewClient()
        mapWebView.loadUrl("https://cdmoro.github.io/covid-19-stats/")

        val webSettings = mapWebView.settings
        webSettings.javaScriptEnabled = true

        }
    }