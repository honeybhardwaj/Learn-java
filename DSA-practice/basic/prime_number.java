import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int factors=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                factors++;
            }
        }
        if(factors==1){
            System.out.println("number is prime number");
        }
        else{
            System.out.println("not prime");
        }
    }
}
