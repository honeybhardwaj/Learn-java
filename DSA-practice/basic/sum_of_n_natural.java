import java.util.Scanner;

public class sum_of_n_natural {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }

        System.out.println("sum of "+n+" natural number is "+sum);
    }
}
