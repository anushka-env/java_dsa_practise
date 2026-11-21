/* 

import java.util.*;
public class Functions1 {
    public static void greet() {
        System.out.println("Hello, World!");
    }
    
    public static void main(String args[]) {
        greet();
    }
}


//method 1(fine)
import java.util.*;
public class Functions1 {
    //in all our fns we are printing, so we will write 
    //void below in our fn created 
    public static void calcSum(int a, int b) {
        int sum = a+b;
        System.out.println("the sum is: " + sum);
    }
    

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();        
        calcSum(a,b);//directly calling the fn 
    }
}

//method 2(best preferred in the long run )
public class Functions1 {
    //here we are not printing but returning the value so no void needed UNDERSTAND THE DIFFERENCE
    
    public static int calcSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        int result = calcSum(a, b);  // Store returned value
        System.out.println("The sum is: " + result);  // Print it here
    }
}

 

//method 3(least preferred)
import java.util.*;

public class Functions1 {
    public static void calcSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }

    public static void main(String[] args) {
        calcSum();  // No need to pass arguments
    }
}



import java.util.*;
public class Functions1 {
    public static void printUppercase(String word) {
        String result = word.toUpperCase();
        System.out.println(result);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = sc.nextLine();
        printUppercase(word);//directly calling the fn
    }
}


import java.util.*;
public class Functions1 {
    public static void printSquare(int num) {
        int result = num * num;
        System.out.println(result);
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose square u want: ");
        int num = sc.nextInt();
        printSquare(num);
    }
}


import java.util.*;
public class Functions1 {
    public static void isEven(int num) {
        if ( num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        isEven(num);
    }
}


import java.util.*;
public class Functions1 {
    public static void printFactorial(int num) {
        int prod = 1;
        for(int i=1;i<=num;i++) {
            prod = prod * i;
        }
        System.out.println("Factorial of the number is: " + prod);        
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial u want: ");
        int num = sc.nextInt();
        printFactorial(num);
    }
}



import java.util.*;
public class Functions1 {
    public static void calcMax(int a, int b) {
        int result = Math.max(a,b);
        System.out.println("Max number btw the two is: " + result);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        
        calcMax(a,b);//directly calling the fn 
    }
}



//leap year check
import java.util.*;
public class Functions1 {
    public static void isLeapyear(int num) {
        if (( num % 4 == 0 && num % 100 != 0) || (num % 400 == 0)) {
            System.out.println(num + " " + "is a leap year! ");
        } else {
            System.out.println("Its not a leap year");
        }
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year too check whether its a leap year or not: ");
        int num = sc.nextInt();
        isLeapyear(num);
    }
}

//print first N natural numbers
import java.util.*;
public class Functions1 {
    public static void printNatural(int num) {
        for(int i=1;i<=num;i++) {
            System.out.print(i + " ");
        }        
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number till which u want the first n natural numbers: ");
        int num = sc.nextInt();
        printNatural(num);
    }
}

import java.util.*;
public class Functions1 {
    public static void calcMax(int a, int b,int c) {
        int result = Math.max(a, Math.max(b,c));
        System.out.println("Max number among the three is: " + result);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();
        
        calcMax(a,b,c);    //directly calling the fn 
    }
}



//string is palindrome

import java.util.*;
public class Functions1 {
    public static void printPalindrome(String str) {
        String reversed= "";
        for(int i = str.length()-1;i>=0;i--) {
            reversed += str.charAt(i);
        }
        // compare
        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str = sc.nextLine();
        printPalindrome(str);
    }
}



//count vowels in a string
import java.util.*;
public class Functions1 {
    public static void countVowels(String str) {
        int countVowels = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                countVowels++;
            }
        }
        System.out.println("No. of vowels are: " + countVowels);       
    }
    public static void main (String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any word: ");
        String str = sc.nextLine();
        countVowels(str);
    }
}



//find the sum of digits of a number**
import java.util.*;
public class Functions1 {
    public static void countDigits(int num) {
        int sum =0;
        while(num>0) {
            int digit = num % 10; // gets last digit
            sum = sum + digit; // adds digit to sum
            num = num / 10; // removes last digit
            // this / symbol ignores the decimal part like 7/2 = 3
        }
        System.out.println("Sum of digits is " + sum);          
    }
    public static void main (String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number whose sum of digits you want: ");
        int num = sc.nextInt();
        countDigits(num);
    }
}



// convert Celsius to Fahrenheit.
import java.util.*;
public class Functions1 {
    public static void printFahrenheit(double temp) {
        //double so that no problemm occurs in decimal
        double fahr = ((temp * 9/5) + 32);
        System.out.println("Temperature in fahrenheit is: " + fahr);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to convert from celsius to fahrenheit: ");
        double temp = sc.nextDouble();
        printFahrenheit(temp); ///calling the fn directly
    }
}



//takes an array and returns the maximum value.
import java.util.*;
public class Functions1 {
    //becoz yahan return is being used thats why 
    //void is not written
    public static int findMax(int array[]) {
        int max = array[0]; //initially assuming
        for(int i=1;i<array.length;i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static void main(String args[]) {
        int array[] = {5, 20, 15, 40, 25};
        int max = findMax(array);
        System.out.println("Maximum value is: " + max);
    }
}

// Check if a number is prime
// prime means only 2 divisor it should have
// one and the number itself are the 2 divisors

import java.util.*;
public class Functions1 {
    public static void isPrime(int num) {
        int count = 0;
        for(int i=1;i<=num;i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        isPrime(num); //directly calling the fn
    }
}


// find average of numbers in an array
import java.util.*;
public class Functions1 {
    public static void printAverage(int array[]) {
        int sum =0;
        for(int num : array) {
            sum = sum + num;
        }
        double avg = (double) sum / array.length;
        //becoz array hai toh length likhenge and not length()
        System.out.println("Average is: " + avg);
    }
    public static void main(String args[]) {
        int array[] = {10, 20, 30, 40, 50};
        printAverage(array);  //calling the fn directly
    }
}



//to reverse an array
public class Functions1 {
    public static void reverseArray(int numbers[]) {
        for(int i=numbers.length-1;i>=0;i--) {
            System.out.print(numbers[i] + " ");
        }
    }
    public static void main(String args[]) {
        int numbers[] = {10, 20, 30, 40, 50};
        reverseArray(numbers);  //calling the fn directly
    }
}


//Merge two sorted arrays into one sorted array

public class Functions1 {
    public static void mergeArray(int numbers1[], int numbers2[]) {
        int n1 = numbers1.length;
        int n2 = numbers2.length;
        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;
        //i - current index for numbers1
        //j - current index for numbers2
        //k - current index for the merged array

        // Merge while both arrays have elements
        while (i < n1 && j < n2) {
            if (numbers1[i] < numbers2[j]) {
                merged[k++] = numbers1[i++];
            } else {
                merged[k++] = numbers2[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) {
            merged[k++] = numbers1[i++];
        }
        while (j < n2) {
            merged[k++] = numbers2[j++];
        }

        // Print the merged array
        System.out.print("Merged sorted array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }

    public static void main(String args[]) {
        int numbers1[] = {10, 30, 50, 70};
        int numbers2[] = {20, 40, 60, 80};
        mergeArray(numbers1, numbers2);  // calling the function directly
    }
}


//good lvel of qns on fns

//find the GCD (Greatest Common Divisor) of two numbers.
//eg - GCD of 36 and 60 is: 12

import java.util.*;
public class Functions1 {
    public static void printGcd(int first, int second) {
        int num = Math.min(first,second);  //min number is stored in num
        int max = 0;
        for(int i=1;i<=num;i++) { //min number tak loop chala rahe 
            if (first % i == 0 && second % i == 0) {
                max = i;
            }
        }
        System.out.println("gcd is: " + max);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = sc.nextInt();
        System.out.println("Enter the second number: ");
        int second = sc.nextInt();
        printGcd(first, second);   //calling the fn
    }
}



//to find the second largest element in an array.
public class Functions1 {
    public static void printSecMax(int array[]) {
        int firstMax = Integer.MIN_VALUE; //very very small nos
        int secondMax = Integer.MIN_VALUE; //very very small nums

        for(int i=0; i<array.length; i++) {
            if (array[i] > firstMax) {
                secondMax = firstMax;
                firstMax = array[i];
            } else if (array[i] > secondMax && array[i] != firstMax) {
                secondMax = array[i];
            }
        }
        
        //think of all the possible conditions jaise {5,5,5} etc etc
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest element is: " + secondMax);
        }
    }
    public static void main(String args[]) {
        int array[] = {23,45,11,12,90};
        printSecMax(array);
    }
}

*/

// Two strings are anagrams if:
// They contain the same characters
// With the same frequencies
// But possibly in a different order
//"listen" and "silent" - eg

// Example of armstrong number
// Take 153: 3 digits → so each digit is raised to power 3
// Calculation: 
// 1³ + 5³ + 3³ = 1 + 125 + 27 = 153 ✅ (Armstrong number example)
// Other examples: 370, 371, 407

// these qns are left to do rest all done 
// 2. Write a method to generate Fibonacci series up to N terms.
// 3. Write a method to remove duplicates from an integer array.
// 4. Write a method to check if two strings are anagrams.
// 7. Write a method to check if a number is an Armstrong number.
// 8. Write a method to find the sum of all prime numbers up to N.
// 10. Write a method to rotate an array by K positions.