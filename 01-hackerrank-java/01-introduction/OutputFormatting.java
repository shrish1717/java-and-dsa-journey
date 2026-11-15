/* 
Problem: Java Output Formatting
Task:  Use Java's System.out.printf function to this print formatted output.

Input Format: Every line of input will contain a String followed by an integer.
Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0 to 999.

Output Format: In each line of output there should be two columns:
The first column contains the String and is left justified using exactly 15 characters.
The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, pad output's leading digits with zeroes.

*/
import java.util.Scanner;
public class OutputFormatting {
     public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            // Approach 1: Direct printing using System.out.printf() method
            System.out.println("================================");
            for(int i =0; i<3; i++){
                String s1 =sc.next();
                int x = sc.nextInt();
                System.out.printf("%-15s%03d%n", s1, x);
            }
            System.out.println("================================");
            /* 
            Approach 2: Buffered printing using String.format() method
            String result = "";
            for(int i=0;i<3;i++)
            {
                 String s1=sc.next();
                int x=sc.nextInt();
                result += String.format("%-15s%03d%n", s1, x);
            }
            System.out.println("================================");
            System.out.print(result);
            System.out.println("================================");
            */
            sc.close();
        }
}


