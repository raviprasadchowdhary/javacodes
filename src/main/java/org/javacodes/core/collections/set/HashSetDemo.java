package org.javacodes.core.collections.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {

        //Declare a hashset
        HashSet<Integer> nums = new HashSet<Integer>();

        //add values to hashset
        nums.add(21);
        nums.add(11);
        nums.add(1);
        nums.add(55);

        //print values of hash set by for each loop
        System.out.println("print values of hash set by for each loop");
        for (int n : nums) {
            System.out.println(n);
        }

        //iterator
        Iterator<Integer> values = nums.iterator();
        System.out.println("print values of hash set by iterator");
        while (values.hasNext()) {
            System.out.println(values.next());
        }

        System.out.println("nums.contains(21): " + nums.contains(21));
        System.out.println("nums.toString(): " + nums.toString());
        System.out.println("nums.isEmpty(): " + nums.isEmpty());
        System.out.println("nums.size(): " + nums.size());
        System.out.println("nums.toArray(): " + nums.toArray());
    }
}
