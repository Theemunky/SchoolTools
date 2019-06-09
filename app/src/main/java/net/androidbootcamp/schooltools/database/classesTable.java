
package net.androidbootcamp.schooltools.database;



public class classesTable {

    public static final  String classTable = "classTable";

    public static final String classID = "classID";

    public static final String className = "className";

    public static final String classGrade = "classGrade";

    public static final String classTeacher = "classTeacher";





    public static final String SQL_CREATE =

            "CREATE TABLE " + classTable + "(" +

                    classID + " TEXT PRIMARY KEY, " +

                    className + " TEXT," +

                    classGrade + " INTEGER," +

                    classTeacher + " TEXT " + ");";



    public static final String SQL_DELETE =

            "DROP TABLE " + classTable;

}