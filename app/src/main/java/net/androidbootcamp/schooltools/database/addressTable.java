
package net.androidbootcamp.schooltools.database;



public class addressTable {

    public static final String addressesTable = "addressesTable";
    public static final String addressID = "addressID";
    public static final String streetAddress = "streetAddress";
    public static final String city = "city";
    public static final String state = "state";
    public static final String postalCode = "postalCode";
    public static final String phone1 = "phone1";
    public static final String phone2 = "phone2";

    public static final String SQL_CREATE =

            "CREATE TABLE " + addressesTable + "(" +
                    addressID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    streetAddress + " TEXT, " +
                    city + " TEXT, " +
                    state + " TEXT, " +
                    postalCode + " TEXT, " +
                    phone1 + " TEXT, " +
                    phone2 + " TEXT " + ");";



    public static final String SQL_DELETE =
            "DROP TABLE " + addressesTable;

}