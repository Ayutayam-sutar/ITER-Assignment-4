import java.util.Scanner;

public class question5 {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number :");
      int a=sc.nextInt();
      int n=0;int sum;
for (int i=1;i<a;i++){
    if(a%i==0){
        n=n+i;
    
}}if(n==a){
    System.out.println("It is a perfect number");
}else{
    System.out.println("Not a perfect number");
}
}}
