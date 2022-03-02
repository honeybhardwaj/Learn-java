import java.util.Scanner;

public class reverse_digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int sol = 0;
        while(number>0){
            int digit = number%10;
            sol = sol*10+digit;
            number=number/10;
        }
        System.out.println("reverse number is:"+sol);
    
    }
    
}
