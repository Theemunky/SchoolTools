package net.androidbootcamp.schooltools.database;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import net.androidbootcamp.schooltools.model.Users;

public class LoginDataSource {
    private Context mContext;
    private SQLiteDatabase mDatabase;
    SQLiteOpenHelper mDbHelper;

    public LoginDataSource(Context context) {
        this.mContext = context;
        mDbHelper = new DBHelper(mContext);
        mDatabase = mDbHelper.getWritableDatabase();
    }


    public void open() {
        mDatabase = mDbHelper.getWritableDatabase();
    }

    public void close() {
        mDbHelper.close();
    }

//    public Users addUser(Users user) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues values = user.toValues();
//        mDatabase.insert(loginTable.loginTable, null, values);
//        return user;
}

