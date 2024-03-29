package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionActivity extends AppCompatActivity {

    RadioButton radioButton1, radioButton2, radioButton3, radioButton4;
    TextView tv,textScore;
    ImageButton send;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        ImageButton send = (ImageButton) findViewById(R.id.imageSend);
        send.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                int score = 0;

                if (((RadioButton) findViewById(R.id.radioButton1)).isChecked()) score += 0;
                if (((RadioButton) findViewById(R.id.radioButton2)).isChecked()) score += 1;
                if (((RadioButton) findViewById(R.id.radioButton3)).isChecked()) score += 2;
                if (((RadioButton) findViewById(R.id.radioButton4)).isChecked()) score += 3;


                if (((RadioButton) findViewById(R.id.radioButton21)).isChecked()) score += 0;
                if (((RadioButton) findViewById(R.id.radioButton22)).isChecked()) score += 1;
                if (((RadioButton) findViewById(R.id.radioButton23)).isChecked()) score += 2;
                if (((RadioButton) findViewById(R.id.radioButton24)).isChecked()) score += 3;

                if (((RadioButton) findViewById(R.id.radioButton31)).isChecked()) score += 0;
                if (((RadioButton) findViewById(R.id.radioButton32)).isChecked()) score += 1;
                if (((RadioButton) findViewById(R.id.radioButton33)).isChecked()) score += 2;
                if (((RadioButton) findViewById(R.id.radioButton34)).isChecked()) score += 3;

                if (((RadioButton) findViewById(R.id.radioButton41)).isChecked()) score += 0;
                if (((RadioButton) findViewById(R.id.radioButton42)).isChecked()) score += 1;
                if (((RadioButton) findViewById(R.id.radioButton43)).isChecked()) score += 2;
                if (((RadioButton) findViewById(R.id.radioButton44)).isChecked()) score += 3;

                if (((RadioButton) findViewById(R.id.radioButton51)).isChecked()) score += 0;
                if (((RadioButton) findViewById(R.id.radioButton52)).isChecked()) score += 1;
                if (((RadioButton) findViewById(R.id.radioButton53)).isChecked()) score += 2;
                if (((RadioButton) findViewById(R.id.radioButton54)).isChecked()) score += 3;

                if (((RadioButton) findViewById(R.id.radioButton61)).isChecked()) score += 0;
                if (((RadioButton) findViewById(R.id.radioButton62)).isChecked()) score += 1;
                if (((RadioButton) findViewById(R.id.radioButton63)).isChecked()) score += 2;
                if (((RadioButton) findViewById(R.id.radioButton64)).isChecked()) score += 3;

                if (((RadioButton) findViewById(R.id.radioButton71)).isChecked()) score += 0;
                if (((RadioButton) findViewById(R.id.radioButton72)).isChecked()) score += 1;
                if (((RadioButton) findViewById(R.id.radioButton73)).isChecked()) score += 2;
                if (((RadioButton) findViewById(R.id.radioButton74)).isChecked()) score += 3;

                if (((RadioButton) findViewById(R.id.radioButton81)).isChecked()) score += 0;
                if (((RadioButton) findViewById(R.id.radioButton82)).isChecked()) score += 1;
                if (((RadioButton) findViewById(R.id.radioButton83)).isChecked()) score += 2;
                if (((RadioButton) findViewById(R.id.radioButton84)).isChecked()) score += 3;

                if (((RadioButton) findViewById(R.id.radioButton91)).isChecked()) score += 0;
                if (((RadioButton) findViewById(R.id.radioButton92)).isChecked()) score += 1;
                if (((RadioButton) findViewById(R.id.radioButton93)).isChecked()) score += 2;
                if (((RadioButton) findViewById(R.id.radioButton94)).isChecked()) score += 3;

                if (score <= 7) {
                    Intent intent = new Intent(getApplicationContext(), NoriskActivity.class);
                    startActivity(intent); }
                if (score >= 7) {
                    Intent intent = new Intent(getApplicationContext(), lowriskActivity.class);
                    startActivity(intent); }
                if (score >= 13) {
                    Intent intent = new Intent(getApplicationContext(), mediumriskActivity.class);
                    startActivity(intent); }
                if (score >= 19) {
                    Intent intent = new Intent(getApplicationContext(), highrisk.class);
                    startActivity(intent); }

            }

        });}


    private void displayResult(int score) {
        String message = "You scored " + score;
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0 , 0);
        toast.show();
    }
}

