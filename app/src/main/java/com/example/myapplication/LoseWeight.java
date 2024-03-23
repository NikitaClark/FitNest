package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LoseWeight extends AppCompatActivity {

    private ProgressBar progressBar;
    private Button btnNext;
    private TextView ageText, countryText, heightText, weightText, infoText;
    private EditText editAge, editCountry, editZipCode;
    private Spinner spinnerHeight, spinnerWeight, spinnerWeightGoal;

    private int progressStatus = 1; // Initialize to show step 1 initially

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loseweight);

        // Initialize UI components
        progressBar = findViewById(R.id.progressBar);
        btnNext = findViewById(R.id.btnNext);
        ageText = findViewById(R.id.ageText);
        countryText = findViewById(R.id.countryText);
        heightText = findViewById(R.id.heightText);
        weightText = findViewById(R.id.weightText);
        infoText = findViewById(R.id.infoText);
        editAge = findViewById(R.id.editAge);
        editCountry = findViewById(R.id.editCountry);
        editZipCode = findViewById(R.id.editZipCode);
        spinnerHeight = findViewById(R.id.spinnerHeight);
        spinnerWeight = findViewById(R.id.spinnerWeight);
        spinnerWeightGoal = findViewById(R.id.spinnerWeightGoal);

        // Setup for Spinner for Height
        ArrayAdapter<CharSequence> heightAdapter = ArrayAdapter.createFromResource(
                this, R.array.heights_in_feet, R.layout.custom_spinner_item);
        heightAdapter.setDropDownViewResource(R.layout.custom_spinner_item);
        spinnerHeight.setAdapter(heightAdapter);

        // Setup for Spinner for Weight
        ArrayAdapter<CharSequence> weightAdapter = ArrayAdapter.createFromResource(
                this, R.array.weights_in_lbs, R.layout.custom_spinner_item);
        weightAdapter.setDropDownViewResource(R.layout.custom_spinner_item);
        spinnerWeight.setAdapter(weightAdapter); // Corrected to set weightAdapter to spinnerWeight

        // Setup for Spinner for Weight
        ArrayAdapter<CharSequence> weightGoalAdapter = ArrayAdapter.createFromResource(
                this, R.array.weights_in_lbs, R.layout.custom_spinner_item);
        weightGoalAdapter.setDropDownViewResource(R.layout.custom_spinner_item);
        spinnerWeightGoal.setAdapter(weightGoalAdapter); // Corrected to set weightAdapter to spinnerWeight


        progressBar.setMax(6); // Set the max value for the progress bar

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressStatus++;
                progressBar.setProgress(progressStatus);
                updateQuestions(progressStatus);
            }
        });

        updateQuestions(progressStatus); // Initialize UI based on the current progress
    }


    void updateQuestions(int questionNumber) {
        switch (questionNumber) {
            case 1:

                findViewById(R.id.emailEditText).setVisibility(View.GONE);
                findViewById(R.id.passwordEditText).setVisibility(View.GONE);
                findViewById(R.id.loginButton).setVisibility(View.GONE);


                findViewById(R.id.buttonLoseHalfPound).setVisibility(View.GONE);
                findViewById(R.id.buttonLose1Pound).setVisibility(View.GONE);
                findViewById(R.id.buttonLose1HalfPound).setVisibility(View.GONE);
                findViewById(R.id.buttonLose2Pound).setVisibility(View.GONE);

                findViewById(R.id.textViewGoalWeight).setVisibility(View.GONE);
                findViewById(R.id.spinnerWeightGoal).setVisibility(View.GONE);
                findViewById(R.id.textViewWeeklyGoal).setVisibility(View.GONE);
                findViewById(R.id.buttonLoseHalfPound).setVisibility(View.GONE);


                findViewById(R.id.buttonLackOfTime).setVisibility(View.VISIBLE);
                findViewById(R.id.buttonHardRegimen).setVisibility(View.VISIBLE);
                findViewById(R.id.buttonLackVariety).setVisibility(View.VISIBLE);
                findViewById(R.id.buttonStressFoodChoices).setVisibility(View.VISIBLE);
                findViewById(R.id.buttonHolidaysEvents).setVisibility(View.VISIBLE);
                findViewById(R.id.buttonFoodCravings).setVisibility(View.VISIBLE);
                findViewById(R.id.buttonLackOfProgress).setVisibility(View.VISIBLE);

                findViewById(R.id.buttonNotVeryActive).setVisibility(View.GONE);
                findViewById(R.id.buttonLightlyActive).setVisibility(View.GONE);
                findViewById(R.id.buttonActive).setVisibility(View.GONE);
                findViewById(R.id.buttonVeryActive).setVisibility(View.GONE);

                findViewById(R.id.baseline).setVisibility(View.GONE);
                findViewById(R.id.account).setVisibility(View.GONE);
                findViewById(R.id.PI).setVisibility(View.GONE);



                ageText.setVisibility(View.GONE);
                countryText.setVisibility(View.GONE);
                heightText.setVisibility(View.GONE);
                weightText.setVisibility(View.GONE);
                infoText.setVisibility(View.GONE);
                editAge.setVisibility(View.GONE);
                editCountry.setVisibility(View.GONE);
                editZipCode.setVisibility(View.GONE);
                spinnerHeight.setVisibility(View.GONE);
                spinnerWeight.setVisibility(View.GONE);
                break;
            case 2:

                findViewById(R.id.buttonLackOfTime).setVisibility(View.GONE);
                findViewById(R.id.buttonHardRegimen).setVisibility(View.GONE);
                findViewById(R.id.buttonLackVariety).setVisibility(View.GONE);
                findViewById(R.id.buttonStressFoodChoices).setVisibility(View.GONE);
                findViewById(R.id.buttonHolidaysEvents).setVisibility(View.GONE);
                findViewById(R.id.buttonFoodCravings).setVisibility(View.GONE);
                findViewById(R.id.buttonLackOfProgress).setVisibility(View.GONE);

                findViewById(R.id.buttonNotVeryActive).setVisibility(View.VISIBLE);
                findViewById(R.id.buttonLightlyActive).setVisibility(View.VISIBLE);
                findViewById(R.id.buttonActive).setVisibility(View.VISIBLE);
                findViewById(R.id.buttonVeryActive).setVisibility(View.VISIBLE);

                findViewById(R.id.barriers).setVisibility(View.GONE);
                findViewById(R.id.baseline).setVisibility(View.VISIBLE);

                break;
            case 3:
                findViewById(R.id.buttonNotVeryActive).setVisibility(View.GONE);
                findViewById(R.id.buttonLightlyActive).setVisibility(View.GONE);
                findViewById(R.id.buttonActive).setVisibility(View.GONE);
                findViewById(R.id.buttonVeryActive).setVisibility(View.GONE);
                findViewById(R.id.baseline).setVisibility(View.GONE);

                findViewById(R.id.PI).setVisibility(View.VISIBLE);

                ageText.setVisibility(View.VISIBLE);
                countryText.setVisibility(View.VISIBLE);
                heightText.setVisibility(View.GONE);
                weightText.setVisibility(View.GONE);
                infoText.setVisibility(View.VISIBLE);
                editAge.setVisibility(View.VISIBLE);
                editCountry.setVisibility(View.VISIBLE);
                editZipCode.setVisibility(View.VISIBLE);
                spinnerHeight.setVisibility(View.GONE);
                spinnerWeight.setVisibility(View.GONE);

                break;
            case 4:
                ageText.setVisibility(View.GONE);
                countryText.setVisibility(View.GONE);
                infoText.setVisibility(View.GONE);
                editAge.setVisibility(View.GONE);
                editCountry.setVisibility(View.GONE);
                editZipCode.setVisibility(View.GONE);
                heightText.setVisibility(View.VISIBLE);
                weightText.setVisibility(View.VISIBLE);
                spinnerHeight.setVisibility(View.VISIBLE);
                spinnerWeight.setVisibility(View.VISIBLE);

                break;

            case 5:

                heightText.setVisibility(View.GONE);
                weightText.setVisibility(View.GONE);
                spinnerHeight.setVisibility(View.GONE);
                spinnerWeight.setVisibility(View.GONE);



                findViewById(R.id.spinnerWeightGoal).setVisibility(View.VISIBLE);


                findViewById(R.id.buttonLoseHalfPound).setVisibility(View.VISIBLE);
                findViewById(R.id.buttonLose1Pound).setVisibility(View.VISIBLE);
                findViewById(R.id.buttonLose1HalfPound).setVisibility(View.VISIBLE);
                findViewById(R.id.buttonLose2Pound).setVisibility(View.VISIBLE);

                findViewById(R.id.textViewGoalWeight).setVisibility(View.VISIBLE);
                findViewById(R.id.spinnerWeightGoal).setVisibility(View.VISIBLE);
                findViewById(R.id.textViewWeeklyGoal).setVisibility(View.VISIBLE);
                findViewById(R.id.buttonLoseHalfPound).setVisibility(View.VISIBLE);
                break;
            case 6:

                findViewById(R.id.spinnerWeightGoal).setVisibility(View.GONE);


                findViewById(R.id.buttonLoseHalfPound).setVisibility(View.GONE);
                findViewById(R.id.buttonLose1Pound).setVisibility(View.GONE);
                findViewById(R.id.buttonLose1HalfPound).setVisibility(View.GONE);
                findViewById(R.id.buttonLose2Pound).setVisibility(View.GONE);

                findViewById(R.id.textViewGoalWeight).setVisibility(View.GONE);
                findViewById(R.id.spinnerWeightGoal).setVisibility(View.GONE);
                findViewById(R.id.textViewWeeklyGoal).setVisibility(View.GONE);
                findViewById(R.id.buttonLoseHalfPound).setVisibility(View.GONE);


                findViewById(R.id.PI).setVisibility(View.GONE);

                findViewById(R.id.account).setVisibility(View.VISIBLE);
                findViewById(R.id.emailEditText).setVisibility(View.VISIBLE);
                findViewById(R.id.passwordEditText).setVisibility(View.VISIBLE);
                findViewById(R.id.loginButton).setVisibility(View.VISIBLE);


                btnNext.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(LoseWeight.this, DashBoard.class);
                        startActivity(intent);
                    }
                });


                break;

        }
    }
}
