package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

        private ImageButton imageStartQuestion,imageWhatis,imageScope,imageHistory,home,imagePlace,imageSymptom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imageScope = (ImageButton) findViewById(R.id.imageScope);
        imageScope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ScopeActivity.class);
                startActivity(intent);
            }
        });

        ImageButton imageWhatis = (ImageButton) findViewById(R.id.imageWhatis);
        imageWhatis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WhatisActivity.class);
                startActivity(intent);
            }
        });

        ImageButton imageStartQuestion = (ImageButton) findViewById(R.id.imageStart);
        imageStartQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), QuestionActivity.class);
                startActivity(intent);
            }
        });

        ImageButton imageHistory = (ImageButton) findViewById(R.id.imageCure);
        imageHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), history.class);
                startActivity(intent);
            }
        });

        ImageButton imagePlace = (ImageButton) findViewById(R.id.imagePlace);
        imagePlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), place.class);
                startActivity(intent);
            }
        });

        ImageButton imageSymptom = (ImageButton) findViewById(R.id.imageSymptom);
        imageSymptom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), symptom.class);
                startActivity(intent);
            }
        });

        ImageButton imageHelp = (ImageButton) findViewById(R.id.imageHelp);
        imageHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), help.class);
                startActivity(intent);
            }
        });
    }

    }






