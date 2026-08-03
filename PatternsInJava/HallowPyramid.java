public class HallowPyramid {
    public static void main(String[] args){
        int n = 5;
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<= n-i;j++){
                System.out.print("  ");
            }
            if(i == 1 || i == n){
                for(int k = 1; k <= 2*i-1;k++){
                    System.out.print("* ");
                }
            }else{
                System.out.print("* ");
                for(int l = 1; l <= 2*(i-1)-1; l++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
