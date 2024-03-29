package com.example.demo.dto;

import java.util.Date;

/**
 * @author cuongnk
 * @created_date 14/03/2023
 */
public class StudentDto {
  private String firstName;

  private String lastName;

  private String email;

  private Date dob;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Date getDob() {
    return dob;
  }

  public void setDob(Date dob) {
    this.dob = dob;
  }
}
