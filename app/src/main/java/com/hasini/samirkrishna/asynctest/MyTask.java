package com.hasini.samirkrishna.asynctest;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;

import com.hasini.samirkrishna.asynctest.MainActivity;
import com.hasini.samirkrishna.asynctest.R;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class MyTask extends AsyncTask {
    InputStream ins;
    MainActivity mActivity;
    MyTask(MainActivity mActivity)
    {
        this.mActivity=mActivity;
    }
    @Override
    protected Object doInBackground(Object[] objects) {//loading the data

        try {
            URL url =new URL("https://www.bing.com/images/search?q=cheetha+images&FORM=HDRSC2");//hitting the url
            ins = url.openStream();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Object o) {

        ImageView iview=mActivity.findViewById(R.id.iv1);
        Bitmap bmp= BitmapFactory.decodeStream(ins);//input stream object is converted into bitmap object
        iview.setImageBitmap(bmp);
        super.onPostExecute(o);
    }
}
