import java.util.Scanner;
public class question4 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number:");
int x=sc.nextInt();
System.out.println("Enter second number:");
int y=sc.nextInt();
int gcd=1;
for (int i =1;i<=Math.min(x,y);i++){
if (x%i==0&&y%i==0){
gcd=i;
}} 
System.out.println("GCD of number "+x+" and "+y+" is "+gcd); 
}}

    
    

