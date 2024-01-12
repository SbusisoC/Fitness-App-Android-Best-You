package com.example.app4.ui.plan;

import static android.graphics.Color.BLACK;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.app4.R;

import java.util.Objects;

@SuppressWarnings("deprecation")
public class Monday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monday);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        TextView text1 = findViewById(R.id.textBarbellBenchPress2);
        TextView repText1 = findViewById(R.id.textReps3);
        TextView setText1 = findViewById(R.id.textSets1);
        ImageView workoutImage1 = findViewById(R.id.chest1);

        ImageView holoImageView = findViewById(R.id.holo);
        EditText editTextReps1 = findViewById(R.id.editTextReps);
        EditText editTextSets1 = findViewById(R.id.editTextSets);

        text1.setTextColor(BLACK);
        repText1.setTextColor(BLACK);
        setText1.setTextColor(BLACK);
        editTextReps1.setTextColor(BLACK);
        editTextSets1.setTextColor(BLACK);

        Intent intent = getIntent();
        String workout1Data = intent.getStringExtra("workout1");

        //Checking if the workout1Data is not null
        if (workout1Data != null){
            // Show the corresponding views (e.g., images) and set text based on the retrieved data
            holoImageView.setVisibility(View.VISIBLE);
            workoutImage1.setVisibility(View.VISIBLE);
            text1.setVisibility(View.VISIBLE);
            repText1.setVisibility(View.VISIBLE);
            setText1.setVisibility(View.VISIBLE);
            editTextSets1.setVisibility(View.VISIBLE);
            editTextReps1.setVisibility(View.VISIBLE);


            // Extracting only numeric values from the workout data
            String numericValues = workout1Data.replaceAll("[^\\d,]", "");

            // Splitting the numeric values into an array
            String[] valuesArray = numericValues.split(",");

            if (valuesArray.length >= 2) {
                // valuesArray[0] contains the reps and valuesArray[1] contains the sets
                editTextReps1.setText(valuesArray[0].trim());
                editTextSets1.setText(valuesArray[1].trim());
            }
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}