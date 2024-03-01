package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
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
    private Spinner spinnerHeight, spinnerWeight;

    private int progressStatus = 2; // Initialize progress status with the initial value from ProgressBar in XML

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loseweight);

        progressBar = findViewById(R.id.progressBar);
        btnNext = findViewById(R.id.btnNext);

        // Other initializations
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

        progressBar.setMax(7); // Ensure this matches your total steps

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressStatus++;
                progressBar.setProgress(progressStatus); // Increment and update ProgressBar
                updateQuestions(progressStatus);
            }
        });

        updateQuestions(progressStatus); // Set initial UI state
    }

    void updateQuestions(int questionNumber) {
        // Hide everything initially
        findViewById(R.id.buttonLackOfTime).setVisibility(View.GONE);
        findViewById(R.id.buttonHardRegimen).setVisibility(View.GONE);
        findViewById(R.id.buttonLackVariety).setVisibility(View.GONE);
        findViewById(R.id.buttonStressFoodChoices).setVisibility(View.GONE);
        findViewById(R.id.buttonHolidaysEvents).setVisibility(View.GONE);
        findViewById(R.id.buttonFoodCravings).setVisibility(View.GONE);
        findViewById(R.id.buttonLackOfProgress).setVisibility(View.GONE);
        findViewById(R.id.buttonTasteGood).setVisibility(View.GONE);
        findViewById(R.id.buttonTooExpensive).setVisibility(View.GONE);
        findViewById(R.id.buttonHardToCook).setVisibility(View.GONE);

        // Logic to show relevant UI components for each step
        switch (questionNumber) {
            case 1:
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
                // Show/hide components specific to step 2
                break;
            case 3:
                // Additional logic for other steps
                break;
            // Continue for other steps as needed
        }
    }
}
