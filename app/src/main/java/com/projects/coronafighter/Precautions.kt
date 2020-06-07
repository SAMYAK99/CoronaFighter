package com.projects.coronafighter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_maps.*
import kotlinx.android.synthetic.main.activity_precautions.*

class Precautions : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_precautions)

        precaution_Webview.webViewClient = WebViewClient()
        precaution_Webview.loadUrl("https://www.redcross.org/get-help/how-to-prepare-for-emergencies/types-of-emergencies/coronavirus-safety.html")

        val webSettings = precaution_Webview.settings
        webSettings.javaScriptEnabled = true

    }
}
