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

import org.w3c.dom.Text;

import java.util.Objects;

@SuppressWarnings("deprecation")
public class Monday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monday);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        TextView text1 = findViewById(R.id.textBarbellBenchPress2);
        TextView text2 = findViewById(R.id.textInclineBenchPress2);
        TextView text3 = findViewById(R.id.textDeclineBenchPress3);
        TextView text4 = findViewById(R.id.textDumbbellBenchPress4);
        TextView text5 = findViewById(R.id.textDumbbellInclinePress5);
        TextView text6 = findViewById(R.id.textDumbbellDeclinePress2);
        TextView text7 = findViewById(R.id.textCloseGripBench2);
        TextView text8 = findViewById(R.id.textPecDeck2);
        TextView text9 = findViewById(R.id.textChestFly2);
        TextView text10 = findViewById(R.id.textCableChestFly2);
        TextView text11 = findViewById(R.id.textChestPress2);


        TextView repText1 = findViewById(R.id.textReps3);
        TextView setText1 = findViewById(R.id.textSets1);

        ImageView workoutImage1 = findViewById(R.id.chest1);
        ImageView workoutImage2 = findViewById(R.id.chest2);
        ImageView workoutImage3 = findViewById(R.id.chest3);
        ImageView workoutImage4 = findViewById(R.id.chest4);
        ImageView workoutImage5 = findViewById(R.id.chest5);
        ImageView workoutImage6 = findViewById(R.id.chest6);
        ImageView workoutImage7 = findViewById(R.id.chest7);
        ImageView workoutImage8 = findViewById(R.id.chest8);
        ImageView workoutImage9 = findViewById(R.id.chest9);
        ImageView workoutImage10 = findViewById(R.id.chest10);
        ImageView workoutImage11 = findViewById(R.id.chest11);

        ImageView holoImageView = findViewById(R.id.holo);
        EditText editTextReps1 = findViewById(R.id.editTextReps);
        EditText editTextSets1 = findViewById(R.id.editTextSets);
        EditText editTextReps2 = findViewById(R.id.editTextReps2);
        EditText editTextSets2 = findViewById(R.id.editTextSets2);
        EditText editTextReps3 = findViewById(R.id.editTextReps3);
        EditText editTextSets3 = findViewById(R.id.editTextSets3);
        EditText editTextReps4 = findViewById(R.id.editTextReps4);
        EditText editTextSets4 = findViewById(R.id.editTextSets4);
        EditText editTextReps5 = findViewById(R.id.editTextReps5);
        EditText editTextSets5 = findViewById(R.id.editTextSets5);
        EditText editTextReps6 = findViewById(R.id.editTextReps6);
        EditText editTextSets6 = findViewById(R.id.editTextSets6);
        EditText editTextReps7 = findViewById(R.id.editTextReps7);
        EditText editTextSets7 = findViewById(R.id.editTextSets7);
        EditText editTextReps8 = findViewById(R.id.editTextReps8);
        EditText editTextSets8 = findViewById(R.id.editTextSets8);
        EditText editTextReps9 = findViewById(R.id.editTextReps9);
        EditText editTextSets9 = findViewById(R.id.editTextSets9);
        EditText editTextReps10 = findViewById(R.id.editTextReps10);
        EditText editTextSets10 = findViewById(R.id.editTextSets10);
        EditText editTextReps11 = findViewById(R.id.editTextReps11);
        EditText editTextSets11 = findViewById(R.id.editTextSets11);

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
        editTextReps1.setTextColor(BLACK);
        editTextSets1.setTextColor(BLACK);
        editTextReps2.setTextColor(BLACK);
        editTextSets2.setTextColor(BLACK);
        editTextReps3.setTextColor(BLACK);
        editTextSets3.setTextColor(BLACK);
        editTextReps4.setTextColor(BLACK);
        editTextSets4.setTextColor(BLACK);
        editTextReps5.setTextColor(BLACK);
        editTextSets5.setTextColor(BLACK);
        editTextReps6.setTextColor(BLACK);
        editTextSets6.setTextColor(BLACK);
        editTextReps7.setTextColor(BLACK);
        editTextSets7.setTextColor(BLACK);
        editTextReps8.setTextColor(BLACK);
        editTextSets8.setTextColor(BLACK);
        editTextReps9.setTextColor(BLACK);
        editTextSets9.setTextColor(BLACK);
        editTextReps10.setTextColor(BLACK);
        editTextSets10.setTextColor(BLACK);
        editTextReps11.setTextColor(BLACK);
        editTextSets11.setTextColor(BLACK);

        Intent intent = getIntent();
        String workout1Data = intent.getStringExtra("workout1");
        String workout2Data = intent.getStringExtra("workout2");
        String workout3Data = intent.getStringExtra("workout3");
        String workout4Data = intent.getStringExtra("workout4");
        String workout5Data = intent.getStringExtra("workout5");
        String workout6Data = intent.getStringExtra("workout6");
        String workout7Data = intent.getStringExtra("workout7");
        String workout8Data = intent.getStringExtra("workout8");
        String workout9Data = intent.getStringExtra("workout9");
        String workout10Data = intent.getStringExtra("workout10");
        String workout11Data = intent.getStringExtra("workout11");

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

        if (workout2Data != null){
            // Show the corresponding views (e.g., images) and set text based on the retrieved data
            holoImageView.setVisibility(View.VISIBLE);
            workoutImage2.setVisibility(View.VISIBLE);
            text2.setVisibility(View.VISIBLE);
            repText1.setVisibility(View.VISIBLE);
            setText1.setVisibility(View.VISIBLE);
            editTextSets1.setVisibility(View.VISIBLE);
            editTextReps1.setVisibility(View.VISIBLE);


            // Extracting only numeric values from the workout data
            String numericValues = workout2Data.replaceAll("[^\\d,]", "");

            // Splitting the numeric values into an array
            String[] valuesArray = numericValues.split(",");

            if (valuesArray.length >= 2) {
                // valuesArray[0] contains the reps and valuesArray[1] contains the sets
                editTextReps2.setText(valuesArray[0].trim());
                editTextSets2.setText(valuesArray[1].trim());
            }
        }

        if (workout3Data != null){
            // Show the corresponding views (e.g., images) and set text based on the retrieved data
            holoImageView.setVisibility(View.VISIBLE);
            workoutImage3.setVisibility(View.VISIBLE);
            text3.setVisibility(View.VISIBLE);
            repText1.setVisibility(View.VISIBLE);
            setText1.setVisibility(View.VISIBLE);
            editTextSets3.setVisibility(View.VISIBLE);
            editTextReps3.setVisibility(View.VISIBLE);


            // Extracting only numeric values from the workout data
            String numericValues = workout3Data.replaceAll("[^\\d,]", "");

            // Splitting the numeric values into an array
            String[] valuesArray = numericValues.split(",");

            if (valuesArray.length >= 2) {
                // valuesArray[0] contains the reps and valuesArray[1] contains the sets
                editTextReps3.setText(valuesArray[0].trim());
                editTextSets3.setText(valuesArray[1].trim());
            }
        }
        if (workout4Data != null){
            // Show the corresponding views (e.g., images) and set text based on the retrieved data
            holoImageView.setVisibility(View.VISIBLE);
            workoutImage4.setVisibility(View.VISIBLE);
            text4.setVisibility(View.VISIBLE);
            repText1.setVisibility(View.VISIBLE);
            setText1.setVisibility(View.VISIBLE);
            editTextSets4.setVisibility(View.VISIBLE);
            editTextReps4.setVisibility(View.VISIBLE);


            // Extracting only numeric values from the workout data
            String numericValues = workout4Data.replaceAll("[^\\d,]", "");

            // Splitting the numeric values into an array
            String[] valuesArray = numericValues.split(",");

            if (valuesArray.length >= 2) {
                // valuesArray[0] contains the reps and valuesArray[1] contains the sets
                editTextReps4.setText(valuesArray[0].trim());
                editTextSets4.setText(valuesArray[1].trim());
            }
        }
        if (workout5Data != null){
            // Show the corresponding views (e.g., images) and set text based on the retrieved data
            holoImageView.setVisibility(View.VISIBLE);
            workoutImage5.setVisibility(View.VISIBLE);
            text2.setVisibility(View.VISIBLE);
            repText1.setVisibility(View.VISIBLE);
            setText1.setVisibility(View.VISIBLE);
            editTextSets1.setVisibility(View.VISIBLE);
            editTextReps1.setVisibility(View.VISIBLE);


            // Extracting only numeric values from the workout data
            String numericValues = workout5Data.replaceAll("[^\\d,]", "");

            // Splitting the numeric values into an array
            String[] valuesArray = numericValues.split(",");

            if (valuesArray.length >= 2) {
                // valuesArray[0] contains the reps and valuesArray[1] contains the sets
                editTextReps1.setText(valuesArray[0].trim());
                editTextSets1.setText(valuesArray[1].trim());
            }
        }

        if (workout6Data != null){
            // Show the corresponding views (e.g., images) and set text based on the retrieved data
            holoImageView.setVisibility(View.VISIBLE);
            workoutImage6.setVisibility(View.VISIBLE);
            text6.setVisibility(View.VISIBLE);
            repText1.setVisibility(View.VISIBLE);
            setText1.setVisibility(View.VISIBLE);
            editTextSets6.setVisibility(View.VISIBLE);
            editTextReps6.setVisibility(View.VISIBLE);


            // Extracting only numeric values from the workout data
            String numericValues = workout6Data.replaceAll("[^\\d,]", "");

            // Splitting the numeric values into an array
            String[] valuesArray = numericValues.split(",");

            if (valuesArray.length >= 2) {
                // valuesArray[0] contains the reps and valuesArray[1] contains the sets
                editTextReps6.setText(valuesArray[0].trim());
                editTextSets6.setText(valuesArray[1].trim());
            }
        }

        if (workout7Data != null){
            // Show the corresponding views (e.g., images) and set text based on the retrieved data
            holoImageView.setVisibility(View.VISIBLE);
            workoutImage7.setVisibility(View.VISIBLE);
            text7.setVisibility(View.VISIBLE);
            repText1.setVisibility(View.VISIBLE);
            setText1.setVisibility(View.VISIBLE);
            editTextSets7.setVisibility(View.VISIBLE);
            editTextReps7.setVisibility(View.VISIBLE);


            // Extracting only numeric values from the workout data
            String numericValues = workout7Data.replaceAll("[^\\d,]", "");

            // Splitting the numeric values into an array
            String[] valuesArray = numericValues.split(",");

            if (valuesArray.length >= 2) {
                // valuesArray[0] contains the reps and valuesArray[1] contains the sets
                editTextReps7.setText(valuesArray[0].trim());
                editTextSets7.setText(valuesArray[1].trim());
            }
        }

        if (workout8Data != null){
            // Show the corresponding views (e.g., images) and set text based on the retrieved data
            holoImageView.setVisibility(View.VISIBLE);
            workoutImage8.setVisibility(View.VISIBLE);
            text8.setVisibility(View.VISIBLE);
            repText1.setVisibility(View.VISIBLE);
            setText1.setVisibility(View.VISIBLE);
            editTextSets8.setVisibility(View.VISIBLE);
            editTextReps8.setVisibility(View.VISIBLE);


            // Extracting only numeric values from the workout data
            String numericValues = workout8Data.replaceAll("[^\\d,]", "");

            // Splitting the numeric values into an array
            String[] valuesArray = numericValues.split(",");

            if (valuesArray.length >= 2) {
                // valuesArray[0] contains the reps and valuesArray[1] contains the sets
                editTextReps8.setText(valuesArray[0].trim());
                editTextSets8.setText(valuesArray[1].trim());
            }
        }

        if (workout9Data != null){
            // Show the corresponding views (e.g., images) and set text based on the retrieved data
            holoImageView.setVisibility(View.VISIBLE);
            workoutImage9.setVisibility(View.VISIBLE);
            text9.setVisibility(View.VISIBLE);
            repText1.setVisibility(View.VISIBLE);
            setText1.setVisibility(View.VISIBLE);
            editTextSets9.setVisibility(View.VISIBLE);
            editTextReps9.setVisibility(View.VISIBLE);


            // Extracting only numeric values from the workout data
            String numericValues = workout9Data.replaceAll("[^\\d,]", "");

            // Splitting the numeric values into an array
            String[] valuesArray = numericValues.split(",");

            if (valuesArray.length >= 2) {
                // valuesArray[0] contains the reps and valuesArray[1] contains the sets
                editTextReps9.setText(valuesArray[0].trim());
                editTextSets9.setText(valuesArray[1].trim());
            }
        }

        if (workout10Data != null){
            // Show the corresponding views (e.g., images) and set text based on the retrieved data
            holoImageView.setVisibility(View.VISIBLE);
            workoutImage10.setVisibility(View.VISIBLE);
            text10.setVisibility(View.VISIBLE);
            repText1.setVisibility(View.VISIBLE);
            setText1.setVisibility(View.VISIBLE);
            editTextSets10.setVisibility(View.VISIBLE);
            editTextReps10.setVisibility(View.VISIBLE);


            // Extracting only numeric values from the workout data
            String numericValues = workout10Data.replaceAll("[^\\d,]", "");

            // Splitting the numeric values into an array
            String[] valuesArray = numericValues.split(",");

            if (valuesArray.length >= 2) {
                // valuesArray[0] contains the reps and valuesArray[1] contains the sets
                editTextReps10.setText(valuesArray[0].trim());
                editTextSets10.setText(valuesArray[1].trim());
            }
        }

        if (workout11Data != null){
            // Show the corresponding views (e.g., images) and set text based on the retrieved data
            holoImageView.setVisibility(View.VISIBLE);
            workoutImage11.setVisibility(View.VISIBLE);
            text11.setVisibility(View.VISIBLE);
            repText1.setVisibility(View.VISIBLE);
            setText1.setVisibility(View.VISIBLE);
            editTextSets11.setVisibility(View.VISIBLE);
            editTextReps11.setVisibility(View.VISIBLE);


            // Extracting only numeric values from the workout data
            String numericValues = workout11Data.replaceAll("[^\\d,]", "");

            // Splitting the numeric values into an array
            String[] valuesArray = numericValues.split(",");

            if (valuesArray.length >= 2) {
                // valuesArray[0] contains the reps and valuesArray[1] contains the sets
                editTextReps11.setText(valuesArray[0].trim());
                editTextSets11.setText(valuesArray[1].trim());
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