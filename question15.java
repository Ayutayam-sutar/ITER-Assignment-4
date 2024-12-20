import java.util.Scanner;
public class question15 {
        public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("For input, N = ");
int n=sc.nextInt();
String s=" ";
for(int i=1;i<=n;i++){
    s=s+i+s;
    System.out.println(s);
}

}}
