package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity2 extends Activity {
    private ProgressBar progressBar;
    private TextView questionTextView;
    private CheckBox option1CheckBox, option2CheckBox, option3CheckBox, option4CheckBox;
    private int progressStatus = 0;

    private Button btnLoseWeight;
    private Button btnMaintainWeight;
    private Button btnGainWeight;
    private Button btnGainMuscle;
    private Button btnModifyDiet;
    private Button btnManageStress;
    private Button btnIncreaseStepCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        progressBar = findViewById(R.id.progressBar);
        // Initialize your buttons
        btnLoseWeight = findViewById(R.id.btnLoseWeight);
        btnMaintainWeight = findViewById(R.id.btnMaintainWeight);
        btnGainWeight = findViewById(R.id.btnGainWeight);
        btnGainMuscle = findViewById(R.id.btnGainMuscle);
        btnModifyDiet = findViewById(R.id.btnModifyDiet);
        btnManageStress = findViewById(R.id.btnManageStress);
        btnIncreaseStepCount = findViewById(R.id.btnIncreaseStepCount);

        Button btnNext = findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Increment progress bar by 1 each time "Next" is clicked
                if (progressStatus < progressBar.getMax()) {
                    progressStatus++;
                    progressBar.setProgress(progressStatus);
                    updateQuestions(progressStatus);
                }
            }
        });
    }

    private void updateQuestions(int questionNumber) {
        switch (questionNumber) {
            case 1:
                btnLoseWeight.setText("Competitive sport performance");
                btnMaintainWeight.setText("Gain muscle for general fitness");
                btnGainWeight.setText("I am underweight");
                btnGainMuscle.setText("My healthcare provider recommended it");
                btnModifyDiet.setText("Other");
                // Hide the buttons that are not needed for the second question
                btnManageStress.setVisibility(View.GONE);
                btnIncreaseStepCount.setVisibility(View.GONE);
                break;
            // Add more cases if there are more sets of questions
        }
    }

}








//
//        Button analyzeButton = findViewById(R.id.Analyze);
//        Spinner fitnessLevel = findViewById(R.id.FitnessLevel);
//        Spinner hoursPerWeek = findViewById(R.id.TimeWillingToCommitAWeek);
//        Spinner fitnessGoals = findViewById(R.id.FitnessGoals);
//
//        analyzeButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                String fitnessLevelSelected = fitnessLevel.getSelectedItem().toString();
//                String hoursPerWeekSelected = hoursPerWeek.getSelectedItem().toString();
//                String fitnessGoalsSelected = fitnessGoals.getSelectedItem().toString();
//
//                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
//                intent.putExtra("fitness_level", fitnessLevelSelected);
//                intent.putExtra("hours_per_week", hoursPerWeekSelected);
//                intent.putExtra("fitness_goal", fitnessGoalsSelected);
//
//                if (fitnessLevelSelected.equals("Beginner")) {
//                    if (hoursPerWeekSelected.equals("1-2 hours")) {
//                        intent.putExtra("output_text", "Here is your Beginner Level Workout for Weight Loss");
//                    } else if (hoursPerWeekSelected.equals("3-4 hours")) {
//                        intent.putExtra("output_text", "Here is your Beginner Level Workout for Weight Loss");
//                    } else if (hoursPerWeekSelected.equals("5-6 hours")) {
//                        intent.putExtra("output_text", "Here is your Beginner Level Workout for Weight Loss");
//                    } else {
//                        intent.putExtra("output_text", "Here is your Beginner Level Workout for Weight Loss");
//                    }
//                }
//
//                startActivity(intent);
//            }
//        });
//    }
//}
//
