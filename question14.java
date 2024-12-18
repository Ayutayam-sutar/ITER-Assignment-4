import java.util.*;
public class question14 {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("For input, N = ");
int n=sc.nextInt();
int sum=0;
int prod=1;
for (int i=1;i<=n;i++){
    if(i%2==0){
        sum=sum+i;
    }else {
        prod=prod*i; 
    }
}
System.out.println("Sum of all even numbers = "+sum);
System.out.println("Product of all odd numbers = "+prod);
    }
}
