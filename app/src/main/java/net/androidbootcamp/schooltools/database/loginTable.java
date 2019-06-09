
package net.androidbootcamp.schooltools.database;


import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;


public class loginTable {
    public static final String loginTable = "loginTable";
    public static final String firstName = "firstName";
    public static final String lastName = "lastName";
    public static final String username = "username";
    public static final String password = "password";
    public static final String email = "email";

    public static final String SQL_CREATE =
            "CREATE TABLE " + loginTable + "(" +
                    firstName + " TEXT, " +
                    lastName + " TEXT," +
                    username + " TEXT PRIMARY KEY," +
                    password + "TEXT," +
                    email + " TEXT" + ");";

    public static final String SQL_DELETE =
            "DROP TABLE " + loginTable;


}



