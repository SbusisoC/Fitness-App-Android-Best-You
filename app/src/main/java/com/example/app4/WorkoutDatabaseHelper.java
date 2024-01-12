package com.example.app4;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class WorkoutDatabaseHelper extends SQLiteOpenHelper{

    private static final String DATABASE_NAME = "WorkoutDatabase";
    private static final int DATABASE_VERSION = 1;

    //Tables and column names
    private static final String TABLE_WORKOUTS = "workouts";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_REPS = "reps";
    private static final String COLUMN_SETS = "sets";

    //SQL statement to create the workouts table
    private static final String SQL_CREATE_WORKOUTS_TABLE =
            "CREATE TABLE " + TABLE_WORKOUTS + " (" +
                    COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    COLUMN_NAME + " TEXT," +
                    COLUMN_REPS + " TEXT," +
                    COLUMN_SETS + " TEXT)";

    public WorkoutDatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        //Create the workouts table
        db.execSQL(SQL_CREATE_WORKOUTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

    //Method to insert a workout into the database
    public long insertWorkout(String name, String reps, String sets){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME, name);
        values.put(COLUMN_REPS, reps);
        values.put(COLUMN_SETS, sets);
        long newRowId = db.insert(TABLE_WORKOUTS, null, values);
        db.close();
        return newRowId;
    }
}
