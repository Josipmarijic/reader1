package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        Recordcatalouge recordcatalouge = new Recordcatalouge("Grit");
        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Enter name you want to lookup: ");
        String studentToLookup = keyboardInput.nextLine();

        ReadFile(recordcatalouge); // open and read txt file (betyg1.txt)

        System.out.println("***********" + studentToLookup + " grade info below!  ***********");
        PrintOneStudent(recordcatalouge, studentToLookup); // print out one student name and grade info
        System.out.println("***********  All students in file and grade info below!  ***********");
        PrintInfo(recordcatalouge);  // print out all student names and grade info

    }

    private static void PrintInfo(Recordcatalouge recordcatalouge) {
        for (var s : recordcatalouge.getStudents()
        ) {
            var studentGrades = s.getGrades().getGrades();
            System.out.println("Student name is: " + s.getName()); // get each student name
            System.out.println("Student GRADES: " + studentGrades); // get all grades for each student
            System.out.println("Student MIN grade: " + s.getGrades().findMin(studentGrades)); // get min value of grades
            System.out.println("Student MAX grade: " + s.getGrades().findMax(studentGrades)); // get max value of grades
            System.out.println("Student AVG grade: " + s.getGrades().average(studentGrades)); // get avg value of grades
            System.out.println(""); // new line for each student
        }
    }

    private static void PrintOneStudent(Recordcatalouge recordcatalouge, String studentToLookup) {
        for (var s : recordcatalouge.getStudents()) {
            var studentName = s.getName(); // get student name
            if (studentName.equals(studentToLookup)) {
                var studentGrades = s.getGrades().getGrades();
                System.out.println("Student name is: " + studentName); // get each student name
                System.out.println("Student GRADES: " + studentGrades); // get all grades for ea
                System.out.println("Student MIN grade: " + s.getGrades().findMin(studentGrades));
                System.out.println("Student MAX grade: " + s.getGrades().findMax(studentGrades));
                System.out.println("Student AVG grade: " + s.getGrades().average(studentGrades));
                System.out.println(""); // new line for each student
            }
        }
    }

    private static void ReadFile(Recordcatalouge recordcatalouge) throws FileNotFoundException {
        String file = "/Users/josipmarijic/IdeaProjects/reader/src/betyg1.txt";
        Scanner sc = new Scanner(new File(file));
        while (sc.hasNextLine()) {
            String temp = sc.nextLine();
            var array = temp.split(":");

            var array1 = array[1].split(",");
            List<Integer> listGrades = new ArrayList<>();
            for (var g : array1) {
                listGrades.add(Integer.parseInt(g.trim()));

            }
            recordcatalouge.students.add(new Student(array[0], new RecordBook(listGrades)));
        }
    }
}
