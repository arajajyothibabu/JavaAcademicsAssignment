package com.jyothi;

import java.util.Arrays;

/**
 * Created by jyothi on 9/8/17.
 */
public class GraduateStudent extends Student implements Academic {

    private int[] grades;
    private String thesis;
    private int weeklyHours;

    public GraduateStudent() {

    }

    public GraduateStudent(int[] grades, String thesis, int weeklyHours) {
        this.grades = grades;
        this.thesis = thesis;
        this.weeklyHours = weeklyHours;
    }

    public GraduateStudent(String studentId, String firstName, String lastName) {
        super(studentId, firstName, lastName);
    }

    public GraduateStudent(String studentId, String firstName, String lastName, int[] grades, String thesis, int weeklyHours) {
        super(studentId, firstName, lastName);
        this.grades = grades;
        this.thesis = thesis;
        this.weeklyHours = weeklyHours;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public String getThesis() {
        return thesis;
    }

    public void setThesis(String thesis) {
        this.thesis = thesis;
    }

    public int getWeeklyHours() {
        return weeklyHours;
    }

    public void setWeeklyHours(int weeklyHours) {
        this.weeklyHours = weeklyHours;
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
            if(grades[index] >= 70){ //FIXME: expecting 100 as full grades,coz don't have info on total grades to calculate percentage
                credits += 1.0;
            }
        }
        return credits;
    }

    @Override
    public boolean graduate() {
        return credits() >= 5;
    }

    @Override
    public String toString() {
        return "GraduateStudent{" +
                "studentId='" + super.getStudentId() + '\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", grades=" + Arrays.toString(grades) + '\'' +
                ", thesis='" + thesis + '\'' +
                ", weeklyHours=" + weeklyHours + '\'' +
                ", credits =" + credits() + '\'' +
                ", average =" + average() + '\'' +
                ", graduate =" + graduate() + '\'' +
                '}';
    }

}