import java.util.Scanner;
public class question7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter number for which you want to find the multiplication of table :");
      int n=sc.nextInt();
     System.out.println("The multiplication of table of "+n+ " is: ");
for (int i=1;i<=10;i++){
     int prod=n*i;
    System.out.println(n+"X"+i+"="+prod);
}


    }
}
