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
                Intent intent = new Intent(DashBoard.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}
