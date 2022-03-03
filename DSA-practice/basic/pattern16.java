public class pattern16 {
    public static void main(String[] args) {
        int nst = 1;
        int row = 4; 
        int r = 1;
        int nsp=3;
        int num=1;
        while(r<=row){
            int csp=1;
            while(csp<=nsp){
                System.out.print(" \t");
                csp++;
            }
            int cst=1;
            while(cst<=nst){
                System.out.print(num+" \t");
                num++;
                cst++;
            }
            System.out.println();
            r++;
            nst+=2;
            nsp--;
        }
    }
}
