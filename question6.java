import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter base :");
      int a=sc.nextInt();
      System.out.println("Enter power :");
      int b=sc.nextInt();
      ;int solve=1;
if (a>0) {
   int i=0;
    do{
        solve=solve*a;
           i++;
    }while(i<b);
 System.out.println(solve);  
}







    }
}
