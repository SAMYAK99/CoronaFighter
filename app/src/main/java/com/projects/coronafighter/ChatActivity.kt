package com.projects.coronafighter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_chat.*
import kotlinx.android.synthetic.main.activity_maps.*

class ChatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        chatWebView.webViewClient = WebViewClient()
        chatWebView.loadUrl("https://covid.apollo247.com/?utm_source=linkedin&utm_medium=organic&utm_campaign=bot_scanner")

        val webSettings = chatWebView.settings
        webSettings.javaScriptEnabled = true
    }
}
