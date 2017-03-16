package com.lsw.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

public class ImageLoaderActivity extends AppCompatActivity {

    private String uri = "https://www.baidu.com/img/bd_logo1.png";
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_loader);
        //创建默认的ImageLoader配置参数
        ImageLoaderConfiguration configuration = ImageLoaderConfiguration.createDefault(getApplicationContext());
        //Initialize ImageLoader with configuration.
        ImageLoader.getInstance().init(configuration);
        mImageView = (ImageView)findViewById(R.id.image_load_iv);
        Button button = (Button)findViewById(R.id.load_image_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageLoader.getInstance().displayImage(uri,mImageView);
            }
        });
    }
}
