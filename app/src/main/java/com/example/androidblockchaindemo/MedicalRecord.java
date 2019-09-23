package com.example.androidblockchaindemo;

public class MedicalRecord {
    //First define the fields in the medical record POJO
    private String patientName, patientID, visitDate, doctorName, procedureCode;

    //Now start setters and getters
    public String getPatientName() {return patientName;}
    public void setPatientName(String _PatN) {this.patientName = _PatN;}
    public String getPatientID() {return patientID;}
    public void setPatientID(String _PatID) {this.patientID = _PatID;}
    public String getVisitDate() {return visitDate;}
    public void setVisitDate(String _VisD) {this.visitDate = _VisD;}
    public String getDoctorName() {return doctorName;}
    public void setDoctorName(String _DocN) {this.doctorName = _DocN;}
    public String getProcedureCode() {return procedureCode;}
    public void setProcedureCode(String _ProC) {this.procedureCode = _ProC;}
}
