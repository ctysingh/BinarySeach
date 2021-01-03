package com.csingh;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Binary Search application");
        //
        List<Integer> sampleList = new ArrayList<Integer>(List.of(23,45,67,92,95,109));
        int position = binarySearch(sampleList, 97);
        System.out.println("position of item " + position);
    }
    // search the position of input number item from the list
    private static int binarySearch(List<Integer> intList, int item) {

       int low = 0;
       int high = intList.size() -1;

       while(low < high) {
          int mid = (low + high )/2;
          int result = intList.get(mid);
          if(result == item) return  mid;
          if(result > item) {
              high = mid -1 ;
          } else {
             low = mid + 1;
          }
       }

       return -1;
    }

}
