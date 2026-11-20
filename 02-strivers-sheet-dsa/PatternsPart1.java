/* 
striver's DSA Sheet - Patterns Part 1 (1 to 6)

- Created a menu-driven console application using a do-while loop, 
  allowing users to try different patterns with different sizes in one run until they choose 0 to exit.

- Used a switch statement to handle the six pattern options.

- Added input validation in main() to make sure the entered size (N) is between 1 and 100. 
  This avoids repeating the same validation in every method.

- Created a separate public static void method for each pattern to keep the code simple,
  organized, and easy to understand.

Patterns Covered:
 1. Square Pattern (N x N stars)
 2. Right Triangle Pattern (increasing stars)
 3. Right-Angled Number Pyramid (increasing column numbers 1 to i)
 4. Right-Angled Number Pyramid - II (repeated row number i)
 5. Inverted Right Pyramid (decreasing stars from N down to 1)
 6. Inverted Numbered Right Pyramid (decreasing column numbers from N down to 1)


*/
import java.util.Scanner;
public class PatternsPart1 {
    public static void main(String[] args){
        Scanner sc =   new Scanner(System.in);


        int choice,N;
        do{
            System.out.println("\n======Striver's DSA Sheet - Patterns Part 1======\n");
            System.out.println("1.Square Pattern.");
            System.out.println("2.Right Triangle Pattern.");
            System.out.println("3.Right-Angled Number Pyramid.");
            System.out.println("4.Right-Angled Number Pyramid - II.");
            System.out.println("5.Inverted Right Pyramid.");
            System.out.println("6.Inverted Numbered Right Pyramid.");

            System.out.println("0.Exit\n");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            //Using this condition to exit the program if the user enters 0
            if(choice == 0){
                System.out.println("Exiting the program...");
                System.out.println("Goodbye!");
                break;
            }

            if(choice < 0 || choice > 6){
                System.out.println("Invalid choice! Please enter a number between 1 and 6.\n");
                continue;
            }

            System.out.print("Enter N (size) of the pattern: ");
            N = sc.nextInt();
            // Check if N is a positive integer less than or equal to 100
            if(N <= 0 || N >100){
                System.out.println("Invalid size! Please enter a positive integer less than or equal to 100.\n");
                continue;
            }


            switch(choice){

                case 1:
                    pattern1(N);
                    break;
                case 2:
                   pattern2(N);
                    break;
                    
                case 3:
                    pattern3(N);
                    break;
                case 4:
                   pattern4(N);
                    break;
                case 5:
                    pattern5(N);
                    break;
                case 6:
                    pattern6(N);
                    break;
                default:
                    System.out.println("Invalid choice! \n");
            }

        }while(choice != 0);

        sc.close();
    }
    /**
     * Pattern 1: Square Pattern
     * Approach: Outer loop runs N rows; inner loop prints N stars on every row.
     */
    public static void pattern1(int N){
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /**
     * Pattern 2: Right Triangle Pattern
     * Approach: Outer loop runs N rows; inner loop prints (i +1)stars per row.
     */
    public static void pattern2(int N){
        for(int i=0; i<N; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /**
     * Pattern 3: Right-Angled Number Pyramid
     * Approach: Outer loop runs 1 to N; inner loop prints column index 'j' from 1 up to 'i'.
     */
    public static void pattern3(int N){
        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print( j + " ");
            }
            System.out.println();
        }
    }
        /**
     * Pattern 4: Right-Angled Number Pyramid - II
     * Approach: Same triangle structure as Pattern 3, but prints row index 'i' instead of 'j'.
     */
    public static void pattern4(int N){
        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print( i);
            }
            System.out.println();
        }
    }
      /**
     * Pattern 5: Inverted Right Pyramid
     * Approach: Outer loop counts down from N to 1; inner loop prints 'i' stars per row.
     */
    public static void pattern5(int N){
        for(int i=N; i>=1; i--){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
        /**
     * Pattern 6: Inverted Numbered Right Pyramid
     * Approach: Outer loop counts down from N to 1; inner loop prints numbers 1 up to 'i'.
     */
    public static void pattern6(int N){
        for(int i=N; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    
}
