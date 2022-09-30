package com.example.cmd.models;

public class Department {
    private Long Id;
    private String Name;
    private String DepartmentCode;
    private String Location;
    public Department() {
    }
    public Department(String name, String departmentCode, String location) {
        Name = name;
        DepartmentCode = departmentCode;
        Location = location;
    }
    public Department(Long id, String name, String departmentCode, String location) {
        Id = id;
        Name = name;
        DepartmentCode = departmentCode;
        Location = location;
    }
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getDepartmentCode() {
        return DepartmentCode;
    }
    public void setDepartmentCode(String departmentCode) {
        DepartmentCode = departmentCode;
    }
    public String getLocation() {
        return Location;
    }
    public void setLocation(String location) {
        Location = location;
    }
}
