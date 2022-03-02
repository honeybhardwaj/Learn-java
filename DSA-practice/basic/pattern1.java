public class pattern1 {
    public static void main(String[] args) {
        int row=5;
        int nst=1;  // number of star
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
