package com.company;
import java.util.Collections;
import java.util.List;

public class RecordBook {
    public RecordBook(List<Integer> grades) {
        this.grades = grades;
    }

    private List<Integer> grades;

    public List<Integer> getGrades() {
        return grades;
    }

    public Integer findMin(List<Integer> grades)
    {

        // check list is empty or not
        if (grades == null || grades.size() == 0) {
            return Integer.MIN_VALUE;
        }

        // return maximum value of the ArrayList
        return Collections.min(grades);
    }

    public Integer findMax(List<Integer> grades)
    {

        // check list is empty or not
        if (grades == null || grades.size() == 0) {
            return Integer.MIN_VALUE;
        }

        // return maximum value of the ArrayList
        return Collections.max(grades);
    }

//    public Integer average(List<Integer> grades)
//    {
//
//        // check list is empty or not
//        if (grades == null || grades.size() == 0) {
//            return Integer.MIN_VALUE;
//        }
//
//        // return maximum value of the ArrayList
//        return sum(grades) / grades.size();
//    }

    public Double average(List<Integer> grades) {
        double sum = 0;
        for (double d : grades) {
            sum += d;
        }
        double avg = sum / grades.size();
        return avg;
    }
//    private int sum(List<Integer> grades) {
//        int sum = 0;
//        for (int i: grades) {
//            sum += i;
//        }
//        return sum;
//    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

}
