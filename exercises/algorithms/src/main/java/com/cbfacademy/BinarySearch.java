package com.cbfacademy;

import java.util.Scanner;

public class BinarySearch {
    int binarySearch(int array[], int x, int low, int high) {
    // Repeat until the pointers low and high meet each other
    while (low <= high) {
      // get index of mid element
      int mid = (low + high)/ 2;
      // if element to be searched is the mid element
      if (array[mid] == x)
        return mid;
      // if element is less than mid element
      // search only the left side of mid
      if (array[mid] < x)
        low = mid + 1;
      // if element is greater than mid element
      // search only the right side of mid
      else
        high = mid - 1;
    }
    return -1;
  }
  public static void main(String args[]) {
    // create an object of BinarySearch class
    BinarySearch obj = new BinarySearch();
    // create a sorted array
    int[] array = { 3, 4, 5, 6, 7, 8, 9 };
    int n = array.length;
    // get input from user for element to be searched
    Scanner input = new Scanner(System.in);
    System.out.println("Enter element to be searched:");
    // element to be searched
    int x = input.nextInt();
    input.close();
    // call the binary search method
    // pass arguments: array, x , index of first and last element
    int result = obj.binarySearch(array, x, 0, n - 1);
    if (result == -1)
      System.out.println("Not found");
    else
      System.out.println("Element found at index " + result);
  }
    
}
