package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
    private Button workout_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Initialize elements
        headerProfile = findViewById(R.id.header_profile);
        avatarImage = findViewById(R.id.avatar_image);
        workout_button = findViewById(R.id.workout_button);
        joinHaloInsiderButton = findViewById(R.id.workout_button); // This line is redundant. You're already initializing workout_button above.
        name = findViewById(R.id.name);

        workout_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoard.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}
