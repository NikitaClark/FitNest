package com.example.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Spinner;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button Analyze_button = (Button) findViewById(R.id.Analyze);
        Spinner fitnessLevel = findViewById(R.id.FitnessLevel);
        Spinner hoursPerWeek = findViewById(R.id.TimeWillingToCommitAWeek);
        Spinner fitnessGoal = findViewById(R.id.FitnessGoals);
        Analyze_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String FitnessLevelSelected = fitnessLevel.getSelectedItem().toString();
                String HoursPerWeek = hoursPerWeek.getSelectedItem().toString();

                if ((FitnessLevelSelected.equals("Beginner")) && (HoursPerWeek.equals("1 day"))) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                    intent.putExtra("output_text", "Here is your Beginner Level Workout1");
                    startActivity(intent);
                } else if ((FitnessLevelSelected.equals("Beginner")) && (HoursPerWeek.equals("2 day"))) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                    intent.putExtra("output_text", "Here is your Beginner Level Workout2");
                    startActivity(intent);
                } else if ((FitnessLevelSelected.equals("Beginner")) && (HoursPerWeek.equals("3 day"))) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                    intent.putExtra("output_text", "Here is your Beginner Level Workout3");
                    startActivity(intent);
                } else if ((FitnessLevelSelected.equals("Beginner")) && (HoursPerWeek.equals("4 day"))) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                    intent.putExtra("output_text", "Here is your Beginner Level Workout4");
                    startActivity(intent);
                } else if ((FitnessLevelSelected.equals("Beginner")) && (HoursPerWeek.equals("5 day"))) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                    intent.putExtra("output_text", "Here is your Beginner Level Workout5");
                    startActivity(intent);
                }

            }
        });}}
/*
        Analyze_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity3();


            }
        });

    }
    public void openMainActivity3() {
        Intent intent = new Intent(this, MainActivity3.class);
        intent.putExtra("text", "Your Own Set Of Exercises For The Week");
        startActivity(intent);

    }




    }
}*/