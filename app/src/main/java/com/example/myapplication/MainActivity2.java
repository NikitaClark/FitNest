package com.example.myapplication;

import android.app.Activity;
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
public class MainActivity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button analyzeButton = findViewById(R.id.Analyze);
        Spinner fitnessLevel = findViewById(R.id.FitnessLevel);
        Spinner hoursPerWeek = findViewById(R.id.TimeWillingToCommitAWeek);
        Spinner fitnessGoals = findViewById(R.id.FitnessGoals);

        analyzeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fitnessLevelSelected = fitnessLevel.getSelectedItem().toString();
                String hoursPerWeekSelected = hoursPerWeek.getSelectedItem().toString();
                String fitnessGoalsSelected = fitnessGoals.getSelectedItem().toString();

                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("fitness_level", fitnessLevelSelected);
                intent.putExtra("hours_per_week", hoursPerWeekSelected);
                intent.putExtra("fitness_goal", fitnessGoalsSelected);

                if (fitnessLevelSelected.equals("Beginner")) {
                    if (hoursPerWeekSelected.equals("1-2 hours")) {
                        intent.putExtra("output_text", "Here is your Beginner Level Workout for Weight Loss");
                    } else if (hoursPerWeekSelected.equals("3-4 hours")) {
                        intent.putExtra("output_text", "Here is your Beginner Level Workout for Weight Loss");
                    } else if (hoursPerWeekSelected.equals("5-6 hours")) {
                        intent.putExtra("output_text", "Here is your Beginner Level Workout for Weight Loss");
                    } else {
                        intent.putExtra("output_text", "Here is your Beginner Level Workout for Weight Loss");
                    }
                }

                startActivity(intent);
            }
        });
    }
}

