
package net.androidbootcamp.schooltools.database;



public class parentStudentTable {

    public static final String parentStudentTable = "parentStudentTable";

    public static final String parentID = "parentID";

    public static final String studentID = "studentID";



    public static final String SQL_CREATE =

            "CREATE TABLE " + parentStudentTable + "(" +

                    parentID + " TEXT, " +

                    studentID + " TEXT" + ");";





    public static final String SQL_DELETE =

            "DROP TABLE " + parentStudentTable;

}