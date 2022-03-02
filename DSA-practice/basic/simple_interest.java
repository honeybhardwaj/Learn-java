import java.util.Scanner;

public class simple_interest {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int principle = in.nextInt();
    int interest = in.nextInt();
    int time = in.nextInt();
    float SI = principle*interest*time/100;
    System.out.println(SI);

}    
}
