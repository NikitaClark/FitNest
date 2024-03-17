package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class VideoActivity extends Activity {

    private YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        youTubePlayerView = findViewById(R.id.youtube_player_view);

        Intent intent = getIntent();
        int buttonId = intent.getIntExtra("buttonId", -1);

        String videoId;
        switch (buttonId) {
            case R.id.exercise1_video:
                videoId = intent.getStringExtra("videoId1");
                break;
            case R.id.exercise2_video:
                videoId = intent.getStringExtra("videoId2");
                break;
            case R.id.exercise3_video:
                videoId = intent.getStringExtra("videoId3");
                break;
            default:
                // Handle invalid button ID
                return;
        }

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(YouTubePlayer youTubePlayer) {
                youTubePlayer.loadVideo(videoId, 0);
            }
        });
    }
}
