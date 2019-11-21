package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.concurrent.ConcurrentHashMap;

public class QuestionActivity extends AppCompatActivity {

    RadioButton radioButton1, radioButton2, radioButton3, radioButton4;
    TextView tv;
    Button Submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        tv = (TextView) findViewById(R.id.textShowScore);
        Button Submit = (Button)findViewById(R.id.buttonSubmit);
        Submit.setOnClickListener(new View.OnClickListener() {
//5555
                                      @Override
                                      public void onClick(View view) {
                                          int score = 0;
                                          if (((RadioButton) findViewById(R.id.radioButton1)).isChecked()) score += 1;
                                          if (((RadioButton) findViewById(R.id.radioButton2)).isChecked()) score += 2;
                                          if (((RadioButton) findViewById(R.id.radioButton3)).isChecked()) score += 3;
                                          if (((RadioButton) findViewById(R.id.radioButton4)).isChecked()) score += 4;


                                          if (((RadioButton) findViewById(R.id.radioButton11)).isChecked()) score += 1;
                                          if (((RadioButton) findViewById(R.id.radioButton22)).isChecked()) score += 2;
                                          if (((RadioButton) findViewById(R.id.radioButton33)).isChecked()) score += 3;
                                          if (((RadioButton) findViewById(R.id.radioButton44)).isChecked()) score += 4;

                 if ( score >= 3 ) {
                     Intent intent = new Intent(getApplicationContext(), ScopeActivity.class);
                     startActivity(intent);
                 }
            }

        });}
    private void displayResult(int score) {
        String message = "You scored " + score;
        message += "\nWell done!";
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0 , 0);
        toast.show();
    }}

