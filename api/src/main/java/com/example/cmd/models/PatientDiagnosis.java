package com.example.cmd.models;

import java.util.Date;

public class PatientDiagnosis {
    private Long Id;
    private String PatientName;
    private String NameOfDiagnosis;
    private Date DateOfDiagnosis;
    public PatientDiagnosis() {
    }
    public PatientDiagnosis(String patientName, String nameOfDiagnosis, Date dateOfDiagnosis) {
        PatientName = patientName;
        NameOfDiagnosis = nameOfDiagnosis;
        DateOfDiagnosis = dateOfDiagnosis;
    }
    public PatientDiagnosis(Long id, String patientName, String nameOfDiagnosis, Date dateOfDiagnosis) {
        Id = id;
        PatientName = patientName;
        NameOfDiagnosis = nameOfDiagnosis;
        DateOfDiagnosis = dateOfDiagnosis;
    }
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getPatientName() {
        return PatientName;
    }
    public void setPatientName(String patientName) {
        PatientName = patientName;
    }
    public String getNameOfDiagnosis() {
        return NameOfDiagnosis;
    }
    public void setNameOfDiagnosis(String nameOfDiagnosis) {
        NameOfDiagnosis = nameOfDiagnosis;
    }
    public Date getDateOfDiagnosis() {
        return DateOfDiagnosis;
    }
    public void setDateOfDiagnosis(Date dateOfDiagnosis) {
        DateOfDiagnosis = dateOfDiagnosis;
    }
}