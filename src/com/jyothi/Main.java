package com.jyothi;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        UndergraduateStudent undergraduateStudent1 = new UndergraduateStudent(
                "UGSTD1",
                "UG1 First Name",
                "UG1 Last Name",
                new int[]{65, 65, 54, 87, 98, 93, 95, 99, 57, 92, 54, 56, 73, 83, 53, 78}
        );
        UndergraduateStudent undergraduateStudent2 = new UndergraduateStudent(
                "UGSTD2",
                "UG2 First Name",
                "UG2 Last Name",
                new int[]{65, 45, 54, 87, 98, 93, 35, 99, 57, 92, 44, 56, 73, 83, 53, 78}
        );
        GraduateStudent graduateStudent1 = new GraduateStudent(
                "PGSTD1",
                "PG1 First Name",
                "PG1 Last Name",
                new int[]{65, 65, 54, 87, 98, 93, 95, 99, 57, 92, 54, 56, 73, 83, 53, 78},
                "Thesis 1",
                10
        );
        GraduateStudent graduateStudent2 = new GraduateStudent(
                "PGSTD2",
                "PG1 First Name",
                "PG1 Last Name",
                new int[]{65, 45, 54, 87, 98, 93, 35, 99, 57, 92, 44, 56, 73, 83, 53, 78},
                "Thesis 1",
                10
        );
        Student[] students = new Student[]{undergraduateStudent1, undergraduateStudent2, graduateStudent1, graduateStudent2};

        Arrays.sort(students, (a, b) -> { //a sort comaparble thing
            if(a.credits() > b.credits()) return -1;
            else if(a.credits() < b.credits()) return 1;
            else return 0;
        }); //sorting students based on credits

        for(Student student: students){
            System.out.println(student.toString());
        }

    }
}