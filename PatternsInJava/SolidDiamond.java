public class SolidDiamond {
    public static void main(String[] args){
        int n = 7;

        for(int i = 1; i <= (n+1)/2; i++){
             for(int j = 1; j <= (n+1)/2 - i;j++){
                System.out.print("  ");
             }
             for(int k = 1; k <= 2*i-1; k++){
                System.out.print("* ");
             }
             System.out.println();
        }
        for(int i = 1; i<= n/2; i++){
            for(int j = 1; j <= i;j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= (n/2-i)*2+1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
