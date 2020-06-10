package com.example.properform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class RoutineSelect extends AppCompatActivity {

    private ImageButton BtnMoveBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine_select);

        BtnMoveBack = findViewById(R.id.backMainActivityBtn);


        BtnMoveBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                moveToMainActivity();
            }
        });
    }

    private void moveToMainActivity(){
        Intent goToMainActivity = new Intent(RoutineSelect.this, MainActivity.class);
        startActivity(goToMainActivity);;
    }
}
