//Very important concept
//two pointers are declared to traverse the array
/* 
//reverse an array
public class TwoPointer {
    public static void main(String[] args) {
        int arr[] = {1 ,2 ,3 ,4, 5};
        //swap first and last element by 2 pointer help
        int left = 0;
        int right = arr.length-1;
        while(left<right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed array is: ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}

//check palindrome

import java.util.*;
public class TwoPointer {
    public static void main(String[] args) {
        System.out.println("Enter the word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int left = 0;
        int right = word.length()-1;
        while(left<right) {
            if(word.charAt(left)!=word.charAt(right)) {
                System.out.print("Not palindrome");
                return;
            } 
            left++;
            right--;
        }
        System.out.print("Palindrome");
    }
}


//move zeroes to end

public class TwoPointer {
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,4,0,0,8,0,9,0,1,1};
        int j=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println("After moving all zeroes to end: ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]  +" ");
        }
    }
}


//remove duplicates from sorted array
public class TwoPointer {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,3,4,5,6,6,7};
        int j=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=arr[j]) {
               j++;
               arr[j] = arr[i];
            }
        }
        System.out.println("After removing duplicates from sorted array: ");
        for(int i=0;i<=j;i++) {
            System.out.print(arr[i]  +" ");
        }
    }
}


//two sum in sorted array
public class TwoPointer {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int left = 0;
        int target = 12;
        int right = arr.length-1;
        while(left < right) {
            int sum = arr[left] + arr[right];
            if((sum<target)) {
                left++;
            } else if((sum >target)) {
                right--;
            } else if((sum==target)) {
                System.out.println(arr[left] +" " + arr[right]);
                left++;
                right--;
            }
        }
    }
}


//container with most water - leetcode
//conceptual one

//brute force approach 
//sabse pehle sara possible container nikal lo

public class TwoPointer {
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        int maxArea = 0;
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                int width = j - i;
                int height = Math.min(arr[i],arr[j]);
                int area = width * height;
                if(area > maxArea) {
                    maxArea = area;
                }
            }
        }
        System.out.print("Maximum Area = " + maxArea);
    }
}
*/

//using double pointer optimised solution
public class TwoPointer {
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        int left = 0;
        int right = arr.length-1;
        int maxWater = 0;
        while(left<right) {
            int width = right-left;
            int height = Math.min(arr[left],arr[right]);
            int currWater = width * height;
            if(currWater > maxWater) {
                maxWater = currWater;
            }
            if(arr[left] < arr[right]) {  //left height < right height
                left++;
            } else {
                right--;
            }
        }
        System.out.println("Maximum water: " + maxWater);
    }
}





