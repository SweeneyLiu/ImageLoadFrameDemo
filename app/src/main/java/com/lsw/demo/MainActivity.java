package com.lsw.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //跳转到ImageLoader
        Button imageLoaderButton = (Button)findViewById(R.id.image_load_button);
        imageLoaderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ImageLoaderActivity.class);
                startActivity(intent);
            }
        });

        //跳转到Fresco
        Button frescoButton = (Button)findViewById(R.id.fresco_button);
        frescoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FrescoActivity.class);
                startActivity(intent);
            }
        });

        //跳转到Glide
        Button glideButton = (Button)findViewById(R.id.glide_button);
        glideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,GlideActivity.class);
                startActivity(intent);
            }
        });

        //跳转到Picasso
        Button picassoButton = (Button)findViewById(R.id.picasso_button);
        picassoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PicassoActivity.class);
                startActivity(intent);
            }
        });
    }
}
