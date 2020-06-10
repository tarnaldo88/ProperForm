package com.example.properform;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Exercises extends AppCompatActivity {

    private ImageButton BtnMoveBack;
    private ImageView area;
    /* five buttons as placeholders, during scaling it can be changed to a data structure that can be iterated through
        to alter the front end to reflect which workouts to display */
    private ImageButton firstBtn, secondBtn, thirdBtn, fourthBtn, fifthBtn;
    String[] chosenWorkout = {"",""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);

        BtnMoveBack = findViewById(R.id.backMainActivityBtn);
        firstBtn = findViewById(R.id.oneWork);
        secondBtn = findViewById(R.id.twobtn);
        thirdBtn = findViewById(R.id.threebtn);
        fourthBtn = findViewById(R.id.fourbtn);
        fifthBtn = findViewById(R.id.fifbtn);

        chosenWorkout[0] = getIntent().getStringExtra("value");

        //if statements determining which body part was selected
        if (chosenWorkout[0].compareTo("legs") == 0){
            legsExercises();
        } else if(chosenWorkout[0].compareTo("arms") == 0){
            armsExercises();
        } else if (chosenWorkout[0].compareTo("chest") == 0) {
            chestExerices();
        } else if (chosenWorkout[0].compareTo("shoulders") == 0){
            shoulderExercises();
        } else if (chosenWorkout[0].compareTo("back") == 0){
            backExercises();
        }

        BtnMoveBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                moveToMainActivity();
            }
        });

        firstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                chosenWorkout[1] = "first";
                goToExercise();
            }
        });
        secondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                chosenWorkout[1] = "second";
                goToExercise();
            }
        });
        thirdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                chosenWorkout[1] = "third";
                goToExercise();
            }
        });
        fourthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                chosenWorkout[1] = "fourth";
                goToExercise();
            }
        });
        fifthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                chosenWorkout[1] = "fifth";
                goToExercise();
            }
        });
    }

    private void moveToMainActivity(){
        Intent goToMainActivity = new Intent(Exercises.this, ExerciseSelect.class);
        startActivity(goToMainActivity);;
    }

    private void goToExercise(){
        Intent goToWorout = new Intent(Exercises.this, Workout.class);
        goToWorout.putExtra("workoutSelected", chosenWorkout);
        startActivity(goToWorout);
    }

    private void legsExercises(){
        //sets the title
        area.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.legs_title));
        //sets the buttons
        firstBtn.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.chest_press));
        secondBtn.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.incline_fly));
        thirdBtn.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.decline_press));
        fourthBtn.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.fly));
        fifthBtn.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.rev_fly));
    }

    private void armsExercises(){
        //sets the title
        area.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.arms_title));
        //sets the buttons
        firstBtn.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.chest_press));
        secondBtn.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.incline_fly));
        thirdBtn.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.decline_press));
        fourthBtn.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.fly));
        fifthBtn.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.rev_fly));
    }

    private void chestExerices(){
        //sets the title
        area.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.chest_title));
        //sets the buttons
        firstBtn.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.chest_press));
        secondBtn.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.incline_fly));
        thirdBtn.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.decline_press));
        fourthBtn.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.fly));
        fifthBtn.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.rev_fly));
    }

    private void shoulderExercises(){
        //sets the title
        area.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.shoulders_title));
        //sets the buttons
        firstBtn.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.chest_press));
        secondBtn.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.incline_fly));
        thirdBtn.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.decline_press));
        fourthBtn.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.fly));
        fifthBtn.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.rev_fly));
    }

    private void  backExercises(){
        //sets the title
        area.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.back_title));
        //sets the buttons
        firstBtn.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.chest_press));
        secondBtn.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.incline_fly));
        thirdBtn.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.decline_press));
        fourthBtn.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.fly));
        fifthBtn.setImageDrawable(ContextCompat.getDrawable(Exercises.this, R.drawable.rev_fly));
    }
}
