package com.example.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.VideoView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class DashBoard extends AppCompatActivity {

    private VideoView videoView;
    private LinearLayout workout_button;

    private LinearLayout nutrition_button;
    private LinearLayout habit_tracking_button;
    private LinearLayout settings_button;
    private LinearLayout ai_trainer_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Initialize videoView
        videoView = findViewById(R.id.videoView);


        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.logo);
        // Start playing the video
        videoView.start();
        // Loop the video
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                videoView.start();
            }
        });

        // Initialize workout_button
        workout_button = findViewById(R.id.workout_button);
        // Set click listener for workout_button
        workout_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the click event
                Intent intent = new Intent(DashBoard.this, Workout.class);
                startActivity(intent);
            }
        });
        settings_button = findViewById(R.id.settings_button);
        // Set click listener for settings_button
        settings_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashBoard.this, Settings.class);
                startActivity(intent);
            }
        });
        nutrition_button = findViewById(R.id.nutrition_button);
        nutrition_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashBoard.this, Nutrition.class);
                startActivity(intent);
            }
        });
        habit_tracking_button = findViewById(R.id.habit_tracking_button);
        habit_tracking_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashBoard.this, HabitTracking.class);
                startActivity(intent);
            }
        });
        ai_trainer_button = findViewById(R.id.ai_trainer_button);
        ai_trainer_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashBoard.this, AITrainer.class);
                startActivity(intent);
            }
        });
    }

}
