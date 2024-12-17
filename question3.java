import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number");
      int n=sc.nextInt();
      System.out.println("Random numbers generated are : ");
int i=1;double sum=0;int ran=0;
do{
 ran=(int)(1+Math.random()*n);
    System.out.println(ran);
   sum=ran+sum;
    i++;
    
}while(i<=n);
 double ans=(double)(sum)/n; 
   System.out.println("average of numbers is: "+ans);
   








    }
}
