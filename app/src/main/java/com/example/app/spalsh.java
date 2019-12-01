package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class spalsh extends AppCompatActivity {

    private ImageView imagSpalsh;
    private Context context;
    private ProgressBar progressBar;
    private TextView textView;
    private float from;
    private float to;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);

        imagSpalsh = (ImageView) findViewById(R.id.imagSpalsh);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        imagSpalsh.startAnimation(myanim);

        final Intent i = new Intent(this,MainActivity.class);
        Thread timer = new Thread(){
            public void run(){
                try {
                    sleep(5000);
                }catch (InterruptedException e){
                   e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();
    }
}
