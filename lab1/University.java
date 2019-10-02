package lab1;

import lab1.Students;

import java.util.ArrayList;

public class University {
    String name;
    int foundationYear;
   ArrayList<Students> students = new ArrayList<Students>();
    University(String name, int foundationYear, ArrayList<Students> students) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.students=students;
    }
    float getAverage(){
        float suma=0;
        for(int i=0;i<students.size();i++){
            suma+=students.get(i).mark;
        }
        return suma/students.size();
    }
}
