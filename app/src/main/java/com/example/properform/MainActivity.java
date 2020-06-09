package com.example.properform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton BtnMoveWrk, BtnMoveRtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnMoveRtn = findViewById(R.id.routineBtn);
        BtnMoveWrk = findViewById(R.id.ExercisesBtn);

        BtnMoveWrk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                moveToActivityExercises();
            }
        });

        BtnMoveRtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                moveToActivityRoutines();
            }
        });
    }

    private void moveToActivityExercises(){
        Intent goToExercises = new Intent(MainActivity.this, ExerciseSelect.class);
        startActivity(goToExercises);;
    }

    private void moveToActivityRoutines(){
        Intent goToRoutines = new Intent(MainActivity.this, RoutineSelect.class);
        startActivity(goToRoutines);;
    }
}
