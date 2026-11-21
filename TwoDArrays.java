/* 
import java.util.*;
public class TwoDArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of row");
        int rows = sc.nextInt();
        System.out.println("Enter the size of column");
        int cols = sc.nextInt();
        
        //2d arrays syntax
        int[][] numbers = new int[rows][cols];

        //input from user
        //outer loop for rows
        for(int i=0; i<rows ;i++) {
            //inner loop for column
            for(int j=0;j<cols;j++) {
                System.out.println("Enter the number: ");
                 
                //now input will be stored                
                numbers[i][j] = sc.nextInt();                
                
            }
        }

        //output in the form of a matrix
        for(int i=0; i<rows ;i++) {
            for(int j=0;j<cols;j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();   
        }    
    }
}


 

//take a matrix from user ,search for a given number x 
//and print the indices at which it occurs

import java.util.*;
public class TwoDArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter the size of row");
        int rows = sc.nextInt();
        System.out.println("Enter the size of column");
        int cols = sc.nextInt();
        
        //2d arrays syntax
        int[][] numbers = new int[rows][cols];

        //input from user
        //outer loop for rows
        for(int i=0; i<rows ;i++) {
            //inner loop for column
            for(int j=0;j<cols;j++) {
                 
                //now input will be stored                
                numbers[i][j] = sc.nextInt();                
                
            }
        }
        

        //search the number? from user
        int x =sc.nextInt();

        //traversing the matrix and finding the number asked by user
        for(int i=0; i<rows ;i++) {
            for(int j=0;j<cols;j++) {
                if(numbers[i][j]==x) {
                    System.out.println("x found at location" + " " + i + "," + j + " ");
                }
            }
        }
    }
}

//spiral order matrix(L-11 hw me tha)

import java.util.*;

public class TwoDArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = 5;  // number of rows
        int m = 6;  // number of columns

        int[][] matrix = new int[n][m];

        // Taking input from user
        System.out.println("Enter the matrix values (" + (n * m) + " values):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Spiral traversal starts
        System.out.println("The spiral order matrix is:");

        // Initial boundary setup
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = m - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // 1. Traverse top row → (left to right)
            for (int col = colStart; col <= colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;  // move top boundary down

            // 2. Traverse right column ↓ (top to bottom)
            for (int row = rowStart; row <= rowEnd; row++) {
                System.out.print(matrix[row][colEnd] + " ");
            }
            colEnd--;  // move right boundary left

            // 3. Traverse bottom row ← (right to left), if still within bounds
            if (rowStart <= rowEnd) {
                for (int col = colEnd; col >= colStart; col--) {
                    System.out.print(matrix[rowEnd][col] + " ");
                }
                rowEnd--;  // move bottom boundary up
            }

            // 4. Traverse left column ↑ (bottom to top), if still within bounds
            if (colStart <= colEnd) {
                for (int row = rowEnd; row >= rowStart; row--) {
                    System.out.print(matrix[row][colStart] + " ");
                }
                colStart++;  // move left boundary right
            }
        }

        System.out.println();  // end line after printing spiral
        sc.close();  // close Scanner
    }
}



//same qn by chat gpt in a proper manner

import java.util.*;

public class TwoDArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of row");
        int rows = sc.nextInt();
        System.out.println("Enter the size of column");
        int cols = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        int[][] numbers = new int[rows][cols];

        // Input row by row
        for (int i = 0; i < rows; i++) {
            System.out.println("Enter " + cols + " numbers for row " + (i + 1) + " separated by spaces:");
            String[] input = sc.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = Integer.parseInt(input[j]);
            }
        }

        // ✅ Print the matrix
        System.out.println("The matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(); // move to next line after each row
        }

        // Search number
        System.out.println("Enter number to search:");
        int x = sc.nextInt();

        // Find and print location
        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("x found at location " + i + "," + j);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("x not found in the matrix.");
        }

        sc.close();
    }
}





// small operation program based on above code only
// Its a program that:
// Takes a matrix from the user.
// Shows a menu of operations.
// Performs the selected operation (like printing, transpose, row sum, etc.

import java.util.*;

public class TwoDArrays  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Matrix input
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements one by one:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        int choice = 0;

        while (choice != 7) {
            // Display menu
            System.out.println("\nChoose an operation:");
            System.out.println("1) Print the matrix");
            System.out.println("2) Transpose of the matrix");
            System.out.println("3) Row-wise sum");
            System.out.println("4) Column-wise sum");
            System.out.println("5) Diagonal sum (only if square matrix)");
            System.out.println("6) Find max and min elements");
            System.out.println("7) Exit");

            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Matrix:");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }

            } else if (choice == 2) {
                System.out.println("Transpose:");
                for (int j = 0; j < cols; j++) {
                    for (int i = 0; i < rows; i++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }

            } else if (choice == 3) {
                System.out.println("Row-wise sum:");
                for (int i = 0; i < rows; i++) {
                    int sum = 0;
                    for (int j = 0; j < cols; j++) {
                        sum += matrix[i][j];
                    }
                    System.out.println("Row " + (i + 1) + ": " + sum);
                }

            } else if (choice == 4) {
                System.out.println("Column-wise sum:");
                for (int j = 0; j < cols; j++) {
                    int sum = 0;
                    for (int i = 0; i < rows; i++) {
                        sum += matrix[i][j];
                    }
                    System.out.println("Column " + (j + 1) + ": " + sum);
                }

            } else if (choice == 5) {
                if (rows != cols) {
                    System.out.println("Diagonal sum not possible. Matrix must be square.");
                } else {
                    int primary = 0, secondary = 0;
                    for (int i = 0; i < rows; i++) {
                        primary += matrix[i][i];
                        secondary += matrix[i][rows - i - 1];
                    }
                    System.out.println("Primary diagonal sum: " + primary);
                    System.out.println("Secondary diagonal sum: " + secondary);
                }

            } else if (choice == 6) {
                int max = matrix[0][0];
                int min = matrix[0][0];
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        if (matrix[i][j] > max) {
                            max = matrix[i][j];
                        }
                        if (matrix[i][j] < min) {
                            min = matrix[i][j];
                        }
                    }
                }
                System.out.println("Maximum element: " + max);
                System.out.println("Minimum element: " + min);

            } else if (choice == 7) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice. Please select from 1 to 7.");
            }
        }

        sc.close();
    }
}

//this above code is given by chat gpt its amazing all the things are done in this only
//perfect one 

*/