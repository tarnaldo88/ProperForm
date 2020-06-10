package com.example.properform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Exercises extends AppCompatActivity {

    private ImageButton BtnMoveBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);

        BtnMoveBack = findViewById(R.id.backMainActivityBtn);



        BtnMoveBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                moveToMainActivity();
            }
        });
    }

    private void moveToMainActivity(){
        Intent goToMainActivity = new Intent(Exercises.this, ExerciseSelect.class);
        startActivity(goToMainActivity);;
    }
}
