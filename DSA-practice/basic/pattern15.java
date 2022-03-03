public class pattern15 {
    public static void main(String[] args) {
        int nst = 1;
        int row = 4; 
        int r = 1;
        int nsp=3;
        while(r<=row){
            int csp=1;
            while(csp<=nsp){
                System.out.print(" ");
                csp++;
            }
            int cst=1;
            while(cst<=nst){
                System.out.print(1);
                cst++;
            }
            System.out.println();
            r++;
            nst+=2;
            nsp--;
        }
    }
}
