package com.example.cmd.models;

import java.util.Date;

public class PatientRegistry {
    private Long Id;
    private String FirstName;
    private String OtherName;
    private String SecondName;
    private Date PatientDoB;
    private String PatientAddress;
    private String PatientProfession;
    private String NextOfKinName;
    private String NextOfKinPhone;
    private String NextOfKinAddress;
    private String EmergencyNumber;
    private String NHIS_Number;
    public PatientRegistry() {
    }
    public PatientRegistry(Long id, String firstName, String otherName, String secondName, Date patientDoB,
            String patientAddress, String patientProfession, String nextOfKinName, String nextOfKinPhone,
            String nextOfKinAddress, String emergencyNumber, String nHIS_Number) {
        Id = id;
        FirstName = firstName;
        OtherName = otherName;
        SecondName = secondName;
        PatientDoB = patientDoB;
        PatientAddress = patientAddress;
        PatientProfession = patientProfession;
        NextOfKinName = nextOfKinName;
        NextOfKinPhone = nextOfKinPhone;
        NextOfKinAddress = nextOfKinAddress;
        EmergencyNumber = emergencyNumber;
        NHIS_Number = nHIS_Number;
    }
    public PatientRegistry(String firstName, String otherName, String secondName, Date patientDoB,
            String patientAddress, String patientProfession, String nextOfKinName, String nextOfKinPhone,
            String nextOfKinAddress, String emergencyNumber, String nHIS_Number) {
        FirstName = firstName;
        OtherName = otherName;
        SecondName = secondName;
        PatientDoB = patientDoB;
        PatientAddress = patientAddress;
        PatientProfession = patientProfession;
        NextOfKinName = nextOfKinName;
        NextOfKinPhone = nextOfKinPhone;
        NextOfKinAddress = nextOfKinAddress;
        EmergencyNumber = emergencyNumber;
        NHIS_Number = nHIS_Number;
    }
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    public String getOtherName() {
        return OtherName;
    }
    public void setOtherName(String otherName) {
        OtherName = otherName;
    }
    public String getSecondName() {
        return SecondName;
    }
    public void setSecondName(String secondName) {
        SecondName = secondName;
    }
    public Date getPatientDoB() {
        return PatientDoB;
    }
    public void setPatientDoB(Date patientDoB) {
        PatientDoB = patientDoB;
    }
    public String getPatientAddress() {
        return PatientAddress;
    }
    public void setPatientAddress(String patientAddress) {
        PatientAddress = patientAddress;
    }
    public String getPatientProfession() {
        return PatientProfession;
    }
    public void setPatientProfession(String patientProfession) {
        PatientProfession = patientProfession;
    }
    public String getNextOfKinName() {
        return NextOfKinName;
    }
    public void setNextOfKinName(String nextOfKinName) {
        NextOfKinName = nextOfKinName;
    }
    public String getNextOfKinPhone() {
        return NextOfKinPhone;
    }
    public void setNextOfKinPhone(String nextOfKinPhone) {
        NextOfKinPhone = nextOfKinPhone;
    }
    public String getNextOfKinAddress() {
        return NextOfKinAddress;
    }
    public void setNextOfKinAddress(String nextOfKinAddress) {
        NextOfKinAddress = nextOfKinAddress;
    }
    public String getEmergencyNumber() {
        return EmergencyNumber;
    }
    public void setEmergencyNumber(String emergencyNumber) {
        EmergencyNumber = emergencyNumber;
    }
    public String getNHIS_Number() {
        return NHIS_Number;
    }
    public void setNHIS_Number(String nHIS_Number) {
        NHIS_Number = nHIS_Number;
    }
}
