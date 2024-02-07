package com.example.myapplication;


        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.RelativeLayout;
        import android.widget.Spinner;
        import android.widget.TextView;

        import com.example.myapplication.Exercise;

        import java.util.ArrayList;
        import java.util.List;

public class MainActivity3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView textView = findViewById(R.id.AnalyzeResult);
        String text = getIntent().getStringExtra("output_text");
        textView.setText(text);

        Intent intent = getIntent();
        String fitnessLevel = intent.getStringExtra("fitness_level");
        String hoursPerWeek = intent.getStringExtra("hours_per_week");
        String fitnessGoal = intent.getStringExtra("fitness_goal");
        String begWeighLoss = "10 reps x 3 sets";

        List<Exercise> beginnerBack = new ArrayList<>();
        beginnerBack.add(new Exercise("Seated Cable Rows", begWeighLoss, "GZbfZ033f74"));
        beginnerBack.add(new Exercise("Lat Pulldowns", begWeighLoss, "CAwf7n6Luuc"));
        beginnerBack.add(new Exercise("Dumbbell Rows", begWeighLoss, "djKXLt7kv7Q"));
//        beginnerBack.add(new Exercise("Inverted Rows", begWeighLoss, "https://www.youtube.com/watch?v=GZbfZ033f74"));
//        beginnerBack.add(new Exercise("Back Extensions", begWeighLoss, "https://www.youtube.com/watch?v=PHNPjhqGmW0"));
//        beginnerBack.add(new Exercise("Superman", begWeighLoss, "https://www.youtube.com/watch?v=ccBHj9cNk4I"));
//        beginnerBack.add(new Exercise("T-Bar Rows", begWeighLoss, "https://www.youtube.com/watch?v=0D9XczUbG04"));
//        beginnerBack.add(new Exercise("Face Pulls", begWeighLoss, "https://www.youtube.com/watch?v=nFtS5SjHVY4"));
//        beginnerBack.add(new Exercise("Straight Arm Pulldowns", begWeighLoss, "https://www.youtube.com/watch?v=XXjVWtTD-x0"));
//        beginnerBack.add(new Exercise("Band Pull-Aparts", begWeighLoss, "https://www.youtube.com/watch?v=v3UOdTWwgIg"));
//        beginnerBack.add(new Exercise("One-Arm Dumbbell Rows", begWeighLoss, "https://www.youtube.com/watch?v=vURIm0Mkoao"));
//        beginnerBack.add(new Exercise("Renegade Rows", begWeighLoss, "https://www.youtube.com/watch?v=ysX5o8TZMl4"));
//        beginnerBack.add(new Exercise("Chest-Supported Rows", begWeighLoss, "https://www.youtube.com/watch?v=vvwU6wcjUvA"));
//        beginnerBack.add(new Exercise("Cable Face Pulls", begWeighLoss, "https://www.youtube.com/watch?v=NPzTGUpvQyg"));
//        beginnerBack.add(new Exercise("Scapular Retractions", begWeighLoss, "https://www.youtube.com/watch?v=kJUXGyfK_ts"));
//        beginnerBack.add(new Exercise("YTWL Raises", begWeighLoss, "https://www.youtube.com/watch?v=sBmJ0t0E1O4"));
//        beginnerBack.add(new Exercise("Prone Cobras", begWeighLoss, "https://www.youtube.com/watch?v=LT_dFRnmdGs"));
//        beginnerBack.add(new Exercise("Farmer's Walks", begWeighLoss, "https://www.youtube.com/watch?v=BvLkiYdUHUg"));
//        beginnerBack.add(new Exercise("Pull-Ups (with assistance)", begWeighLoss, "https://www.youtube.com/watch?v=VWf2Q-dUudM"));


        List<Exercise> beginnerChest = new ArrayList<>();
        beginnerChest.add(new Exercise("Push-Ups", begWeighLoss, "IODxDxX7oi4"));
        beginnerChest.add(new Exercise("Dumbbell Bench Press", begWeighLoss, "QsYre__-aro"));
        beginnerChest.add(new Exercise("Barbell Bench Press (with assistance)", begWeighLoss, "rT7DgCr-3pg"));
//        chestExercises.add(new Exercise("Chest Press Machine", "java array"));
//        chestExercises.add(new Exercise("Incline Dumbbell Bench Press", "java array"));
//        chestExercises.add(new Exercise("Incline Barbell Bench Press (with assistance)", "java array"));
//        chestExercises.add(new Exercise("Incline Chest Press Machine", "java array"));
//        chestExercises.add(new Exercise("Cable Chest Fly", "java array"));
//        chestExercises.add(new Exercise("Dumbbell Chest Fly", "java array"));
//        chestExercises.add(new Exercise("Seated Chest Press Machine", "java array"));
//        chestExercises.add(new Exercise("Wide Push-Ups", "java array"));
//        chestExercises.add(new Exercise("Diamond Push-Ups", "java array"));
//        chestExercises.add(new Exercise("Wall Push-Ups", "java array"));
//        chestExercises.add(new Exercise("Medicine Ball Chest Passes", "java array"));
//        chestExercises.add(new Exercise("Resistance Band Chest Press", "java array"));
//        chestExercises.add(new Exercise("Stability Ball Chest Press", "java array"));
//        chestExercises.add(new Exercise("Swiss Ball Dumbbell Press", "java array"));
//        chestExercises.add(new Exercise("Kettlebell Chest Press", "java array"));
//        chestExercises.add(new Exercise("Plyometric Push-Ups", "java array"));
//        chestExercises.add(new Exercise("Push-Ups with Feet Elevated", "java array"));



        List<Exercise> beginnerLeg = new ArrayList<>();
        beginnerLeg.add(new Exercise("Bodyweight Squats", begWeighLoss, "m0GcZ24pK6k"));
        beginnerLeg.add(new Exercise("Lunges", begWeighLoss, "3XDriUn0udo"));
        beginnerLeg.add(new Exercise("Box Jumps (with a low box)", begWeighLoss,"Z9Vw6MxOHP8"));
//        legExercises.add(new Exercise("Step-Ups", "java array"));
//        legExercises.add(new Exercise("Wall Sits", "java array"));
//        legExercises.add(new Exercise("Leg Press Machine (with light weight)", "java array"));
//        legExercises.add(new Exercise("Seated Leg Curl Machine", "java array"));
//        legExercises.add(new Exercise("Standing Calf Raises", "java array"));
//        legExercises.add(new Exercise("Seated Calf Raises", "java array"));
//        legExercises.add(new Exercise("Glute Bridges", "java array"));
//        legExercises.add(new Exercise("Hip Thrusts", "java array"));
//        legExercises.add(new Exercise("Single-Leg Deadlifts (with no weights)", "java array"));
//        legExercises.add(new Exercise("Clamshells", "java array"));
//        legExercises.add(new Exercise("Side-Lying Leg Lifts", "java array"));
//        legExercises.add(new Exercise("Fire Hydrants", "java array"));
//        legExercises.add(new Exercise("Jumping Jacks", "java array"));
//        legExercises.add(new Exercise("High Knees", "java array"));
//        legExercises.add(new Exercise("Butt Kicks", "java array"));
//        legExercises.add(new Exercise("Skater Jumps", "java array"));
//        legExercises.add(new Exercise("Plie Squats", "java array"));


        List<Exercise> beginnerAb = new ArrayList<>();
        beginnerAb.add(new Exercise("Plank", begWeighLoss, "ASdvN_XEl_c"));
        beginnerAb.add(new Exercise("Crunches", begWeighLoss, "A7Y2-G4zOUA"));
        beginnerAb.add(new Exercise("Reverse Crunches",begWeighLoss, "jgAyTBB4lm3I"));
//        abExercises.add(new Exercise("Bicycle Crunches", "java array"));
//        abExercises.add(new Exercise("Mountain Climbers", "java array"));
//        abExercises.add(new Exercise("Russian Twists", "java array"));
//        abExercises.add(new Exercise("Flutter Kicks", "java array"));
//        abExercises.add(new Exercise("Leg Raises", "java array"));
//        abExercises.add(new Exercise("Heel Touches", "java array"));
//        abExercises.add(new Exercise("Scissor Kicks", "java array"));

        List<Exercise> beginnerShoulder = new ArrayList<>();
        beginnerShoulder.add(new Exercise("Dumbbell Shoulder Press", begWeighLoss, "0JfYxMRsUCQ"));
        beginnerShoulder.add(new Exercise("Seated Dumbbell Lateral Raises", begWeighLoss, "nOx4hDCiZJE"));
        beginnerShoulder.add(new Exercise("Front Dumbbell Raises", begWeighLoss, "t7fuZ0KhDA"));
//        beginnerShoulder.add(new Exercise("Rear Dumbbell Raises", begWeightLoss, "java array"));
//        beginnerShoulder.add(new Exercise("Cable Face Pulls", begWeightLoss, "java array"));
//        beginnerShoulder.add(new Exercise("Bodyweight Shoulder Taps", begWeightLoss, "java array"));
//        beginnerShoulder.add(new Exercise("Plank with Shoulder Taps", begWeightLoss, "java array"));
//        beginnerShoulder.add(new Exercise("Push-Ups with Shoulder Taps", begWeightLoss, "java array"));
//        beginnerShoulder.add(new Exercise("Resistance Band Shoulder Press", begWeightLoss, "java array"));
//        beginnerShoulder.add(new Exercise("Resistance Band Lateral Raises", begWeightLoss, "java array"));




        if (fitnessLevel.equals("Beginner") && (hoursPerWeek.equals("1 day")) && (fitnessGoal.equals("Weight Loss"))) {

            RelativeLayout myLayout = findViewById(R.id.rl2);
            myLayout.setVisibility(View.INVISIBLE); // or View.GONE


            TextView exercise1Name = findViewById(R.id.exercise1_name);
            TextView exercise1Reps = findViewById(R.id.exercise1_reps);

            TextView exercise2Name = findViewById(R.id.exercise2_name);
            TextView exercise2Reps = findViewById(R.id.exercise2_reps);

            TextView exercise3Name = findViewById(R.id.exercise3_name);
            TextView exercise3Reps = findViewById(R.id.exercise3_reps);

            TextView exercise4Name = findViewById(R.id.exercise4_name);
            TextView exercise4Reps = findViewById(R.id.exercise4_reps);

            // Get the first exercise from the beginnerBack array
            Exercise exercise1 = beginnerBack.get(0);
            Exercise exercise2 = beginnerChest.get(0);
            Exercise exercise3 = beginnerLeg.get(0);
            Exercise exercise4 = beginnerAb.get(0);

            exercise1Name.setText(exercise1.getName());
            exercise1Reps.setText(begWeighLoss);

            exercise2Name.setText(exercise2.getName());
            exercise2Reps.setText(begWeighLoss);

            exercise3Name.setText(exercise3.getName());
            exercise3Reps.setText(begWeighLoss);

            exercise4Name.setText(exercise4.getName());
            exercise4Reps.setText(begWeighLoss);


            Intent intentVid = new Intent(this, VideoActivity.class);

            String videoId2 = exercise2.getVideoId(); // get the videoId string
            String videoId3 = exercise3.getVideoId(); // get the videoId string
            String videoId4 = exercise4.getVideoId(); // get the videoId string

            intentVid.putExtra("videoId2", videoId2); // pass the videoId string as an extra to the intent
            intentVid.putExtra("videoId3", videoId3); // pass the videoId string as an extra to the intent
            intentVid.putExtra("videoId4", videoId4); // pass the videoId string as an extra to the intent

            intentVid.putExtra("videoRunButtonId2", R.id.exercise2_video); // pass the ID of the button as an extra to the intent
            intentVid.putExtra("videoRunButtonId3", R.id.exercise3_video); // pass the ID of the button as an extra to the intent
            intentVid.putExtra("videoRunButtonId4", R.id.exercise4_video); // pass the ID of the button as an extra to the intent

            Button videoButton1 = findViewById(R.id.exercise1_video);
            videoButton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String videoId1 = exercise1.getVideoId();
                    intentVid.putExtra("videoId1", videoId1);
                    intentVid.putExtra("videoRunButtonId1", R.id.exercise1_video);
                    startActivity(intentVid); // start the VideoActivity
                }
            });

            Button videoButton2 = findViewById(R.id.exercise2_video);
            videoButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(intentVid); // start the VideoActivity
                }
            });

            Button videoButton3 = findViewById(R.id.exercise3_video);
            videoButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(intentVid); // start the VideoActivity
                }
            });

            Button videoButton4 = findViewById(R.id.exercise3_video);
            videoButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(intentVid); // start the VideoActivity
                }
            });

        } /*else if (fitnessLevel.equals("Beginner") && (hoursPerWeek.equals("2 days")) && (fitnessGoal.equals("Weight Loss"))) {

            TextView exercise1NameD2 = findViewById(R.id.exercise2_name);
            TextView exercise1RepsD2 = findViewById(R.id.exercise2_reps);

            // Get the first exercise from the beginnerBack array
            Exercise exercise2 = beginnerBack.get(0);

            exercise1NameD2.setText(exercise2.getName());
            exercise1RepsD2.setText(begWeighLoss);

            Intent intentVid = new Intent(this, VideoActivity.class);
            String videoId = exercise2.getVideoId(); // get the videoId string
            intentVid.putExtra("videoId", videoId); // pass the videoId string as an extra to the intent
            intentVid.putExtra("videoRunButtonId", R.id.exercise2_video); // pass the ID of the button as an extra to the intent
            Button videoButton = findViewById(R.id.exercise2_video);
            videoButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(intentVid); // start the VideoActivity
                }
            });
        } else if (fitnessLevel.equals("Beginner") && (hoursPerWeek.equals("3 days")) && (fitnessGoal.equals("Weight Loss"))) {

            TextView exercise3Name = findViewById(R.id.exercise3_name);
            TextView exercise3Reps = findViewById(R.id.exercise3_reps);

            // Get the first exercise from the beginnerBack array
            Exercise exercise3 = beginnerBack.get(0);

            exercise3Name.setText(exercise3.getName());
            exercise3Reps.setText(begWeighLoss);

            Intent intentVid = new Intent(this, VideoActivity.class);
            String videoId = exercise3.getVideoId(); // get the videoId string
            intentVid.putExtra("videoId", videoId); // pass the videoId string as an extra to the intent
            intentVid.putExtra("videoRunButtonId", R.id.exercise3_video); // pass the ID of the button as an extra to the intent
            Button videoButton = findViewById(R.id.exercise3_video);
            videoButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(intentVid); // start the VideoActivity
                }
            });
        } else if (fitnessLevel.equals("Beginner") && (hoursPerWeek.equals("5 days")) && (fitnessGoal.equals("Weight Loss"))) {

            TextView exercise4Name = findViewById(R.id.exercise4_name);
            TextView exercise4Reps = findViewById(R.id.exercise4_reps);

            // Get the first exercise from the beginnerBack array
            Exercise exercise4 = beginnerBack.get(0);

            exercise4Name.setText(exercise4.getName());
            exercise4Reps.setText(begWeighLoss);

            Intent intentVid = new Intent(this, VideoActivity.class);
            String videoId = exercise4.getVideoId(); // get the videoId string
            intentVid.putExtra("videoId", videoId); // pass the videoId string as an extra to the intent
            intentVid.putExtra("videoRunButtonId", R.id.exercise3_video); // pass the ID of the button as an extra to the intent
            Button videoButton = findViewById(R.id.exercise3_video);
            videoButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(intentVid); // start the VideoActivity
                }
            });*/
        }
    }

