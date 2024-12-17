import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter integer number: ");
      int a=sc.nextInt();
      int rem;
      int i=1;
      int solve=0;
while (a!=0) {
rem=a%10;
a=a/10;  
if (rem!=0) {
 solve=solve+rem*i;
i=i*10;
}
}
System.out.println(solve);






}}
