import java.util.*;

public class question8 {
    public static void main(String[] args) {
       int user,comp;
do {
     Scanner sc=new Scanner(System.in);
     System.out.print("User guess: ");
        user=sc.nextInt();
Random r=new Random();
comp=r.nextInt(1,11);
System.out.println("Computer guess: "+comp);
if(comp==user){
System.out.println("Good guess");
}else if(comp>user){
System.out.println("Too low,try again ");
}else if (user>comp) {
    System.out.println("Too high,try again ");
}} while (comp!=user);
    }
}

