package org.javacodes.core.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //declare a TreeSet
        Set<Integer> nums = new TreeSet<Integer>();

        //add values to TreeSet
        nums.add(11);
        nums.add(1);
        nums.add(102);
        nums.add(-200);

        //print values of TreeSet through for each loop
        System.out.println("print values of TreeSet through for each loop:");
        for (int n : nums) {
            System.out.println(n);
        }

        //iterator
        Iterator values = nums.iterator();
        //print values of TreeSet through iterator
        System.out.println("print values of TreeSet through iterator:");
        while (values.hasNext()) {
            System.out.println(values.next());
        }

    }
}
