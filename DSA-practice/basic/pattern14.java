public class pattern14 {
    public static void main(String[] args) {
        int row = 5;
        int nst =1;
        int r = 1;
        int nsp = 7;
        while(r<=row){
            int cst= 1;
            while(cst<=nst){
                System.out.print("*");
                cst++;
            }
            int csp=1;
            while(csp<=nsp){
                System.out.print(" ");
                csp++;
            }
            cst = 1;
            if(r==5){
                cst=2;
            }
            while(cst<=nst){
                System.out.print("*");
                cst++;
            }
            System.out.println();
            r++;
            nst++;
            nsp-=2;
        }
    }
}

