/* 
//count number of vowels 
import java.util.*;
public class Strings2 {
    public static void main(String[] args) {
        System.out.print("Enter the word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int count = 0;
        for(int i=0;i<word.length();i++) {
            char ch = word.charAt(i);
            if(ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' ||ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u') {
                count++;
            }
        }
        System.out.println("No. of vowels are: " + count);
    }
}


//palindrome string
import java.util.*;
public class Strings2 {
    public static void main(String[] args) {
        System.out.print("Enter the word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String rev="";
        for(int i=word.length()-1;i>=0;i--) {
            rev = rev + word.charAt(i);
        }
        if(word.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}

//palindrome - using two pointer(more imp)

import java.util.*;
public class Strings2 {
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length()-1;
        while(left<right) {
            if(word.charAt(left)!=word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("Enter the word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        if(isPalindrome(word)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}


// count vowlels
import java.util.*;
public class Strings2 {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int len = word.length();
        int count = 0;
        for(int i=0;i<len;i++) {
            char ch = word.charAt(i);
            if(ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' ||ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u') {
                count++;
            }
        }
        System.out.print("Number of vowels are: "+count);

    }
}


//count upper case and  lowercase characters

import java.util.*;
public class Strings2 {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int len = word.length();
        int upperCount = 0;
        int lowerCount = 0;
        for(int i=0;i<len;i++) {
            char ch = word.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                upperCount++;
            } else {
                lowerCount++;
            }
        }
        System.out.println("UpperCase: " + upperCount);
        System.out.print("LowerCase: " + lowerCount);
    }
}

///reverse a string without using stringbuilder .reverse()
import java.util.*;
public class Strings2 {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int len = word.length();
        String rev = "";
        for(int i=len-1;i>=0;i--) {
            rev += word.charAt(i);
        }
        System.out.println(rev);
    }
}


//check palindrome using two pointer approach
import java.util.*;
public class Strings2 {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int len = word.length();
        int left = 0;
        int right = len-1;
        while(left<right) {
            if(word.charAt(left)!=word.charAt(right)) {
                System.out.print("Not palindrome");
                return;
            } else {
                left++;
                right--;
            }
        }
        System.out.print("Palindrome..");
    }
}


// Count Occurrence of a specific Character

import java.util.*;
public class Strings2 {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.print("Enter the char whose occurence you want in the above string: ");
        char srch = sc.next().charAt(0);
        int len = word.length();
        int count = 0;
        for(int i=0;i<len;i++) {
            if(word.charAt(i) == srch) {
                count++;
            }
        }
        System.out.print("Occurrence = " + count);
    }
}


// Find Lexicographically(ascii values) largest character in a string.
import java.util.*;
public class Strings2 {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char largest = word.charAt(0);
        for(int i=0;i<word.length();i++) {
            char ch = word.charAt(i);
            if(ch > largest) {
                largest = ch;
            }
        }
        System.out.print("Largest character is: "+largest);
    }
}

// remove spaces from a sentence and print
import java.util.*;
public class Strings2 {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine();
        for(int i=0;i<sen.length();i++) {
            if(sen.charAt(i) == ' ') {
                continue;
            } else {
                System.out.print(sen.charAt(i));
            }
        }
    }
}

//count number of words in a sentence
import java.util.*;
public class Strings2 {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine();
        String arr[] = sen.split(" ");
        int countWords = 0;
        for(int i=0;i<arr.length;i++) {
            countWords++;
        }
        System.out.print("No. of words are: " + countWords);
    }
}


// toggle case - Convert uppercase to lowercase and vice versa.
import java.util.*;
public class Strings2 {
    public static void main(String[] args) {
        System.out.print("Enter string(word): ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        //check the aplhabet case first 
        for(int i=0;i<word.length();i++) {
            char ch = word.charAt(i);
            int ascii = ch;
            if(ascii >= 97 && ascii<=122) {
                //p->P
                ascii -= 32;
                char dh = (char)ascii;
                System.out.print(dh);
            } else if(ascii <=90 && ascii>=65) {
                //P->p
                ascii += 32;
                char dh = (char)ascii;
                System.out.print(dh);
            } else if(ascii == '@') {
                System.out.print(" ");
            } else {
                System.out.print(word.charAt(i)); //for nos.
            }
        }
    }
}



//writing tthe entie program without using an ascii variable at all
import java.util.*;
public class Strings2 {
    public static void main(String[] args) {
        System.out.print("Enter string(word): ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        for(int i=0;i<word.length();i++) {
            char ch = word.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                ch -= 32;
                System.out.print(ch);
            } else if(ch >= 'A' && ch <= 'Z') {
                ch += 32;
                System.out.print(ch);
            } else if(ch==' ') {  //spaces
                System.out.print(ch);
            } else {     // for numbers
                System.out.print(ch);
            }
        }
    }
}


//check anagram
//listen and silent - return true
//logical words hona zaruri nhi hai
import java.util.*;
public class Strings2 {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";
        if(a.length()!=b.length()) {
            System.out.print("Not anagram");
            return;
        } else {
            char arr1[] = a.toCharArray();
            Arrays.sort(arr1);
            char arr2[] = b.toCharArray();
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2)) {
                System.out.println("Anagrams");
            } else {
                System.out.println("Not Anagrams");
            }
        } 
    }
}


//by checking freq of characters - later





//first non repeating char
//Find the first character that appears only once.
//brute force
import java.util.*;
public class Strings2 {
    public static void main(String[] args) {
        String word = "aabbccddee";
        boolean found = false;
        for(int i=0;i<word.length();i++) {
            int count = 0;
            for(int j=0;j<word.length();j++) {
                if(word.charAt(i)== word.charAt(j)) {
                    count++;
                }
            }
            if(count == 1) {
                System.out.println(word.charAt(i));
                found = true;
                return;
            }
        }
        if(!found) {
            System.out.println("No non-repeating character found");
        }
    }
}


//Keep only first occurrences , remove duplicates
public class Strings2 {
    public static void main(String[] args) {
        String word = "programming";
        for(int i=0;i<word.length();i++) {
            boolean found = false;
            for(int j=0;j<i;j++) {
                if(word.charAt(i)==word.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                System.out.print(word.charAt(i));
            } 
        }
    }
}

//compress string
//input = "aaabbccccd" , Output: "a3b2c4d1"
public class Strings2 {
    public static void main(String[] args) {
        String word = "aaabbccccd";
        int len = word.length();
        for(int i=0;i<len;i++) {
            int count = 1;
            while(i+1 < len && word.charAt(i)==word.charAt(i+1)) {
                count++;
                i++;
            }
            if(count>1) {
                System.out.print(word.charAt(i));
                System.out.print(count);
            } else {
                System.out.print(word.charAt(i));
            }
        }
    }
}


//Check if one string is a rotation of another.
//rotation means taking some characters from the beginning of the string and moving them to the end, while keeping their order the same.
// Input: "abcd", "cdab"
// Output: true

// AGAIN DO IT
//abcd - possible rotations ->abcd, bcda, cdab, dabc
public class Strings2 {
    public static void main(String[] args) {
        String word = "abcd";
        String word2 = "cdab";

        if(word.length() != word2.length()) {
            System.out.println(false);
            return;
        }

        boolean found = false;

        for(int i = 0; i < word.length(); i++) {
            if(word.equals(word2)) {
                found = true;
                break;
            }

            word = word.substring(1) + word.charAt(0);
        }

        System.out.println(found);
    }
}


//String builder qns from chatgpt

//reverse using string builder
import java.util.*;
public class Strings2 {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner((System.in));
        StringBuilder sb = new StringBuilder(sc.next());
        System.out.print(sb.reverse());
    }
}

//remove all digits
// Input: "a1b2c3d4"
// Output: "abcd"

public class Strings2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("a1b2c3d4");
        for(int i=0;i<sb.length();i++) {
            char ch = sb.charAt(i);
            if(ch>='1' && ch<='9') {
                continue;
            } else {
                System.out.print(ch);
            }
        }
    }
}


// replace every space with %20 - classic qn
import java.util.*;
public class Strings2 {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        StringBuilder result = new StringBuilder();
        for(int i=0;i<sb.length();i++) {
            char ch = sb.charAt(i);
            if(ch == ' ') {
                result.append("%20");
            } else {
                result.append(ch);
            }
        }
        System.out.print(result);
    }
}

// Longest Word in a Sentence

import java.util.*;
public class Strings2 {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine();
        String arr[] = sen.split(" ");
        int maxLength = 0;
        String maxWord = "";
        for(int i=0;i<arr.length;i++) {
            int len = arr[i].length();
            if(len >= maxLength) {
                maxWord = arr[i];
                maxLength = len;
            }
        }   
        System.out.print(maxWord);
    }
}

*/
// frequency of every character
// banana = b->1 ,a->3,n->2

public class Strings2 {
    public static void main(String[] args) {
        String word = "banana";
        for(int i=0;i<word.length();i++){
            int count = 0;
            boolean found = false;
            for(int j=0;j<i;j++) {
                if(word.charAt(i)==word.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if(found) continue;
            count = 0;
            for(int k=0;k<word.length();k++) {
                if(word.charAt(i) == word.charAt(k)) {
                    count++;
                }
            }
            System.out.println(word.charAt(i)+" -> "+count);

        }
    }
}
// So the algorithm of above code is:

// Take a character.
// Check if it has appeared earlier.
// If yes → skip it.
// If no → count its frequency in the "whole string".
// Print the frequency.


//longest substring without repeating characters
// Input:"abcabcbb"
// Output:3 ("abc")






//print all substrings


//prit all palindromic substrings
