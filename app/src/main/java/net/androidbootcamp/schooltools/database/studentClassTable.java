package net.androidbootcamp.schooltools.database;



public class studentClassTable {

    public static final String studentClassTable = "studentClassTable";

    public static final String classID = "classID";

    public static final String studentID = "studentID";



    public static final String SQL_CREATE =

            "CREATE TABLE " + studentClassTable + "(" +

                    classID + " Text," +

                    studentID + " Text " + ");";







    public static final String SQL_DELETE =

            "DROP TABLE " + studentClassTable;

}