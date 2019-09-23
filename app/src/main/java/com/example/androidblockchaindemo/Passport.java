package com.example.androidblockchaindemo;

public class Passport {
    //First define the fields in the Passport POJO
    private String passportName, passportID, nationality, dateOfBirth, sex, issueDate, expirationDate;

    //Now start setters and getters
    public String passportID() {return passportID;}
    public void setPassportID(String _PasID) {this.passportID = _PasID;}
    public String getPassportName() {return passportName;}
    public void setPassportName(String _PasN) {this.passportName = _PasN;}
    public String getNationality() {return nationality;}
    public void setNationality(String _Nat) {this.nationality = _Nat;}
    public String getDateOfBirth() {return dateOfBirth;}
    public void setDateOfBirth(String _DOB) {this.dateOfBirth = _DOB; }
    public String getSex() {return sex;}
    public void setSex(String _Sex) {this.sex = _Sex;}
    public String getIssueDate() {return issueDate;}
    public void setIssueDate(String _IssD) {this.issueDate = _IssD;}
    public String getExpirationDate() {return expirationDate;}
    public void setExpirationDate(String _ExpD) {this.expirationDate = _ExpD;}
}
