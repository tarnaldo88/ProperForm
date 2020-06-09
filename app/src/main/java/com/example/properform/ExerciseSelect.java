package com.example.properform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ExerciseSelect extends AppCompatActivity {

    private ImageButton BtnMoveBack, BtnRotateBody, rotateToFront;
    private Button armBtn, chestBtn, legs, shoulder, back;
    static private int selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_select);

        BtnMoveBack = findViewById(R.id.backMainActivityBtn);
        BtnRotateBody = findViewById(R.id.RotateBtn);
        rotateToFront = findViewById(R.id.rotateFromBack);
        armBtn = findViewById(R.id.armBtn);
        chestBtn = findViewById(R.id.chestBtn);
        legs = findViewById(R.id.legBtn);
        shoulder = findViewById(R.id.shoulderBtn);
        back = findViewById(R.id.backBodyPt);

        BtnMoveBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                moveToMainActivity();
            }
        });

        //listener to activate button upon click by user, goes to back view page
        BtnRotateBody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                rotateBody();
            }
        });

        //listener to activate button upon click by user, turns body around
        rotateToFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                rotatetoFrontSide();
            }
        });

        //listeners to move to workout page
        armBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                armsToWorkout();
            }
        });

        chestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                chestToWorkout();
            }
        });

        legs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                legsToWorkout();
            }
        });

        //listener to activate button upon click by user, goes to shoulder page
        shoulder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                shoulderToWorkout();
            }
        });

        //listener to activate button upon click by user, goes to back page
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                backToWorkout();
            }
        });
    }

    private void moveToMainActivity(){
        Intent goToMainActivity = new Intent(ExerciseSelect.this, MainActivity.class);
        startActivity(goToMainActivity);;
    }
    private void legsToWorkout(){
        Intent goToWorkout = new Intent(ExerciseSelect.this, Exercises.class);
        goToWorkout.putExtra("value", "legs");
        startActivity(goToWorkout);
    }

    private void armsToWorkout(){
        Intent goToWorkout = new Intent(ExerciseSelect.this, Exercises.class);
        goToWorkout.putExtra("value", "arms");
        startActivity(goToWorkout);
    }

    private void chestToWorkout(){
        Intent goToWorkout = new Intent(ExerciseSelect.this, Exercises.class);
        goToWorkout.putExtra("value", "chest");
        startActivity(goToWorkout);
    }

    //function to move to workout lists page
    private void shoulderToWorkout(){
        Intent goToWorkout = new Intent(ExerciseSelect.this, Exercises.class);
        goToWorkout.putExtra("value", "shoulders");
        startActivity(goToWorkout);
    }

    private void backToWorkout(){
        Intent goToWorkout = new Intent(ExerciseSelect.this, Exercises.class);
        goToWorkout.putExtra("value", "back");
        startActivity(goToWorkout);
    }

    private void rotateBody(){
        legs.setVisibility(View.VISIBLE);
        chestBtn.setVisibility(View.VISIBLE);
        armBtn.setVisibility(View.VISIBLE);
        shoulder.setVisibility(View.GONE);
        back.setVisibility(View.GONE);
        BtnRotateBody.setVisibility(View.VISIBLE);
        rotateToFront.setVisibility(View.GONE);
    }

    private void rotatetoFrontSide(){
        legs.setVisibility(View.GONE);
        chestBtn.setVisibility(View.GONE);
        armBtn.setVisibility(View.GONE);
        shoulder.setVisibility(View.VISIBLE);
        back.setVisibility(View.VISIBLE);
        rotateToFront.setVisibility(View.VISIBLE);
        BtnRotateBody.setVisibility(View.GONE);
    }

}
