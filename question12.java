public class question12 {
    public static void main(String[] args) {
          int sum=0;
for(int i=1;i<1000;i++){
if(i%3==0||i%5==0){
System.out.println(i);
sum=sum+i;
}
}
System.out.println("The the sum of multiples 3 or 5 below 1000 : "+sum);
}
    }
