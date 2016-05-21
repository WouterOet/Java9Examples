package oet.wouter.java9;

import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {
        byte[] a = new byte[]{1,2,3,4,4,4,4,4,4,4,4}; // Size doesn't matter, only content
        byte[] b = new byte[]{1,2,3,5};

        System.out.println(Arrays.compare(a, b));
    }
}
