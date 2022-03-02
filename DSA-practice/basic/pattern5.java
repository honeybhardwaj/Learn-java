public class pattern5 {
    public static void main(String[] args) {
        int row=5;
        int nst=5;  // number of star
        int r=1;
        while(r<=row){
            int cst=1;
            while(cst<=nst){
                System.out.print("*");
                cst++;
            }
            System.out.println();
            r++;
        }
    }
}
