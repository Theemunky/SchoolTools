package net.androidbootcamp.schooltools.model;

import android.content.ContentValues;

import net.androidbootcamp.schooltools.database.parentsTable;

public class Parents {
    private String firstName;
    private String lastName;
    private String address;
    private String pCity;
    private String state;
    private String pPostalCode;
    private String phone;
    private String pEmail;

    public Parents(String firstName, String lastName, String address, String pCity, String state, String pPostalCode, String phone, String pEmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.pCity = pCity;
        this.state = state;
        this.pPostalCode = pPostalCode;
        this.phone = phone;
        this.pEmail = pEmail;
    }

    public Parents() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
            address = address;
    }

    public String getpCity() {
        return pCity;
    }

    public void setpCity(String pCity) {
        this.pCity = pCity;
    }

    public String getState() {
        return state;
    }

    public void setState(String pState) {
        this.state = pState;
    }

    public String getpPostalCode() {
        return pPostalCode;
    }

    public void setpPostalCode(String pPostalCode) {
        this.pPostalCode = pPostalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getpEmail() {
        return pEmail;
    }

    public void setpEmail(String pEmail) {
        this.pEmail = pEmail;
    }

    public ContentValues toValues() {
        ContentValues values = new ContentValues(8);

            values.put(parentsTable.parentFirstName, firstName);
            values.put(parentsTable.parentLastName, lastName);
            values.put(parentsTable.parentAddress, address);
            values.put(parentsTable.parentCity, pCity);
            values.put(parentsTable.parentState, state);
            values.put(parentsTable.parentPostalCode, pPostalCode);
            values.put(parentsTable.parentPhone, phone);
            values.put(parentsTable.parentEmail, pEmail);

        return values;
    }
}
