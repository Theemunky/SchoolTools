package net.androidbootcamp.schooltools.model;

public class Classes {
    private String classID;
    private String className;
    private String classGrade;
    private String classTeacher;

    public Classes() {
    }

    public Classes(String classID, String className, String classGrade, String classTeacher) {
        this.classID = classID;
        this.className = className;
        this.classGrade = classGrade;
        this.classTeacher = classTeacher;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
    }
}
