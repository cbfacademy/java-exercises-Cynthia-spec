package com.cbfacademy;

public class App {
    public static void main( String[] args ) {
        int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(numArray[4]);

        float[] floatsArray = {1.3f, 2.4f, 4.6f, 3.7f, 5.6f, 6.7f, 8.9f, 7.5f, 5.5f, 7.6f, 3.1f, 4.6f };
        System.out.println(floatsArray[4]);

        double[] doubleArray = {3.456d, 5.435d, 6.567d, 7.55d, 3.78d};
        System.out.println(doubleArray[4]);

        boolean[] booleanArray = {true, true, false, false, true, false};
        System.out.println(booleanArray[4]);

        Object[][] matrix = {{numArray, floatsArray, doubleArray, booleanArray}};
        System.out.println(matrix[1][2]);




    }
}
