package com.jyothi;

import java.util.Arrays;

/**
 * Created by jyothi on 9/8/17.
 */
public class UndergraduateStudent extends Student implements Academic{

    private int[] grades;

    public UndergraduateStudent() {
        //Empty Constructor
    }

    public UndergraduateStudent(int[] grades) { //takes only grades
        this.grades = grades;
    }

    public UndergraduateStudent(String studentId, String firstName, String lastName) {
        super(studentId, firstName, lastName);
    }

    public UndergraduateStudent(String studentId, String firstName, String lastName, int[] grades) {
        super(studentId, firstName, lastName);
        this.grades = grades;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    @Override
    public float average() {
        float sum = 0;
        for(int index = 0; index < grades.length; index++){
            sum += grades[index];
        }
        return sum / grades.length;
    }

    @Override
    public float credits() {
        float credits = 0;
        for(int index = 0; index < grades.length; index++){
            if(grades[index] > 50){ //FIXME: expecting 100 as full marks,coz don't have info on total marks to calculate percentage
                credits += 0.5;
            }
        }
        return credits;
    }

    @Override
    public boolean graduate() {
        return credits() >= 10;
    }

    @Override
    public String toString() {
        return "UndergraduateStudent{" +
                "studentId='" + super.getStudentId() + '\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                "grades=" + Arrays.toString(grades) +
                '}';
    }
    
}
