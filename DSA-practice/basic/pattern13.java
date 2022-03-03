public class pattern13 {
    public static void main(String[] args) {
        int row = 5;
        int nst =1;
        int r = 1;
        int nsp = 2;
        while(r<=row){
            int csp=1;
            while(csp<=nsp){
                System.out.print(" ");
                csp++;
            }
            int cst= 1;
            while(cst<=nst){
                if(cst==1||cst==nst){
                    System.out.print("*");    
                }else{
                    System.out.print(" ");
                }
                cst++;
            }
            System.out.println();
            r++;
            if(r>3){
                nsp++;
                nst-=2;
            }else{
                nsp--;
                nst+=2;
            }
        }
    }
}
