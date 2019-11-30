package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class spalsh extends AppCompatActivity {

    private ImageView imagSpalsh;

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
                    sleep(4000);
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
