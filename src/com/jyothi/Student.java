package com.jyothi;

/**
 * Created by jyothi on 9/8/17.
 */
public class Student implements Academic {

    private String studentId;
    private String firstName;
    private String lastName;

    public Student() {
        //Empty Constructor
    }

    public Student(String studentId, String firstName, String lastName) { //Initialize all student details
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

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

    @Override
    public float average() {
        return 0;
    }

    @Override
    public float credits() {
        return 0;
    }

    @Override
    public boolean graduate() {
        return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", credits =" + credits() + '\'' +
                ", average =" + average() + '\'' +
                ", graduate =" + graduate() + '\'' +
                '}';
    }
}
