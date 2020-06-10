package com.example.properform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Workout extends AppCompatActivity {

    private ImageButton BtnMoveBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        BtnMoveBack = findViewById(R.id.backMainActivityBtn);

        BtnMoveBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                moveToBackActivity();
            }
        });
    }

    private void moveToBackActivity(){
        Intent moveToBackActivity = new Intent(Workout.this, Exercises.class);
        startActivity(moveToBackActivity);;
    }
}
