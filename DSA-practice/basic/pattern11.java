public class pattern11 {
    public static void main(String[] args) {
        int row = 9;
        int nst =1;
        int r = 1;
        while(r<=row){
            int cst= 1;
            while(cst<=nst){
                System.out.print("*");
                cst++;
            }
            System.out.println();
            r++;
            if(r>5){
                nst--;
            }else{
                nst++;
            }
        }
    }
    
}
