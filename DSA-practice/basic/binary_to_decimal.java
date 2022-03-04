import java.util.Scanner;

public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the decimal number you want to convert:");
        int num = in.nextInt();
        int pow = 0;
        int ans = 0;
        while(num>0){
            int rem = num%2;
            ans+=rem*(int) Math.pow(10, pow);
            pow++;
            num=num/2;
        }
        System.out.println("the number in binary is"+ans);
    }
}
