package com.company;

/**
 * represents a person
 * @author Magen Hocker
 */
public class Person {

  private String firstName;
  private String lastName;
  private int age;

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public int getAge() {
    if (age < 0 || age > 100) return 0;
    return this.age;
  }

  public boolean isTeen() {
    return (this.age > 12 && this.age < 20);
  }

  public String getFullName() {
    String fullName = "";
    if (!firstName.isEmpty()) fullName += this.firstName;
    if (!lastName.isEmpty() && !fullName.isEmpty()) {
      fullName = fullName + " " + this.lastName;
    } else {
      fullName += this.lastName;
    }

    return fullName;
  }

}
