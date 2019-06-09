package net.androidbootcamp.schooltools.database;


public class studentTable {

    public static final  String studentTable = "studentTable";
    public static final String studentID = "studentID";
    public static final String studentName = "studentName";
    public static final String parentEmail = "parentEmail";



    public static final String SQL_CREATE =

            "CREATE TABLE " + studentTable + "(" +
                    studentID + " TEXT PRIMARY KEY, " +
                    studentName + " TEXT, " +
                    parentEmail + " TEXT" + ");";


    public static final String SQL_DELETE =

            "DROP TABLE " + studentTable;



}