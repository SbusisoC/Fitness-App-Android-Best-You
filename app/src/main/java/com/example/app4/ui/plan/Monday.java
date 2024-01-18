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

    // Define variables to track the current workout index
    private int currentWorkoutIndex = 0;

    // Array to store workout data
    private String[] workoutDataArray = new String[11];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monday);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        // Populate the workoutDataArray with the workout data
        workoutDataArray[0] = getIntent().getStringExtra("workout1");
        workoutDataArray[1] = getIntent().getStringExtra("workout2");
        workoutDataArray[2] = getIntent().getStringExtra("workout3");
        workoutDataArray[3] = getIntent().getStringExtra("workout4");
        workoutDataArray[4] = getIntent().getStringExtra("workout5");
        workoutDataArray[5] = getIntent().getStringExtra("workout6");
        workoutDataArray[6] = getIntent().getStringExtra("workout7");
        workoutDataArray[7] = getIntent().getStringExtra("workout8");
        workoutDataArray[8] = getIntent().getStringExtra("workout9");
        workoutDataArray[9] = getIntent().getStringExtra("workout10");
        workoutDataArray[10] = getIntent().getStringExtra("workout11");


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
        TextView repText2 = findViewById(R.id.textReps2);
        TextView setText2 = findViewById(R.id.textSets2);
        TextView repText3 = findViewById(R.id.textReps33);
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

        TextView workoutIsSet1 = findViewById(R.id.workoutSet1);
        TextView workoutIsSet2 = findViewById(R.id.workoutSet2);

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

        ImageView rightImage = findViewById(R.id.imageView23);
        ImageView leftImage = findViewById(R.id.imageView24);

        ImageView holoImageView = findViewById(R.id.holo);
        ImageView holoImageView2 = findViewById(R.id.holo2);
        ImageView holoImageView3 = findViewById(R.id.holo3);
        ImageView holoImageView4 = findViewById(R.id.holo4);
        ImageView holoImageView5 = findViewById(R.id.holo5);
        ImageView holoImageView6 = findViewById(R.id.holo6);
        ImageView holoImageView7 = findViewById(R.id.holo7);
        ImageView holoImageView8 = findViewById(R.id.holo8);
        ImageView holoImageView9 = findViewById(R.id.holo9);
        ImageView holoImageView10 = findViewById(R.id.holo10);
        ImageView holoImageView11 = findViewById(R.id.holo11);

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

        workoutIsSet1.setTextColor(BLACK);
        workoutIsSet2.setTextColor(BLACK);

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
        if (workout1Data != null) {
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

        if (workout2Data != null) {
            // Show the corresponding views (e.g., images) and set text based on the retrieved data
            holoImageView2.setVisibility(View.VISIBLE);
            workoutImage2.setVisibility(View.VISIBLE);
            text2.setVisibility(View.VISIBLE);
            repText2.setVisibility(View.VISIBLE);
            setText2.setVisibility(View.VISIBLE);
            editTextSets2.setVisibility(View.VISIBLE);
            editTextReps2.setVisibility(View.VISIBLE);


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

        if (workout3Data != null) {
            // Show the corresponding views (e.g., images) and set text based on the retrieved data
            holoImageView3.setVisibility(View.VISIBLE);
            workoutImage3.setVisibility(View.VISIBLE);
            text3.setVisibility(View.VISIBLE);
            repText3.setVisibility(View.VISIBLE);
            setText3.setVisibility(View.VISIBLE);
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
        if (workout4Data != null) {
            // Show the corresponding views (e.g., images) and set text based on the retrieved data
            holoImageView4.setVisibility(View.VISIBLE);
            workoutImage4.setVisibility(View.VISIBLE);
            text4.setVisibility(View.VISIBLE);
            repText4.setVisibility(View.VISIBLE);
            setText4.setVisibility(View.VISIBLE);
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
        if (workout5Data != null) {
            // Show the corresponding views (e.g., images) and set text based on the retrieved data
            holoImageView5.setVisibility(View.VISIBLE);
            workoutImage5.setVisibility(View.VISIBLE);
            text5.setVisibility(View.VISIBLE);
            repText5.setVisibility(View.VISIBLE);
            setText5.setVisibility(View.VISIBLE);
            editTextSets5.setVisibility(View.VISIBLE);
            editTextReps5.setVisibility(View.VISIBLE);


            // Extracting only numeric values from the workout data
            String numericValues = workout5Data.replaceAll("[^\\d,]", "");

            // Splitting the numeric values into an array
            String[] valuesArray = numericValues.split(",");

            if (valuesArray.length >= 2) {
                // valuesArray[0] contains the reps and valuesArray[1] contains the sets
                editTextReps5.setText(valuesArray[0].trim());
                editTextSets5.setText(valuesArray[1].trim());
            }
        }

        if (workout6Data != null) {
            // Show the corresponding views (e.g., images) and set text based on the retrieved data
            holoImageView6.setVisibility(View.VISIBLE);
            workoutImage6.setVisibility(View.VISIBLE);
            text6.setVisibility(View.VISIBLE);
            repText6.setVisibility(View.VISIBLE);
            setText6.setVisibility(View.VISIBLE);
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

        if (workout7Data != null) {
            // Show the corresponding views (e.g., images) and set text based on the retrieved data
            holoImageView7.setVisibility(View.VISIBLE);
            workoutImage7.setVisibility(View.VISIBLE);
            text7.setVisibility(View.VISIBLE);
            repText7.setVisibility(View.VISIBLE);
            setText7.setVisibility(View.VISIBLE);
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

        if (workout8Data != null) {
            // Show the corresponding views (e.g., images) and set text based on the retrieved data
            holoImageView8.setVisibility(View.VISIBLE);
            workoutImage8.setVisibility(View.VISIBLE);
            text8.setVisibility(View.VISIBLE);
            repText8.setVisibility(View.VISIBLE);
            setText8.setVisibility(View.VISIBLE);
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

        if (workout9Data != null) {
            // Show the corresponding views (e.g., images) and set text based on the retrieved data
            holoImageView9.setVisibility(View.VISIBLE);
            workoutImage9.setVisibility(View.VISIBLE);
            text9.setVisibility(View.VISIBLE);
            repText9.setVisibility(View.VISIBLE);
            setText9.setVisibility(View.VISIBLE);
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

        if (workout10Data != null) {
            // Show the corresponding views (e.g., images) and set text based on the retrieved data
            holoImageView10.setVisibility(View.VISIBLE);
            workoutImage10.setVisibility(View.VISIBLE);
            text10.setVisibility(View.VISIBLE);
            repText10.setVisibility(View.VISIBLE);
            setText10.setVisibility(View.VISIBLE);
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

        if (workout11Data != null) {
            // Show the corresponding views (e.g., images) and set text based on the retrieved data
            holoImageView11.setVisibility(View.VISIBLE);
            workoutImage11.setVisibility(View.VISIBLE);
            text11.setVisibility(View.VISIBLE);
            repText11.setVisibility(View.VISIBLE);
            setText11.setVisibility(View.VISIBLE);
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
        // Set click listeners for rightImage and leftImage
        rightImage.setOnClickListener(v -> showNextWorkout());

        leftImage.setOnClickListener(v -> showPreviousWorkout());

        // Display the initial workout
        displayWorkout(currentWorkoutIndex);
    }
    // Method to display the workout at the given index
    private void displayWorkout(int index) {
        // Your existing code to display workout based on index
        TextView[] textViews = {
                findViewById(R.id.textBarbellBenchPress2),
                findViewById(R.id.textInclineBenchPress2),
                findViewById(R.id.textDeclineBenchPress3),
                findViewById(R.id.textDumbbellBenchPress4),
                findViewById(R.id.textDumbbellInclinePress5),
                findViewById(R.id.textDumbbellDeclinePress2),
                findViewById(R.id.textCloseGripBench2),
                findViewById(R.id.textPecDeck2),
                findViewById(R.id.textChestFly2),
                findViewById(R.id.textCableChestFly2),
                findViewById(R.id.textChestPress2)
        };

        ImageView[] workoutImages = {
                findViewById(R.id.chest1),
                findViewById(R.id.chest2),
                findViewById(R.id.chest3),
                findViewById(R.id.chest4),
                findViewById(R.id.chest5),
                findViewById(R.id.chest6),
                findViewById(R.id.chest7),
                findViewById(R.id.chest8),
                findViewById(R.id.chest9),
                findViewById(R.id.chest10),
                findViewById(R.id.chest11)
        };

        EditText[] editTextRepsArray = {
                findViewById(R.id.editTextReps),
                findViewById(R.id.editTextReps2),
                findViewById(R.id.editTextReps3),
                findViewById(R.id.editTextReps4),
                findViewById(R.id.editTextReps5),
                findViewById(R.id.editTextReps6),
                findViewById(R.id.editTextReps7),
                findViewById(R.id.editTextReps8),
                findViewById(R.id.editTextReps9),
                findViewById(R.id.editTextReps10),
                findViewById(R.id.editTextReps11)
        };

        EditText[] editTextSetsArray = {
                findViewById(R.id.editTextSets),
                findViewById(R.id.editTextSets2),
                findViewById(R.id.editTextSets3),
                findViewById(R.id.editTextSets4),
                findViewById(R.id.editTextSets5),
                findViewById(R.id.editTextSets6),
                findViewById(R.id.editTextSets7),
                findViewById(R.id.editTextSets8),
                findViewById(R.id.editTextSets9),
                findViewById(R.id.editTextSets10),
                findViewById(R.id.editTextSets11)
        };

        ImageView[] holoImageView = {
                findViewById(R.id.holo),
                findViewById(R.id.holo2),
                findViewById(R.id.holo3),
                findViewById(R.id.holo4),
                findViewById(R.id.holo5),
                findViewById(R.id.holo6),
                findViewById(R.id.holo7),
                findViewById(R.id.holo8),
                findViewById(R.id.holo9),
                findViewById(R.id.holo10),
                findViewById(R.id.holo11)
        };
        TextView[] repText = {
                findViewById(R.id.textReps3),
                findViewById(R.id.textReps2),
                findViewById(R.id.textReps33),
                findViewById(R.id.textReps4),
                findViewById(R.id.textReps5),
                findViewById(R.id.textReps6),
                findViewById(R.id.textReps7),
                findViewById(R.id.textReps8),
                findViewById(R.id.textReps9),
                findViewById(R.id.textReps10),
                findViewById(R.id.textReps11)
        };
        TextView[] setText = {
                findViewById(R.id.textSets1),
                findViewById(R.id.textSets2),
                findViewById(R.id.textSets3),
                findViewById(R.id.textSets4),
                findViewById(R.id.textSets5),
                findViewById(R.id.textSets6),
                findViewById(R.id.textSets7),
                findViewById(R.id.textSets8),
                findViewById(R.id.textSets9),
                findViewById(R.id.textSets10),
                findViewById(R.id.textSets11)
        };


        for (int i = 1; i <= 11; i++) {
            if (i == index) {
                textViews[i - 1].setVisibility(View.VISIBLE);
                workoutImages[i - 1].setVisibility(View.VISIBLE);
                editTextRepsArray[i - 1].setVisibility(View.VISIBLE);
                editTextSetsArray[i - 1].setVisibility(View.VISIBLE);
                holoImageView[i -1].setVisibility(View.VISIBLE);
                repText[i -1].setVisibility(View.VISIBLE);
                setText[i -1].setVisibility(View.VISIBLE);

                // Extracting only numeric values from the workout data
                /*String numericValues = workoutDataArray[i].replaceAll("[^\\d,]", "");*/
                String numericValues = workoutDataArray[index - 1].replaceAll("[^\\d,]", "");

                // Splitting the numeric values into an array
                String[] valuesArray = numericValues.split(",");

                if (valuesArray.length >= 2) {
                    // valuesArray[0] contains the reps and valuesArray[1] contains the sets
                    editTextRepsArray[i - 1].setText(valuesArray[0].trim());
                    editTextSetsArray[i - 1].setText(valuesArray[1].trim());
                }
            } else {
                textViews[i - 1].setVisibility(View.GONE);
                workoutImages[i - 1].setVisibility(View.GONE);
                editTextRepsArray[i - 1].setVisibility(View.GONE);
                editTextSetsArray[i - 1].setVisibility(View.GONE);
                holoImageView[i -1].setVisibility(View.GONE);
                repText[i -1].setVisibility(View.GONE);
                setText[i -1].setVisibility(View.GONE);
            }
        }
    }
    // Method to show the next workout
    private void showNextWorkout() {
        if (currentWorkoutIndex < 10) {
            currentWorkoutIndex++;
            displayWorkout(currentWorkoutIndex);
        }
    }

    // Method to show the previous workout
    private void showPreviousWorkout() {
        if (currentWorkoutIndex > 1) {
            currentWorkoutIndex--;
            displayWorkout(currentWorkoutIndex);
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