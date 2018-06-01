package com.hasini.samirkrishna.asynctest

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import android.view.View
import android.widget.ImageView
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var policy=StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)
    }
    fun getImage(v:View){//https://www.bing.com/images/search?q=cheetha+images&FORM=HDRSC2

        var mTask=MyTask(this)
        mTask.execute()//automatically doinbackground and onpostexecute will execute

    }

}
