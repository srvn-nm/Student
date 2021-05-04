
package com.company;

public class Student {
    private String firstName;
    private String lastName;
    private String id;
    private int grade;

    public Student(String fName, String lname, String sID) {
        this.firstName = fName;
        this.lastName = lname;
        this.id = sID;
        this.grade = 0;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String fName) {
        this.firstName = fName;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void print() {
        System.out.println(this.firstName + this.lastName + ", student ID: " + this.id + ", grade: " + this.grade);
    }
}
