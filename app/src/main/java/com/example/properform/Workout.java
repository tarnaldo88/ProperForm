package com.example.properform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Workout extends AppCompatActivity {

    private ImageButton BtnMoveBack;
    private String [] selected = {"",""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        BtnMoveBack = findViewById(R.id.backMainActivityBtn);
        String bodyPt = getIntent().getStringExtra("bodyPart");
        String workout = getIntent().getStringExtra("workoutSelected");
        selected[0] = bodyPt;
        selected[1] = workout;

        BtnMoveBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                moveToBackActivity();
            }
        });
    }

    private void moveToBackActivity(){
        Intent moveToBackActivity = new Intent(Workout.this, Exercises.class);
        moveToBackActivity.putExtra("value", selected[0]);
        startActivity(moveToBackActivity);;
    }
}
