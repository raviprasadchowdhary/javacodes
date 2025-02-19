package org.javacodes.core.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class PutSortRemoveLastPair {
    public static void main(String[] args){
        // declare a HashMap
        Map<String, Integer> students = new HashMap<>();

        //put values into HashMap
        students.put("Arun", 55);
        students.put("Baman", 78);
        students.put("Zaheer", 88);
        students.put("Ben", 45);

        // print HashMap
        System.out.println("current data of HashMap: " + students);

        // sort HashMap using TreeMap
        Map<String, Integer> sortedStudents = new TreeMap<>(students);

        // print sorted TreeMap
        System.out.println("Current data of TreeMap: " + sortedStudents);

        // find last pair in sorted map
        Map.Entry<String, Integer> lastPair = null;
        Iterator<Map.Entry<String, Integer>> iterator = sortedStudents.entrySet().iterator();

        while (iterator.hasNext()){
            lastPair = iterator.next();
        }

        // remove the last pair of the TreeMap
        if (lastPair!=null){
            sortedStudents.remove(lastPair.getKey());
        }

        System.out.println("Current data of TreeMap: " + sortedStudents);
    }
}
