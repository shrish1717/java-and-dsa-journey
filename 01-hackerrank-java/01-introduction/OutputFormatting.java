
import java.util.Scanner;
public class OutputFormatting {
     public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
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
            sc.close();
        }
}


