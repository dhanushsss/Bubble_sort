package com.company;


/*Problem : Trace the operation of bubble sort on the following list: 4, 7, 2, 5, 6*/
public class Main {

    public static void main(String[] args) {
        // write your code here

        int []intArray = {4, 7, 2, 5, 6 };

        int n = intArray.length ;

        // the unsorted is last index value that get already sorted

        for(int unSorted = n -1  ; unSorted > 0  ; unSorted --){
            for (int i =0 ; i < unSorted ; i ++) {
                if (intArray[i] > intArray[i + 1]) {
                    swapping(intArray, i, i + 1);
                }
            }
        }

        // print the value of sorted list

        for (int i = 0 ; i < n ; i++){
            System.out.println(intArray[i]);
        }
    }
    public static void swapping  (int []tempArray , int i , int j ){
        //swap an index 0f 1st and 2 nd
        // creating an temp variable foe swapping
        int temp = tempArray[i] ;
        tempArray [i] = tempArray[j];
        tempArray[j] = temp ;

        //if its equal will return same
        if (i == j){
            return;
        }
    }

}