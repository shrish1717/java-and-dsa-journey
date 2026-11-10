/*
Task:  Read  integers from stdin and then print them to stdout. 
Each integer must be printed on a new line.

Input format: There are three lines of input, and each line contains a single integer.

Sample Output:
20
39
754
 */






import java.util.*;

public class Input_Output {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
