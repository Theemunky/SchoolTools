package net.androidbootcamp.schooltools.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class DBHelper extends SQLiteOpenHelper {


    public static final String DB_FILE_NAME = "schooltools.db";
    public static final int DB_VERSION = 1;
    SQLiteDatabase mDatabase;

    public DBHelper(Context context) {

        super(context, DB_FILE_NAME, null, DB_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(addressTable.SQL_CREATE);
        db.execSQL(loginTable.SQL_CREATE);
        db.execSQL(parentAddressTable.SQL_CREATE);
        db.execSQL(parentsTable.SQL_CREATE);
        db.execSQL(parentStudentTable.SQL_CREATE);
        db.execSQL(studentAddressTable.SQL_CREATE);
        db.execSQL(studentClassTable.SQL_CREATE);
        db.execSQL(studentTable.SQL_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(addressTable.SQL_DELETE);
        db.execSQL(loginTable.SQL_DELETE);
        db.execSQL(parentAddressTable.SQL_DELETE);
        db.execSQL(parentsTable.SQL_DELETE);
        db.execSQL(parentStudentTable.SQL_DELETE);
        db.execSQL(studentAddressTable.SQL_DELETE);
        db.execSQL(studentClassTable.SQL_DELETE);
        db.execSQL(studentTable.SQL_DELETE);
        onCreate(db);
    }

    public boolean insertStudent(String id, String name, String pEmail){
        mDatabase = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(studentTable.studentID, id);
        values.put(studentTable.studentName, name);
        values.put(studentTable.parentEmail, pEmail);


        long result = mDatabase.insert(studentTable.studentTable, null, values);

        return result != -1;
    }

    public Cursor getAllStudents() {
        mDatabase= this.getReadableDatabase();
        String query = "SELECT " + studentTable.studentName + " FROM " + studentTable.studentTable;
        Cursor cursor = mDatabase.rawQuery(query, null);

        return cursor;
    }

    public boolean insertParent(String pfirstName, String plastName, String pAddress, String pCity,
                                String pState, String pPostalCode, String pPhone, String pEmail) {
        mDatabase = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(parentsTable.parentFirstName, pfirstName);
        values.put(parentsTable.parentLastName, plastName);
        values.put(parentsTable.parentAddress, pAddress);
        values.put(parentsTable.parentCity, pCity);
        values.put(parentsTable.parentState, pState);
        values.put(parentsTable.parentPostalCode, pPostalCode);
        values.put(parentsTable.parentPhone, pPhone);
        values.put(parentsTable.parentEmail, pEmail);

        long result = mDatabase.insert(parentsTable.parentsTable, null, values);

        return result != -1;
    }

    public Cursor getAllParents() {
        mDatabase= this.getReadableDatabase();
        String query = "SELECT " + parentsTable.parentFirstName + "|| " + parentsTable.parentLastName + " FROM " + parentsTable.parentsTable;
        Cursor cursor = mDatabase.rawQuery(query, null);

        return cursor;
    }

    public Cursor studentInfo() {
        mDatabase = this.getReadableDatabase();
        String query = "SELECT * FROM " + studentTable.studentTable +
                "WHERE " + Student

    }


}