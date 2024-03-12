package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DashBoard extends AppCompatActivity {

    private TextView headerProfile;
    private ImageView avatarImage;
    private TextView signedInText;
    private TextView name;
    private Button joinHaloInsiderButton;
    private TextView signInLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Initialize elements
        headerProfile = findViewById(R.id.header_profile);
        avatarImage = findViewById(R.id.avatar_image);

        joinHaloInsiderButton = findViewById(R.id.workout_button);

        name = findViewById(R.id.name);

        // Set up listeners or any other initializations
    }
}
