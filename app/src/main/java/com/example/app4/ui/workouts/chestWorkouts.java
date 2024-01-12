package com.example.app4.ui.workouts;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.WHITE;
import static android.view.View.VISIBLE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.app4.R;
import com.example.app4.WorkoutDatabaseHelper;
import com.example.app4.ui.plan.Friday;
import com.example.app4.ui.plan.Monday;
import com.example.app4.ui.plan.Saturday;
import com.example.app4.ui.plan.Sunday;
import com.example.app4.ui.plan.Thursday;
import com.example.app4.ui.plan.Tuesday;
import com.example.app4.ui.plan.Wednesday;

import java.util.Objects;

@SuppressWarnings("deprecation")
public class chestWorkouts extends AppCompatActivity {

    private CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7,
            checkBox8, checkBox9, checkBox10, checkBox11;

    private EditText numberOfSets, numberOfSets2, numberOfSets3, numberOfSets4, numberOfSets5,
            numberOfSets6, numberOfSets7, numberOfSets8, numberOfSets9, numberOfSets10, numberOfSets11;

    private EditText numberOfReps, numberOfReps2, numberOfReps3, numberOfReps4, numberOfReps5, numberOfReps6,
            numberOfReps7, numberOfReps8, numberOfReps9, numberOfReps10, numberOfReps11;

    private WorkoutDatabaseHelper dbHelper;

    private Button doneButton;

    private TextView dayTextView;
    private int currentDayIndex = 0;
    private String[] daysOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_workouts);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        dbHelper = new WorkoutDatabaseHelper(this);

        TextView text1 = findViewById(R.id.textBarbellBenchPress);
        TextView text2 = findViewById(R.id.textInclineBarbellPress);
        TextView text3 = findViewById(R.id.textDeclineBarbellPress);
        TextView text4 = findViewById(R.id.textDumbbellBenchPress);
        TextView text5 = findViewById(R.id.textInclineDumbbellPress);
        TextView text6 = findViewById(R.id.textDeclineDumbbellPress);
        TextView text7 = findViewById(R.id.textCloseGripDumbbellPress);
        TextView text8 = findViewById(R.id.textPecDeck);
        TextView text9 = findViewById(R.id.textPecDeckChestFly);
        TextView text10 = findViewById(R.id.textCableChestFly);
        TextView text11 = findViewById(R.id.textChestPress);

        TextView repText1 = findViewById(R.id.textReps1);
        TextView setText1 = findViewById(R.id.textSets1);
        TextView repText2 = findViewById(R.id.textReps2);
        TextView setText2 = findViewById(R.id.textSets2);
        TextView repText3 = findViewById(R.id.textReps3);
        TextView setText3 = findViewById(R.id.textSets3);
        TextView repText4 = findViewById(R.id.textReps4);
        TextView setText4 = findViewById(R.id.textSets4);
        TextView repText5 = findViewById(R.id.textReps5);
        TextView setText5 = findViewById(R.id.textSets5);
        TextView repText6 = findViewById(R.id.textReps6);
        TextView setText6 = findViewById(R.id.textSets6);
        TextView repText7 = findViewById(R.id.textReps7);
        TextView setText7 = findViewById(R.id.textSets7);
        TextView repText8 = findViewById(R.id.textReps8);
        TextView setText8 = findViewById(R.id.textSets8);
        TextView repText9 = findViewById(R.id.textReps9);
        TextView setText9 = findViewById(R.id.textSets9);
        TextView repText10 = findViewById(R.id.textReps10);
        TextView setText10 = findViewById(R.id.textSets10);
        TextView repText11 = findViewById(R.id.textReps11);
        TextView setText11 = findViewById(R.id.textSets11);


        numberOfReps = findViewById(R.id.editTextReps);
        numberOfSets = findViewById(R.id.editTextSets);
        numberOfReps2 = findViewById(R.id.editTextReps2);
        numberOfSets2 = findViewById(R.id.editTextSets2);
        numberOfReps3 = findViewById(R.id.editTextReps3);
        numberOfSets3 = findViewById(R.id.editTextSets3);
        numberOfReps4 = findViewById(R.id.editTextReps4);
        numberOfSets4 = findViewById(R.id.editTextSets4);
        numberOfReps5 = findViewById(R.id.editTextReps5);
        numberOfSets5 = findViewById(R.id.editTextSets5);
        numberOfReps6 = findViewById(R.id.editTextReps6);
        numberOfSets6 = findViewById(R.id.editTextSets6);
        numberOfReps7 = findViewById(R.id.editTextReps7);
        numberOfSets7 = findViewById(R.id.editTextSets7);
        numberOfReps8 = findViewById(R.id.editTextReps8);
        numberOfSets8 = findViewById(R.id.editTextSets8);
        numberOfReps9 = findViewById(R.id.editTextReps9);
        numberOfSets9 = findViewById(R.id.editTextSets9);
        numberOfReps10 = findViewById(R.id.editTextReps10);
        numberOfSets10 = findViewById(R.id.editTextSets10);
        numberOfReps11 = findViewById(R.id.editTextReps11);
        numberOfSets11 = findViewById(R.id.editTextSets11);

        checkBox1 = findViewById(R.id.checkBoxExerciseSelection);
        checkBox2 = findViewById(R.id.checkBoxExerciseSelection2);
        checkBox3 = findViewById(R.id.checkBoxExerciseSelection3);
        checkBox4 = findViewById(R.id.checkBoxExerciseSelection4);
        checkBox5 = findViewById(R.id.checkBoxExerciseSelection5);
        checkBox6 = findViewById(R.id.checkBoxExerciseSelection6);
        checkBox7 = findViewById(R.id.checkBoxExerciseSelection7);
        checkBox8 = findViewById(R.id.checkBoxExerciseSelection8);
        checkBox9 = findViewById(R.id.checkBoxExerciseSelection9);
        checkBox10 = findViewById(R.id.checkBoxExerciseSelection10);
        checkBox11 = findViewById(R.id.checkBoxExerciseSelection11);

        dayTextView = findViewById(R.id.dayTextView);

        // Update the initial day
        updateDay();

        // Find the arrow image views
        ImageView leftArrow = findViewById(R.id.leftArrow);
        ImageView rightArrow = findViewById(R.id.rightArrow);

        text1.setTextColor(BLACK);
        text2.setTextColor(BLACK);
        text3.setTextColor(BLACK);
        text4.setTextColor(BLACK);
        text5.setTextColor(BLACK);
        text6.setTextColor(BLACK);
        text7.setTextColor(BLACK);
        text8.setTextColor(BLACK);
        text9.setTextColor(BLACK);
        text10.setTextColor(BLACK);
        text11.setTextColor(BLACK);

        repText1.setTextColor(BLACK);
        setText1.setTextColor(BLACK);

        repText2.setTextColor(BLACK);
        setText2.setTextColor(BLACK);

        repText3.setTextColor(BLACK);
        setText3.setTextColor(BLACK);

        repText4.setTextColor(BLACK);
        setText4.setTextColor(BLACK);

        repText5.setTextColor(BLACK);
        setText5.setTextColor(BLACK);

        repText6.setTextColor(BLACK);
        setText6.setTextColor(BLACK);

        repText7.setTextColor(BLACK);
        setText7.setTextColor(BLACK);

        repText8.setTextColor(BLACK);
        setText8.setTextColor(BLACK);

        repText9.setTextColor(BLACK);
        setText9.setTextColor(BLACK);

        repText10.setTextColor(BLACK);
        setText10.setTextColor(BLACK);

        repText11.setTextColor(BLACK);
        setText11.setTextColor(BLACK);

        numberOfReps.setTextColor(BLACK);
        numberOfSets.setTextColor(BLACK);
        numberOfReps2.setTextColor(BLACK);
        numberOfSets2.setTextColor(BLACK);
        numberOfReps3.setTextColor(BLACK);
        numberOfSets3.setTextColor(BLACK);
        numberOfReps4.setTextColor(BLACK);
        numberOfSets4.setTextColor(BLACK);
        numberOfReps5.setTextColor(BLACK);
        numberOfSets5.setTextColor(BLACK);
        numberOfReps6.setTextColor(BLACK);
        numberOfSets6.setTextColor(BLACK);
        numberOfReps7.setTextColor(BLACK);
        numberOfSets7.setTextColor(BLACK);
        numberOfReps8.setTextColor(BLACK);
        numberOfSets8.setTextColor(BLACK);
        numberOfReps9.setTextColor(BLACK);
        numberOfSets9.setTextColor(BLACK);
        numberOfReps10.setTextColor(BLACK);
        numberOfSets10.setTextColor(BLACK);
        numberOfReps11.setTextColor(BLACK);
        numberOfSets11.setTextColor(BLACK);

        dayTextView.setTextColor(WHITE);

        doneButton = findViewById(R.id.doneButton);


        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertWorkoutsIntoDatabase();
                // Add code for any other actions you want to perform after clicking "Done"
            }
        });

        // Set click listeners for arrow images
        leftArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrementDay();
                updateDay();
            }
        });

        rightArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementDay();
                updateDay();
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void insertWorkoutsIntoDatabase() {
        //Get the selected day
        String selectedDay = daysOfWeek[currentDayIndex];

        // Initialize the intent variable with a default value
        Intent intent = new Intent(this, Sunday.class);

        //An Intent with the appropriate day activity class

        switch (selectedDay) {
            case "Sun":
                intent = new Intent(this, Sunday.class);
                /*dayActivityClass = Sunday.class;*/
                break;
            case "Mon":
                intent = new Intent(this, Monday.class);
                /*dayActivityClass = Monday.class;*/
                break;
            case "Tue":
                intent = new Intent(this, Tuesday.class);
                /*dayActivityClass = Tuesday.class;*/
                break;
            case "Wed":
                intent = new Intent(this, Wednesday.class);
                /*dayActivityClass = Wednesday.class;*/
                break;
            case "Thu":
                intent = new Intent(this, Thursday.class);
                /*dayActivityClass = Thursday.class;*/
                break;
            case "Fri":
                intent = new Intent(this, Friday.class);
                /*dayActivityClass = Friday.class;*/
                break;
            case "Sat":
                intent = new Intent(this, Saturday.class);
                /*dayActivityClass = Saturday.class;*/
                break;
        }


        //Passing workout data to the day activity
        if (checkBox1.isChecked()) {
            dbHelper.insertWorkout("Barbell Bench Press", numberOfReps.getText().toString(), numberOfSets.getText().toString());
            intent.putExtra("workout1", "Barbell Bench Press: Reps - " + numberOfReps.getText().toString() + ", Sets - " + numberOfSets.getText().toString());
        }
        if (checkBox2.isChecked()) {
            dbHelper.insertWorkout("Incline Barbell Press", numberOfReps2.getText().toString(), numberOfSets2.getText().toString());
            intent.putExtra("workout2", "Incline Barbell Press: Reps - " + numberOfReps.getText().toString() + ", Sets - " + numberOfSets.getText().toString());
        }
        if (checkBox3.isChecked()) {
            dbHelper.insertWorkout("Decline Barbell Press", numberOfReps.getText().toString(), numberOfSets3.getText().toString());
            intent.putExtra("workout3", "Decline Barbell Press: Reps - " + numberOfReps.getText().toString() + ", Sets - " + numberOfSets.getText().toString());
        }
        if (checkBox4.isChecked()) {
            dbHelper.insertWorkout("Dumbbell Bench Press", numberOfReps4.getText().toString(), numberOfSets4.getText().toString());
            intent.putExtra("workout4", "Dumbbell Bench Press: Reps - " + numberOfReps.getText().toString() + ", Sets - " + numberOfSets.getText().toString());

        }
        if (checkBox5.isChecked()) {
            dbHelper.insertWorkout("Incline Dumbbell Press", numberOfReps5.getText().toString(), numberOfSets5.getText().toString());
            intent.putExtra("workout5", "Incline Dumbbell Press: Reps - " + numberOfReps.getText().toString() + ", Sets - " + numberOfSets.getText().toString());
        }
        if (checkBox6.isChecked()) {
            dbHelper.insertWorkout("Dumbbell Decline Press", numberOfReps6.getText().toString(), numberOfSets6.getText().toString());
            intent.putExtra("workout6", "Dumbbell Decline Press: Reps - " + numberOfReps.getText().toString() + ", Sets - " + numberOfSets.getText().toString());
        }
        if (checkBox7.isChecked()) {
            dbHelper.insertWorkout("Close Grip Press", numberOfReps7.getText().toString(), numberOfSets7.getText().toString());
            intent.putExtra("workout7", "Close Grip Press: Reps - " + numberOfReps.getText().toString() + ", Sets - " + numberOfSets.getText().toString());
        }
        if (checkBox8.isChecked()) {
            dbHelper.insertWorkout("Pec Deck", numberOfReps8.getText().toString(), numberOfSets8.getText().toString());
            intent.putExtra("workout8", "Pec Deck: Reps - " + numberOfReps.getText().toString() + ", Sets - " + numberOfSets.getText().toString());
        }
        if (checkBox9.isChecked()) {
            dbHelper.insertWorkout("Chest Fly", numberOfReps9.getText().toString(), numberOfSets9.getText().toString());
            intent.putExtra("workout9", "Chest Fly: Reps - " + numberOfReps.getText().toString() + ", Sets - " + numberOfSets.getText().toString());
        }
        if (checkBox10.isChecked()) {
            dbHelper.insertWorkout("Cable Chest Fly", numberOfReps10.getText().toString(), numberOfSets10.getText().toString());
            intent.putExtra("workout10", "Pec Deck Chest Fly: Reps - " + numberOfReps.getText().toString() + ", Sets - " + numberOfSets.getText().toString());
        }
        if (checkBox11.isChecked()) {
            dbHelper.insertWorkout("Chest Press", numberOfReps11.getText().toString(), numberOfSets11.getText().toString());
            intent.putExtra("workout11", "Chest Press: Reps - " + numberOfReps.getText().toString() + ", Sets - " + numberOfSets.getText().toString());
        }
        startActivity(intent);
    }

    private void decrementDay() {
        currentDayIndex = (currentDayIndex - 1 + daysOfWeek.length) % daysOfWeek.length;
    }

    private void incrementDay() {
        currentDayIndex = (currentDayIndex + 1) % daysOfWeek.length;
    }

    private void updateDay() {
        dayTextView.setText(daysOfWeek[currentDayIndex]);
    }
}