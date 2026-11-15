/*
Problem: Java Loops I
Task: Given an integer,N , print its first 10  multiples. 
Each multiple N x i (where 1 <= i <= 10) should be printed on a new line in the form: N x i = result.

Input Format: A single integer, N.
constraints: 2 <= N <= 20
Output Format: Print 10 lines of output; each line i (where 1 <= i <= 10) contains the result of N x i in the form:
N x i = result.

Approach:For Input, using BufferedReader to read the integer N from standard input.
Read the integer N from input. Use a for loop to iterate from 1 to 10.
For each iteration, calculate N x i and print the result in the specified format.

*/
import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoopsI {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int i;
        if(N>=2 && N<=20){
          for(i= 1; i<=10;i++){
          System.out.println(N+" x " + i + " = "+ N*i );
          }
        }
        bufferedReader.close();
    }
}
