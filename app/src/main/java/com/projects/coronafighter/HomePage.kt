package com.projects.coronafighter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.projects.coronafighter.IndiaCases.IndiaHomePage




import kotlinx.android.synthetic.main.activity_home_page.*


class HomePage : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        btn_india.setOnClickListener {
            val intent1 = Intent(this, IndiaHomePage::class.java)
            // start your next activity
            startActivity(intent1)
        }


        btn_world.setOnClickListener {
            val intent2 = Intent(this, Precautions::class.java)
            // start your next activity
            startActivity(intent2)
        }

        btn_map.setOnClickListener {
            val intent3 = Intent(this, mapsActivity::class.java)
            // start your next activity
            startActivity(intent3)
        }

        btn_chat.setOnClickListener {
            val intent4 = Intent(this, ChatActivity::class.java)
            // start your next activity
            startActivity(intent4)
        }
    }
}
