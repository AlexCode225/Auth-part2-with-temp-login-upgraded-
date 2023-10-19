package com.example.bird_app

import android.content.Intent
import android.graphics.BitmapFactory
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import recycleview.application.bird

class birdshare : AppCompatActivity() {



    private lateinit var  textView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birdshare)



        val Bird = intent.getParcelableExtra<bird>( "Bird")

        if (Bird != null ){

            val itemimg: ImageView = findViewById(R.id.imageView2)
            val textView : TextView = findViewById(R.id.txtdetail)
            textView.text= Bird.name
            itemimg.setImageResource(Bird.image)


        }



//intent back to listing
        val backbtnT = findViewById<ImageView>(R.id.backbtnT)
        backbtnT.setOnClickListener {
            val intent1 = Intent(this, birdlisting::class.java)
            //call the intent
            startActivity(intent1)

        }


        //    val itemshare = findViewById<ImageView>(R.id.itemshare)

        //itemshare.setOnClickListener {
          val sh= BitmapFactory.decodeResource(resources,  R.drawable.birdy1)
         val intent =Intent()
            //call the intent
        //  intent.action= Intent.ACTION_SEND
        //    val path = MediaStore.Images.Media.insertImage(contentResolver,sh, "Title", null)
        //   var uri= Uri.parse(path)


        //   intent.putExtra(Intent.EXTRA_STREAM, uri)
        //    intent.type="image/*"
        //   startActivity(Intent.createChooser(intent,"Share to:"))

        //  }


    }


}