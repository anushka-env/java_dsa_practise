//all these qns from raghav garg lecture (2:54:11) duration
/* 
//print all substrings of str
import java.util.*;
public class Strings {
    public static void main(String[] args) {
        String str = "abcd";
        int len = str.length();
        for(int i=0;i<=len;i++) {
            for(int j=i+1;j<=len;j++) {
                System.out.print(str.substring(i,j) + " ");
            }
        }
    }
}


//toggle alphabets pHYSiCs -> PhysIcS 
//do this with help of ascii values

//check whther the string is palindrome or not
//hint: reverse and use .equalsTo fn

import java.util.*;
public class Strings {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        String rev = "";
        for(int i =len-1;i>=0;i--) {
            rev += str.charAt(i);
        }
        if(str.equals(rev)) {
            System.out.print("Palindrome");
        } else {
            System.out.print("Not palindrome");
        }
        sc.close();
    }
}

//given a string s return the number of palindromic substrinngs in it 
// a string sc is also a substring 



import java.util.*;
public class Strings {
    public static void main(String[] args) {
        String str = "Hello@123 World";
        int vowels = 0;
        int consonants=0;
        int digits = 0;
        int spaces = 0;
        int capitalLetters = 0;
        int smallLetters = 0;
        int specialCharacters = 0;
        
        System.out.println(str);

        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);

            // vowels check
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
               ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if((ch>='A' && ch<='Z' )||(ch>='a' && ch<='z' )) {
                consonants++;
            }
            //capital small check karne se pehle check the vowels 
            if(ch>='A' && ch<='Z') {
                capitalLetters++;
            } else if(ch>='a' && ch<='z') {
                smallLetters++;
            } else if(ch>='0' && ch<='9') {
                digits++;
            } else  if(ch == ' ') {
                spaces++;
            }  else {
                specialCharacters++;
            }
        }
        
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Digits = " + digits);
        System.out.println("Spaces = " + spaces);
        System.out.println("Capital Letters = " + capitalLetters);
        System.out.println("Small Letters = " + smallLetters);
        System.out.println("Special Characters = " + specialCharacters);
    }
}



import java.util.*;
public class Strings {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        System.out.print(sb.reverse());
    }
}



//check palindrome

//M-1
import java.util.*;
public class Strings {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        String original = sb.toString();
        String reversed = sb.reverse().toString();
        if(original.equals(reversed)) {
            System.out.println("Palindrome..");

        } else {
            System.out.println("not palindrome");
        }
    }
}
//whole flow  
//String → StringBuilder → reverse() → toString() → compare


//M-2  using string only 
import java.util.*; 
public class Strings {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        String rev = "";
        for(int i=str.length()-1;i>=0;i--) {
            rev += str.charAt(i);
        }
        if(str.equals(rev)) {
            System.out.print("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}


//convert to lower case with ascii values and not toUpperCase()

import java.util.*; 
public class Strings {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length(); 
        String ans = "";
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z') {
                int ascii = (int)ch;
                ascii -= 32;
                char dh = (char)ascii;
                ans += dh;
            } else {
                ans += ch;
            }
        }
        System.out.print(ans);
    }
}



//count freq of each ch

import java.util.*;

public class Strings {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            boolean found = false;
            for (int k = 0; k < i; k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    found = true;
                }
            }
            if (found == true)
                continue;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            System.out.println(str.charAt(i) + " = " + count);
        }
    }
}


//remove all spaces from string

import java.util.*;
public class Strings {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        for(int i=0;i<len;i++) {
            char ch = str.charAt(i);
            if(ch==' ') {
                continue;
            } else {
                System.out.print(ch); 
            }
        }
    }
}


//find the smallest and largets word in a sentence

import java.util.*;
public class Strings {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //we have to break the sentence word by word
        String words[] = str.split(" ");
        int smallest = words[0].length();
        int largest = words[0].length();
        String smallWord = words[0];
        String largeWord = words[0];

        for(int i=0;i<words.length;i++) {
            int len = words[i].length();
            if(len > largest) {
                largest = len;
                largeWord = words[i];
            } else if(len<smallest) {
                smallest = len;
                smallWord = words[i];
            }
        }
        System.out.println("Largest word is: "+ largeWord + " , Count: " + largest);
        System.out.println("Smallest word is: "+ smallWord + " , Count: " + smallest);
        
    }
}


//count number of words in a sentence

import java.util.*;
public class Strings {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String words[] = str.split(" ");
        int len = 0;
        for(int i=0;i<words.length;i++) {
            len++;
        }
        System.out.print("No. of words are: " +len);
    }
}

//strings are anagram
//eg silent and listen

// no. of letters(freq of ch) and the letters should be same
//arrangement is different

//procedure
// 1. check lengths
// 2. if unequal → not anagram
// 3. otherwise compare frequencies/characters

public class Strings {
    public static void main(String[] args) {
        String a = "silent";
        String b = "listen";
        int lenA = a.length();
        int lenB = b.length();
        if (lenA != lenB) {
            System.out.print("Not anagram");
            return;
        } else {
            // check freq of ch in each

            for (int i = 0; i < lenA; i++) {
                int countA = 0;
                int countB = 0;
                char ch = a.charAt(i);
                for (int j = 0; j < lenA; j++) {
                    if (a.charAt(j) == ch) {
                        countA++;
                    }
                }
                for (int j = 0; j < lenA; j++) {
                    if (b.charAt(j) == ch) {
                        countB++;
                    }
                }
                if (countA != countB) {
                    System.out.print("Not Anagram");
                    return;
                }
            }
            System.out.println("Anagram");
        }

    }
}


//Find duplicate characters in a string
import java.util.*;
public class Strings {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        int count = 1;
        for(int i=0;i<len;i++) {
            char ch = str.charAt(i);
            for(int j=i+1;j<len;j++) {
                if(str.charAt(i)== str.charAt(j)) {
                    continue;
                } else {
                    System.out.print(str.charAt(j) +" ");
                }
            }
        }
    }
}
*/