package com.example.cmd.models;

public class Staff {
    private  Long Id;
    private String Title;
    private String FirstName;
    private String LastName;
    private String Email;
    private String DoB;
    private String Profession;
    private String StaffId;
    private String ImageUrl;
    private String Address;

    public Staff() {
    }

    public Staff(
        String title, 
        String firstName, 
        String lastName, 
        String email, 
        String doB, 
        String profession,
        String staffId, 
        String imageUrl, 
        String address) 
    {
        Title = title;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        DoB = doB;
        Profession = profession;
        StaffId = staffId;
        ImageUrl = imageUrl;
        Address = address;
    }

    public Staff(Long id, String title, String firstName, String lastName, String email, String doB, String profession,
            String staffId, String imageUrl, String address) {
        Id = id;
        Title = title;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        DoB = doB;
        Profession = profession;
        StaffId = staffId;
        ImageUrl = imageUrl;
        Address = address;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String doB) {
        DoB = doB;
    }

    public String getProfession() {
        return Profession;
    }

    public void setProfession(String profession) {
        Profession = profession;
    }

    public String getStaffId() {
        return StaffId;
    }

    public void setStaffId(String staffId) {
        StaffId = staffId;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
