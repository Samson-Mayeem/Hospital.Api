package com.example.cmd.models;

import java.util.Date;

public class PatientHistory {
    private Long Id;
    private Date DateOfConsultation;
    private String TestsTaken;
    private String ConfirmedDiagnosis;
    private String TreatmentGiven;
    private boolean AdmissionStatus;
    private String NameOfDoctorInCharge;
    public PatientHistory() {
    }
    public PatientHistory(Date dateOfConsultation, String testsTaken, String confirmedDiagnosis, String treatmentGiven,
            boolean admissionStatus, String nameOfDoctorInCharge) {
        DateOfConsultation = dateOfConsultation;
        TestsTaken = testsTaken;
        ConfirmedDiagnosis = confirmedDiagnosis;
        TreatmentGiven = treatmentGiven;
        AdmissionStatus = admissionStatus;
        NameOfDoctorInCharge = nameOfDoctorInCharge;
    }
    public PatientHistory(Long id, Date dateOfConsultation, String testsTaken, String confirmedDiagnosis,
            String treatmentGiven, boolean admissionStatus, String nameOfDoctorInCharge) {
        Id = id;
        DateOfConsultation = dateOfConsultation;
        TestsTaken = testsTaken;
        ConfirmedDiagnosis = confirmedDiagnosis;
        TreatmentGiven = treatmentGiven;
        AdmissionStatus = admissionStatus;
        NameOfDoctorInCharge = nameOfDoctorInCharge;
    }
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public Date getDateOfConsultation() {
        return DateOfConsultation;
    }
    public void setDateOfConsultation(Date dateOfConsultation) {
        DateOfConsultation = dateOfConsultation;
    }
    public String getTestsTaken() {
        return TestsTaken;
    }
    public void setTestsTaken(String testsTaken) {
        TestsTaken = testsTaken;
    }
    public String getConfirmedDiagnosis() {
        return ConfirmedDiagnosis;
    }
    public void setConfirmedDiagnosis(String confirmedDiagnosis) {
        ConfirmedDiagnosis = confirmedDiagnosis;
    }
    public String getTreatmentGiven() {
        return TreatmentGiven;
    }
    public void setTreatmentGiven(String treatmentGiven) {
        TreatmentGiven = treatmentGiven;
    }
    public boolean isAdmissionStatus() {
        return AdmissionStatus;
    }
    public void setAdmissionStatus(boolean admissionStatus) {
        AdmissionStatus = admissionStatus;
    }
    public String getNameOfDoctorInCharge() {
        return NameOfDoctorInCharge;
    }
    public void setNameOfDoctorInCharge(String nameOfDoctorInCharge) {
        NameOfDoctorInCharge = nameOfDoctorInCharge;
    }
}
