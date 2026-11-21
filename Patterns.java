// butterfly pattern where (n =4)

/* 
public class Patterns {
    public static void main(String args[]) {
        int n= 4;

        //upper half

        for(int i=1;i<=n;i++) {
            //1st part stars
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
        
            //spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }

            //2nd part stars
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half

        for(int i=n;i>=1;i--) {    //only this one line changed
            //1st part stars
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
        
            //spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }

            //2nd part stars
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



//input from user for the size of butterfly

import java.util.*;
public class Patterns {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of butterfly u want: ");
        int n= sc.nextInt();

        //upper half

        for(int i=1;i<=n;i++) {
            //1st part stars
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
        
            //spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }

            //2nd part stars
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half

        for(int i=n;i>=1;i--) {    //only this one line changed
            //1st part stars
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
        
            //spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }

            //2nd part stars
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




//butterfly zig zag pattern from above

public class Patterns {
    public static void main(String args[]) {
        int n= 4;

        //upper half

        for(int i=1;i<=n;i++) {
            //1st part stars
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
        
            //spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }

            //2nd part stars
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half

        for(int i=n;i>=1;i--) {    //only this one line changed
            //1st part stars
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
        
            //spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }

            //2nd part stars
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //upper half

        for(int i=1;i<=n;i++) {
            //1st part stars
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
        
            //spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }

            //2nd part stars
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half

        for(int i=n;i>=1;i--) {    //only this one line changed
            //1st part stars
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
        
            //spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }

            //2nd part stars
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




//1st code ke upper part ko lower ke baad likh diye to get 
// a hollow diamond pattern
public class Patterns {
    public static void main(String args[]) {
        int n= 4;

        //lower half

        for(int i=n;i>=1;i--) {    //only this one line changed
            //1st part stars
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
        
            //spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }

            //2nd part stars
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //upper half

        for(int i=1;i<=n;i++) {
            //1st part stars
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
        
            //spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }

            //2nd part stars
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



// rhombus pattern

public class Patterns {
    public static void main(String args[]) {
        int n=5;

        for(int i=1;i<=n;i++) {
            //for space
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }

            //for stars
            for(int j=1;j<=n;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}



//extra zig zag pattern made by rhombus
public class Patterns {
    public static void main(String args[]) {
        int n=5;

        for(int i=1;i<=n;i++) {
            //for space
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }

            //for stars
            for(int j=1;j<=n;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        for(int i=n;i>=1;i--) {
            //for space
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }

            //for stars
            for(int j=1;j<=n;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++) {
            //for space
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }

            //for stars
            for(int j=1;j<=n;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        for(int i=n;i>=1;i--) {
            //for space
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }

            //for stars
            for(int j=1;j<=n;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}




//next pattern
public class Patterns {
    public static void main(String args[]) {
        int n=5;

        for(int i=1;i<=n;i++) {
            //spaces
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }

            //for numbers
            for(int j=1;j<=i;j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}




//same above code just input taken from user
import java.util.*;
public class Patterns {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how long the pattern u want to print");

        int n=sc.nextInt();

        for(int i=1;i<=n;i++) {
            //spaces
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }

            //for numbers
            for(int j=1;j<=i;j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}



public class Patterns {
    public static void main(String args[]) {
        int n=5;

        for(int i=1;i<=n;i++) {
            //spaces
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }

            //for numbers of 1st half
            for(int j=i;j>=1;j--) {
                System.out.print(j);
            }

            //for numbers of second half
            for(int j=2;j<=i;j++) {
                System.out.print(j);
            }

            System.out.println();
        }

    }
}




//diamond pattern 

public class Patterns {
    public static void main(String[] args) {
        int n = 4;

        // Upper part of diamond
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


*/

//tomorrow try these patttern with hollow btw them like hollow diamond hollow rhombus and all
