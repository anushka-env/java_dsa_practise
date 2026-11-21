/* 

//bubble sort idea: if arr[i] > arr[i+1] swap them.
//Time Complexity: O(N2)


import java.util.*;
public class Sorting {
    public static void printArray(int numbers[]) {
        for(int i=0;i<numbers.length;i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int numbers[] = {7, 8 ,1 , 3, 2};

        //bubble sort
        for(int i=0;i<numbers.length-1;i++) {    //n elemnts hai to n-1 times loop chalega 
            for(int j=0;j<numbers.length-i-1;j++) {  //inner loop is for comapring adjacent numbers
                if(numbers[j] > numbers[j+1]) {
                    //swap it, as bigger numbers will go towards the righmost side (sabse peeche)
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        printArray(numbers);    //calling the fn 
    }
}
-------------------------------------------------------------------------------------------------------------------

//selction sort idea: The inner loop selects the minimum element in the unsorted array and places the elements in increasing order. 
//Time complexity: O(N2) 

import java.util.*;
public class Sorting {
    public static void printArray(int arr[]) {
        for(int i =0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main (String args[]) {
        int arr[] = {7, 8, 1, 3, 2};

        //selection sort
        for(int i=0;i<arr.length-1;i++) {   //for traversing into each element n-1 times
            int smallest = i;
            for(int j = i+1;j<arr.length;j++) { //first element ko already smallest maan liye hai so inner loop ab uske baad wale number se check karega
                if(arr[j]<arr[smallest]) {
                    smallest = j;
                }
            }
            //swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------

//insertion sort = Take an element from the unsorted array, place it in its corresponding position in the sorted part, and shift the elements accordingly. 
//Time Complexity: O(N2) 

import java.util.*;
public class Sorting {
    public static void printArray(int arr[]) {
        for(int i =0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main (String args[]) {
        int arr[] = {7, 8, 1, 3, 2};

        //insertion sort
        for(int i=1;i<arr.length;i++) {   
            int current = arr[i];
            int j =i-1;
            while(j>=0 && arr[j]> current) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printArray(arr);
    }
}

*/









