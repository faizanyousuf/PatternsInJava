public class HallowDiamond {
    public static void main(String[] args){


        int n = 9;
        int half  = (n+1)/2;

        for(int i = 1; i <= half;i++){
            for(int j = 1; j <= half-i;j++){
                System.out.print("  ");
            }
            if(i == 1){
                System.out.print("* ");
            }else{
                System.out.print("* ");
                for(int k = 1; k <= 2*(i-1)-1;k++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1; i <= half-1; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("  ");
            }
            if(i == half-1){
                System.out.print("* ");

            }else{
                System.out.print("* ");
                for(int k = 1; k <= ((half-1-i)*2)-1;k++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
