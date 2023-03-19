//package com.example.mathcompetencysurvey;
import java.lang.reflect.Array;
import java.util.ArrayList;

import java.util.ArrayList;
public class DschoolList {
    //data section
    ArrayList<School> schools = new ArrayList<>();

    public void addSchool(School sc){
        schools.add(sc);
    }

    public void display(){
        for (int i  = 0; i<schools.size(); i++) {
            System.out.println("School:" +schools.get(i).getName());
        }
    }
     //test this class through a main method here
    public static void main(String args[]){
           DschoolList dl = new DschoolList();

           School sc = new School();
           sc.setName("St Patrick");
           dl.addSchool(sc);

            School sc2 = new School();
            sc.setName("St George");
            dl.addSchool(sc2);

            dl.display();
        }
}
