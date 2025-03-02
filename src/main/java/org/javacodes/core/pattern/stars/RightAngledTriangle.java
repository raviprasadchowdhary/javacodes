package org.javacodes.core.pattern.stars;

import org.javacodes.helper.Helper;

public class RightAngledTriangle {
    public static void main(String[] args) {
        int size = Helper.readSingleInputInteger();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
