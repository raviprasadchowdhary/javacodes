package org.javacodes.core.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args){

        // declare TreeMap
        Map<String, Integer> students = new TreeMap<String, Integer>();

        // put key value pairs into HashMap
        students.put("Naveen", 56);
        students.put("Harsh", 23);
        students.put("Sushil", 67);
        students.put("Kiran", 62);

        // print HashMap
        System.out.println("TreeMap: " + students);

        // get keys of HashMap
        System.out.println("Key of TreeMap are: " + students.keySet());

        // print values of each student
        System.out.println("print values of each student: ");
        for (String key : students.keySet()){
            System.out.println(key + ": " + students.get(key));
        }
    }
}
