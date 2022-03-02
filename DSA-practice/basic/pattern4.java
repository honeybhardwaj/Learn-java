public class pattern4 {
    public static void main(String[] args) {
        int row=5;
        int nst=5;  // number of star
        int r=1;
        int nsp=0;
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
            nsp+=2;
            nst--;
        }
    }
}
