package com.example.myapplication;

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

    private TextView headerProfile;
    private ImageView avatarImage;
    private TextView name;
    private Button joinHaloInsiderButton;
    private VideoView videoView;
    private Button workout_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);



        videoView = findViewById(R.id.videoView);
//        MediaController mediaController = new MediaController(this);
//        mediaController.setAnchorView(videoView);
//        videoView.setMediaController(mediaController);
//        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.logo);
//
//
//        // Initialize elements
//        headerProfile = findViewById(R.id.header_profile);
//        avatarImage = findViewById(R.id.avatar_image);
//        workout_button = findViewById(R.id.workout_button);
//        joinHaloInsiderButton = findViewById(R.id.workout_button); // This line is redundant. You're already initializing workout_button above.
//        name = findViewById(R.id.name);
//
//        workout_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(DashBoard.this, MainActivity3.class);
//                startActivity(intent);
//            }
//        });

        videoView.start();
        // Loop the video
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                videoView.start();
            }
        });
    }
}
