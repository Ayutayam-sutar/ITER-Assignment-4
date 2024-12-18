import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int sum=0;
       int prod=1;
       int square=0;
       for(int i=1;i<=10;i++) {
square=i*i;
sum=sum+square;

       }
System.out.println("The sumof the squares of the first ten natural numbers is: 1^2+2^2+3^2+4^2+5^2+6^2+7^2+8^2+9^2+10^2="+" "+sum);
int sum1=0;
int ans=1;
for(int i=1;i<=10;i++){
sum1=sum1+i;
ans=sum1*sum1;
}
System.out.println("The square of the sum of the first ten natural numbers is: (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9+ 10)^2= "+ans);
int diff =ans-sum;
System.out.println("Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is "+ans+"-"+sum+"="+diff);







    }
}
