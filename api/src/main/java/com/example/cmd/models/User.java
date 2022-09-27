package com.example.cmd.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
  private Integer id;
  private String Name;
  private String Email;
  private String Role;
  private String Password;
  public User(String name, String email, String Role, String password) {
    Name = name;
    Email = email;
    this.Role = Role;
    Password = password;
  }
  public User(Integer id, String name, String email, String role, String password) {
    this.id = id;
    Name = name;
    Email = email;
    this.Role = role;
    Password = password;
  }
  public User() {
  }
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getName() {
    return Name;
  }
  public void setName(String name) {
    Name = name;
  }
  public String getEmail() {
    return Email;
  }
  public void setEmail(String email) {
    Email = email;
  }
  public String getRole() {
    return Role;
  }
  public void setRole(String role) {
    this.Role = role;
  }
  public String getPassword() {
    return Password;
  }
  public void setPassword(String password) {
    Password = password;
  }
}