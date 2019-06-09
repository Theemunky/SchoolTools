package net.androidbootcamp.schooltools.database;



public class studentAddressTable {

    public static final String studentAddressTable = "studentAddressTable";

    public static final String studentId = "studentID";

    public static final String addressID = "addressID";



    public static final String SQL_CREATE =

            "CREATE TABLE " + studentAddressTable + "(" +

                    studentId + " TEXT, " +

                    addressID + " TEXT" + ");";





    public static final String SQL_DELETE =

            "DROP TABLE " + studentAddressTable;

}