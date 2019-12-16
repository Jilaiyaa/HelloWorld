package com.example.helloworld;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DatabaseHandler extends SQLiteOpenHelper {
    private static final Integer DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "calculationsHistory";
    private static final String TABLE_CALCULATIONS = "calculations";
    private static final String KEY_ID = "id";
    private static final String KEY_NUMBER1 = "number1";
    private static final String KEY_NUMBER2 = "number2";
    private static final String KEY_OPERATOR = "operator";
    private static final String KEY_RESULT = "result";
    public DatabaseHandler(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_CALCULATIONS + " (" + KEY_ID + " INTEGER PRIMARY KEY AUTO_INCREMENT, " + KEY_NUMBER1 + " DOUBLE, " + KEY_NUMBER2 + " DOUBLE, " + KEY_OPERATOR + "INTEGER, " + KEY_RESULT + " DOUBLE)";
        db.execSQL(createTable);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL("DROP TABLE IF EXISTS "+ TABLE_CALCULATIONS);
    onCreate(db);

    }

    public void addToHistory(Calculation calc){
        SQLiteDatabase db = this.getWriteableDatabase();
        ContentValues values = new ContentValues();

        values.put(KEY_NUMBER1, calc.getNumberOne());
        values.put(KEY_NUMBER2, calc.getNumberTwo());
        values.put(KEY_OPERATOR, calc.getOperator());
        values.put(KEY_RESULT, calc.getResult());

        db.insert(TABLE_CALCULATIONS, null, values);
        db.close();
    }

    public ArrayList<Calculation> getCalculationHistory(){
        SQLiteDatabase db = this.getWriteableDatabase();
        ArrayList<Calculation> calcHistory = new ArrayList<>();

        String selectQuery = "SELECT * FROM " + TABLE_CALCULATIONS;
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                Calculation calc1 = new Calculation(cursor.getDouble(1), cursor.getDouble(2), cursor.getDouble(4), cursor.getInt(3));
                calcHistory.add(calc1);
            } while (cursor.moveToNext());
        }
        return calcHistory;
    }

    private SQLiteDatabase getWriteableDatabase() {
    }
}
