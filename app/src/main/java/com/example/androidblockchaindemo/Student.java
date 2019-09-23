package com.example.androidblockchaindemo;

public class Student {
    //First define the fields in the Student POJO
    private String studentID, studentName, studentMajor;

    //Now start setters and getters
    public String getStudentID() {return studentID;}
    public void setStudentID(String _StuID) {this.studentID = _StuID;}
    public String getStudentName() {return studentName;}
    public void setStudentName(String _StuN) {this.studentName = _StuN;}
    public String getStudentMajor() {return studentMajor;}
    public void setStudentMajor(String _StuM) {this.studentMajor = _StuM;}
}
