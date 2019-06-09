package net.androidbootcamp.schooltools.database;



public class parentsTable {

    public static final  String parentsTable = "parentsTable";
    public static final String parentFirstName = "firstName";
    public static final String parentLastName = "lastName";
    public static final String parentAddress = "pAddress";
    public static final String parentCity = "pCity";
    public static final String parentState = "pState";
    public static final String parentPostalCode = "pPostalCode";
    public static final String parentPhone = "pPhone";
    public static final String parentEmail = "pEmail";



    public static final String SQL_CREATE =
            "CREATE TABLE " + parentsTable + "(" +
                    parentEmail + " TEXT PRIMARY KEY, " +
                    parentFirstName + " TEXT, " +
                    parentLastName + " TEXT, " +
                    parentAddress + " TEXT, " +
                    parentCity + " TEXT, " +
                    parentState + " TEXT, " +
                    parentPostalCode + " TEXT, " +
                    parentPhone + " TEXT " + ");";

    public static final String SQL_DELETE =

            "DROP TABLE " + parentsTable;

}