package org.javacodes.core.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class PutSortRemoveSecondLastPair {
    public static void main(String[] args){

        // declare a HashMap
        Map<String, Integer> students = new HashMap<>();

        // put values into HashMap
        students.put("Zaden", 35);
        students.put("Amar", 45);
        students.put("Yahya", 88);
        students.put("Rahul", 44);
        students.put("Bobzy", 43);
        System.out.println("Map before sorting: " + students);

        // sort pairs in HashMap through TreeMap
        Map<String, Integer> sortedStudents = new TreeMap<>(students);
        System.out.println("Map after sorting: " + sortedStudents);

        // find second last pair in sorted map
        Map.Entry<String, Integer> secondLastPair = null; int count = 0;
        for (Map.Entry<String, Integer> pair : sortedStudents.entrySet()){
            if (count == sortedStudents.size()-2){
                secondLastPair = pair;
                break;
            }
            count++;
        }

        // remove second last pair from map
        if (secondLastPair!=null){
            sortedStudents.remove(secondLastPair.getKey());
        }
        System.out.println("Map after removing second last pair: " + sortedStudents);
    }
}
