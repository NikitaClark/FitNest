package com.example.myapplication;




public class Exercise {
    private String name;

    private String videoId;

    private String goalResult;

    public Exercise(String name, String goalResult, String videoUrl) {
        this.name = name;
        this.goalResult = goalResult;
        this.videoId = videoUrl;
    }



    public String getName() {
        return name;
    }

    public String goalResult() {
        return goalResult;
    }

    public String getVideoId() {
        return videoId;
    }
}


