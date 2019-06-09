package net.androidbootcamp.schooltools.model;

import android.content.ContentValues;

import net.androidbootcamp.schooltools.database.studentTable;

public class Students {
    private String studentID;
    private String name;
    private String parentEmail;


    public Students() {
    }

    public Students(String studentID,String name, String parentEmail) {
        this.name = name;
        this.parentEmail = parentEmail;

    }
    public String getStudentID(){
        return studentID;
    }
    public void setStudentID(String studentID){
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getParentEmail() {
        return parentEmail;
    }
    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }

    public ContentValues toValues() {
        ContentValues values = new ContentValues(4);

        values.put(studentTable.studentID, studentID);
        values.put(studentTable.studentName, name);
        values.put(studentTable.parentEmail, parentEmail);
        return values;
    }

}
