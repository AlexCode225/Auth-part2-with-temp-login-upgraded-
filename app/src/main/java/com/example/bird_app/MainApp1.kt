package com.example.bird_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainApp1 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_app1)








        val birdlist = findViewById<ImageView>(R.id.birdlist)
        birdlist.setOnClickListener {
            val intent1 = Intent(this, birdlisting::class.java)
            //call the intent
            startActivity(intent1)

        }


        //back btn intent to the main activity
        val backbtn = findViewById<ImageView>(R.id.backbtn)
        backbtn.setOnClickListener {
            val intent1 = Intent(this@MainApp1, MainActivity::class.java)
            //call the intent
            startActivity(intent1)

        }








    }
}