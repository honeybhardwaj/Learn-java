public class pattern6 {
    public static void main(String[] args) {
        int row=5;
        int nst=5;  // number of star
        int r=1;
        while(r<=row){
            int cst=1;
            while(cst<=nst){
                if(r==1||r==5||cst==1||cst==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                cst++;
            }
            System.out.println();
            r++;
        }
    }
}
