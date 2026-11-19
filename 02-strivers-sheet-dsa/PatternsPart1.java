
import java.util.Scanner;
public class PatternsPart1 {
    public static void main(String[] args){
        Scanner sc =   new Scanner(System.in);


        int choice,N;
        do{
            System.out.println("======Striver's DSA Sheet - Patterns Part 1======");
            System.out.println("1.Square Pattern.");
            System.out.println("2.Right Triangle Pattern.");
            System.out.println("0.Exit\n");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if(choice == 0){
                System.out.println("Exiting the program...");
                System.out.println("Goodbye!");
                break;
            }

            System.out.print("Enter N(size) of the pattern: ");
            N = sc.nextInt();

            if(N <= 0 || N >100){
                System.out.println("Invalid size. Please enter a positive integer less than or equal to 100.\n");
                continue;
            }


            switch(choice){

                case 1:
                    System.out.println("Enter N of the pattern 1: ");
                    pattern1(N);
                    break;
                case 2:
                    System.out.println("Enter N of the pattern 2: ");
                    pattern2(N);
                    break;
                    default:
                        System.out.println("Invalid choice.");
            }

        }while(choice != 0);

        sc.close();
    }
    public static void pattern1(int N){
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
     public static void pattern2(int N){
        for(int i=0; i<N; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
