package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main31);

            TextView textView = findViewById(R.id.AnalyzeResult);
            String text = getIntent().getStringExtra("output_text");
            textView.setText(text);
        }

        public void watchExercise1Video(View view) {
        String videoUrl = "https://www.youtube.com/watch?v=XSza8hVTlmM";
        Intent intent = new Intent(this, VideoActivity.class);
        intent.putExtra("videoUrl", videoUrl);
        startActivity(intent);
    }


    }
