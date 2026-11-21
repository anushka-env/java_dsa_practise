
/* 
//RECURSION PROBLEMS L-17


// Print numbers from 5 to 1.
public class Recursion1 {
    public static void printNumbers(int n) {
        if (n== 0) {
            return;        // 0 will not be printed
        }
        System.out.println(n);
        printNumbers(n-1);
    }


    public static void main(String args[]) {
       int n = 5;
       printNumbers(n);    //calling the fn  
    }
}
    

// print numbers from 1 to 5 
public class Recursion1 {
    public static void printNumbers(int n) {
        if (n== 6) {
            return;           // 6 will not be printed
        }
        System.out.println(n);
        printNumbers(n+1);
    }

    public static void main(String args[]) {
       int n = 1;
       printNumbers(n);
    }
}

//Print the sum of first n natural numbers.
public class Recursion1 {
    public static void printSum(int i,int n, int sum) {
        if (i==n) { //base case
            sum +=i;        //sum = sum + i
            System.out.println(sum);
            return;
        }
        sum +=i;
        printSum(i+1,n,sum);
    }
    public static void main(String args[]) {
        printSum(1,5,0);     //calling the fn 
    }
}


//factorial of a number     (0! = 1)  method-1
public class Recursion1 {
    public static int calculateFact(int n) {    //int becoz return kar rahe hai
        if (n==1 || n==0) {    //base case
            return 1;
        }
        int fact_nm1= calculateFact(n-1);
        int fact_n = n * fact_nm1;   //fact_n = 5 * calculateFact(4). now this calculateFact(4) will go up the recursion fn 
        return fact_n; // Returns the result back up the recursion chain.

    }
    public static void main(String args[]) {
        int n = 5;
        int ans = calculateFact(n);
        System.out.println(ans);
    }
}

// method-2 for factorial

//  calculating factorial using recursive fn
public class Recursion1  {
    public static int printFactorial(int n) {
        if (n==0 || n==1) { //base case
            return 1;
        }
        return n * printFactorial(n-1);
    }
    public static void main(String args[]) {
        int result = printFactorial(5);
        System.out.println("Factorial is: " + result);     
    }
}


//fibonacci series till the nth term
//it first two terms are 0 and 1

public class Recursion1 {
    public static void printFib(int a ,int b, int n) {
        if (n==0 ) {
            return;
        }
        int c = a + b ;
        System.out.println(c);
        printFib(b,c,n-1);        
    }
    public static void main(String args[]) {
        int a = 0;
        int b = 1;
        //fib series ka first two terms are 0 and 1 toh unhe pehle
        //print kara rahe hai then baake ke terms aayenge.
        System.out.println(a);
        System.out.println(b);
        int n= 7;
        printFib(a,b,n-2);  //n me se 2 terms 0 and 1 toh already le liye hai na thats why n-2
    }
}


//print x^n(x to the power n)
//x * (x^n-1) = x^n-----concept
//x^0 = 1  and  x=0=>0 -----base cases

public class Recursion1 {
    public static int calcPower(int x, int n) {   //x^n remember which is what 
        if(n==0) {        //base case 1    power is 0 then result is 1
            return 1;
        }
        if(x==0) {         //base case 2    number is 0 then result is 0
            return 0;
        }

        int xPownm1 = calcPower(x,n-1);
        int xPown = x * xPownm1;
        return xPown;
    }

    public static void main (String args[]) {
        int x = 2;
        int n = 5;
        int ans = calcPower(x,n);
        System.out.println(ans);
    }
}


//print x^n(stack height = logn)
//approach  (x^n = x^n/2 * x^n/2 )  where n = even power
//          (x^n = x^n/2 * x^n/2 * x )  where n = odd power 

public class Recursion1 {
    public static int printPower(int x, int n) {
        if(n == 0) {
            return 1;
        }
        if(n % 2 == 0) {      //if n is even
            return printPower(x, n/2) * printPower(x, n/2);
        } else {    //n is odd
            return printPower(x, n/2) * printPower(x, n/2) * x;
        }
    }
    public static void main(String args[]) {
    int x = 2;
    int n = 5;
    int output = printPower(x, n);      // x-base  and n-power
    System.out.println(output);
    }
}
*/

/* 
//RECURSION - BEST PROBLEMS  (L-18)
//these are very important qns-------------------

//   1.  Tower of hanoi

public class Recursion1 {
    public static void towerOfHanoi(int n, String src, String helper, String dest ) {
        // n = number of disks
        if(n==1) {  //1 disk is the base case 
            System.out.println(" Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println(" Transfer disk " + n + " from " + src + " to " + dest);
        //again calling fn
        towerOfHanoi(n-1,helper,src,dest);
    }

    public static void main(String args[]) {
        int n = 3;
        towerOfHanoi(n , "S","H","D");
    }
}


//   2. print a string in reverse

public class Recursion1 {
    public static void printReverse(String str, int idx) {  //becoz ham print kara rahe toh void likhe hai 
        if (idx==0) {
            System.out.println(str.charAt(idx));
            return;
        }

        System.out.println(str.charAt(idx));
        printReverse(str, idx-1);
    }
    public static void main(String args[]) {
        String str = "abcd";
        printReverse(str, str.length()-1);  
    }
}

//   3. Find first & last occurrence of element
// means for exmaple in any string the letter a pehli baar kis index par aaya
//aur akhri baar kis index par aaya

public class Recursion1 {
    //ham first aur last ko static rakhe hai matlab ek bar bana diye hai bar bar banane ka zarurat nhi hai
    public static int first = -1;
    public static int last = -1;
    public static void printOccurance(String str, int idx, char element) {
        if(idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == element) {
            if(first ==-1) {    //first = -1 means vo element nhi hai pehle se
                first = idx;
            } else {
                last = idx;
            }
        }
        printOccurance(str, idx+1, element);
    }    
    
    public static void main(String args[]) {
        String str = "abaacdaefaah";
        printOccurance(str,0, 'a');
    }
}


// 4. 'Check' if the array is sorted (strictly increasing, means no repetition allowed)-----

public class Recursion1 {
    public static boolean isSorted(int arr[], int idx) {
        if(idx == arr.length-1) {
            return true;
        }

        if(arr[idx] < arr[idx+1]) {
            //array is sorted till now
            return isSorted(arr, idx+1);   //taaki aage ke elemnts bhi check ho paye
        } else{
            return false;    //agar ek bhi elemnt sorted nhi hua that means result is false as we are "checking" here
        }
    }
    public static void main(String args[]) {
        int arr[] = {1,3,2};
        System.out.println(isSorted(arr, 0));
    }
}


//5.   Move all 'x' to the end

public class Recursion1 {
    public static void moveAllX(String str, int idx, int count, String newString) {
        if(idx == str.length()) {
            for(int i=0; i<count; i++) {  //count jitna x print hoga
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == 'x') {
            count++;
            moveAllX(str, idx+1, count, newString);
        }else {
            newString += currChar;
            moveAllX(str,  idx+1, count, newString);
        }
    }

    public static void main(String args[]) {
        String str = "axbcxxd";
        moveAllX(str, 0, 0, "");
    }
}


//  6.  Remove all duplicates in String   TC = 0(n)

public class Recursion1 {
    public static boolean[] map = new boolean[26];  //ek map bana rahe of size 26
    //map ko upar static ke form me declare kar diye hai already then fn me declare karne ka 
    //zarurat nhi hai

    public static void removeDuplicates(String str, int idx, String newString) {
        if(idx == str.length()) {     //last character
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true) {
            removeDuplicates(str,idx+1,newString);
        }else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str,idx+1,newString);
        }
    }

    public static void main(String args[]) {
        String str = "abbccda";
        removeDuplicates(str, 0, "");
    }
}


// 7. Print all subsequences

public class Recursion1 {
    public static void subsequences(String str, int idx, String newString) {
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        //if choosen
        subsequences(str, idx+1, newString+currChar);
        //if not choosen
        subsequences(str, idx+1, newString);        
    }

    public static void main(String args[]) {
        String str = "abc";
        subsequences(str, 0, "");
    }
}


//8. Print all unique subsequences

import java.util.HashSet;
public class Recursion1 {
    public static void subsequences(String str, int idx, String newString, HashSet<String> set) {
        if(idx == str.length()) {
            if(set.contains(newString)) {
               return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }            
        }
        char currChar = str.charAt(idx);
        //if choosen
        subsequences(str, idx+1, newString+currChar, set);
        //if not choosen
        subsequences(str, idx+1, newString,set);        
    }

    public static void main(String args[]) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "", set);
    }
}


// 9. Print Keypad Combinations

// (1 -> abc)  (2 -> def)  (3 -> ghi)  (4 -> jkl)  (5 -> mno)  (6 -> pqrs)
//  (7 -> tu)   (8 -> vwx)  (9 -> yz)

import java.util.HashSet;
public class Recursion1 {
    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    
        public static void printComb(String str, int idx, String combination) {
            if(idx == str.length()) {
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for(int i=0; i<mapping.length(); i++) {
            printComb(str, idx+1, combination + mapping.charAt(i));
        }
    }
    public static void main(String args[]) {
    String str = "23";     //number is taken as string
    printComb(str, 0, "");
    }
}


*/

// Recursion L-19 qns 
// 1. Print all the permutations of a string.
// Time complexity - O(n*n!)


public class Recursion1 {
    public static void printPermutation(String str, int idx, String perm) {
        if(str.length() == 0) {
           System.out.println(perm);
           return;
        }
      
        for(int i=0; i<str.length(); i++) {
           char currChar = str.charAt(i);
           String newStr = str.substring(0, i) + str.substring(i+1);
           printPermutation(newStr, idx+1, perm+currChar);
        }
    }
    public static void main(String args[]) {
       String str = "abc";
       printPermutation(str, 0, "");
    }
}

// 2.   CountPathMaze 
// Time complexity - O(2^(m+n))

public class Recursion1 {
    public static int countPaths(int i, int j, int m, int n) {
        if(i == m-1 || j == n-1) {
           return 1;
        }
        return countPaths(i+1, j, m, n) + countPaths(i, j+1, m, n);
    }


    public static void main(String args[]) {
       int m = 4, n = 5;
       System.out.println(countPaths(0, 0, m, n));
    }
}


//Q3. Tiling problem

public class Recursion1 {
    public static int placeTiles(int n, int m) {
        if(n < m) {
           return 1;
        } else if(n == m) {
           return 2;
        }
        return placeTiles(n-1, m) + placeTiles(n-m, m);
    }
    public static void main(String args[]) {
        int n = 4, m = 4;
        System.out.println(placeTiles(n, m));
    }
}


/* 

// Q4. Friends pairing problem

public class Recursion1 {
    public static int pairFriends(int n) {
        if(n <= 1) {
           return 1;
        }


        return pairFriends(n-1) + (n-1) * pairFriends(n-2);
    }


    public static void main(String args[]) {
        int n = 3;
        System.out.println(pairFriends(n));
    }
}




// Q5. Subsets of a set

import java.util.ArrayList;
public class Recursion1 {
    public static void printSubsets(ArrayList<Integer> subset) {
        for(int i=0; i<subset.size(); i++) {
           System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }


    public static void findSubsets(int n, ArrayList<Integer> subset) {
        if(n == 0) {
            printSubsets(subset);
            return;
        }

        findSubsets(n-1, subset);
        subset.add(n);
        findSubsets(n-1, subset);
        subset.remove(subset.size() - 1);
    }


    public static void main(String args[]) {
        int n = 3;
        findSubsets(n, new ArrayList<Integer> ());
    }
}

*/
