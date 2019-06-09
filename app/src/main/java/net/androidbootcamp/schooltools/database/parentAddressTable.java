
package net.androidbootcamp.schooltools.database;



public class parentAddressTable {

    public static final String parentAddressTable = "parentAddressTable";

    public static final String addressID = "addressID";

    public static final String parentID = "parentID";



    public static final String SQL_CREATE =

            "CREATE TABLE " + parentAddressTable + "(" +

                    addressID + " INTEGER, " +

                    parentID + " TEXT " + ");";



    public static final String SQL_DELETE =

            "DROP TABLE " + parentAddressTable;



}