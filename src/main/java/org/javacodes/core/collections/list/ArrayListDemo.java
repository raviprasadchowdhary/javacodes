package org.javacodes.core.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args){

        //creating an ArrayList
        List<Integer> nums = new ArrayList<>();

        //adding values to ArrayList
        nums.add(1);
        nums.add(2);
        nums.add(3);

        //get ArrayList values by index
        System.out.println("first element of arrayList is: " + nums.get(0));
        System.out.println("third element of arrayList is: " + nums.get(2));

        //print ArrayList
        System.out.println("ArrayList is: " + nums);

        //remove ArrayList value by index
        nums.remove(1);
        System.out.println("ArrayList after removing second element is: " + nums);

        //add value to array list by index
        nums.add(1,2);
        System.out.println("ArrayList after adding second element back is: " + nums);

        // remove first value from ArrayList
        nums.removeFirst();
        System.out.println("ArrayList after removing first element is: " + nums);
        nums.add(0,1);

        //print each value from ArrayList
        System.out.println("Printing elements one by one: ");
        for (int i = 0; i<nums.size(); i++){
            System.out.println("element at index " + i + " is " + nums.get(i));
        }
    }
}