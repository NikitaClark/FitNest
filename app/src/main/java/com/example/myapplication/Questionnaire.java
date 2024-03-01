package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Questionnaire extends AppCompatActivity {
    private Button btnLoseWeight, btnGainMuscle, btnNext;
    private int selectedPath = 0; // 0: none, 1: lose weight, 2: gain muscle

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);

        btnLoseWeight = findViewById(R.id.btnLoseWeight);
        btnGainMuscle = findViewById(R.id.btnGainMuscle);
        btnNext = findViewById(R.id.btnNext);

        // Separate listeners for Lose Weight and Gain Muscle buttons
        btnLoseWeight.setOnClickListener(v -> {
            selectedPath = 1; // Mark path as Lose Weight
            btnNext.setEnabled(true); // Enable the Next button after a selection is made
        });

        btnGainMuscle.setOnClickListener(v -> {
            selectedPath = 2; // Mark path as Gain Muscle
            btnNext.setEnabled(true); // Enable the Next button after a selection is made
        });

        btnNext.setOnClickListener(v -> {
            // Determine which activity to start based on the selection
            Intent intent = null;
            switch (selectedPath) {
                case 1: // Lose Weight selected
                    intent = new Intent(Questionnaire.this, LoseWeight.class);
                    break;
                case 2: // Gain Muscle selected
                    intent = new Intent(Questionnaire.this, GainMuscle.class);
                    break;
                default:
                    // This default case should never be hit since Next is disabled initially
                    Toast.makeText(Questionnaire.this, "Please select an option first.", Toast.LENGTH_SHORT).show();
                    return;
            }
            if (intent != null) {
                startActivity(intent);
            }
        });

        // Initially disable the Next button until a selection is made
        btnNext.setEnabled(false);
    }
}
