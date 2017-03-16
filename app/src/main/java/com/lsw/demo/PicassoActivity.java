package com.lsw.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class PicassoActivity extends AppCompatActivity {

    ImageView imageView;

    String uri = "https://www.baidu.com/img/bd_logo1.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso);
        imageView = (ImageView)findViewById(R.id.picasso_image_view);
        initViews();
    }

    protected void initViews() {
        Picasso.with(this).load(uri).into(imageView);
    }
}
