package org.javacodes.core.pattern.numbers;

import org.javacodes.helper.Helper;

public class FloydTriangle {
    public static void main(String[] args){
        int rows = Helper.readSingleInputInteger();

        int count = 1;
        for (int i=1; i<=rows; i++){
            for (int j=1; j<=i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
