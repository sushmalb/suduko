package com.java.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Appointment ap = new Appointment(new Date(),"abc");
        Visitor visitor = new Visitor(1,"sushma","abc",5647857,ap);

        List<Visitor> li = new ArrayList<>();
        li.add(visitor);
        for (Visitor vi : li){
            System.out.println(vi);
        }

    }
}
