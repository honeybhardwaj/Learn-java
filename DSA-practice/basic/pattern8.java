public class pattern8 {
    public static void main(String[] args) {
        int row=5;
        int nst=1;  // number of star
        int r=1;
        int nsp=4;
        while(r<=row){
            int csp=1;
            while(csp<=nsp){
                System.out.print(" ");
                csp++;
            }
            int cst=1;
            while(cst<=nst){
                System.out.print("*");
                cst++;
            }
            System.out.println();
            r++;
            nsp--;
            nst+=2;
        }
    }
}
