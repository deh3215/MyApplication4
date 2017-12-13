package com.example.a32150.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivDark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivDark = (ImageView) findViewById(R.id.imageView6);
        playViewAnimation();
    }

    void playViewAnimation()    {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim);
        ivDark.startAnimation(animation);
    }

}
