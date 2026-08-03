public class HallowRectangle{
    public static void main(String[] args){
        int n = 10;
        for(int i = 1; i <= n; i++){
            if(i == 1 || i == n){
                for(int j = 1; j <= 6; j++){
                      System.out.print("* ");
                }
            }else{
                for(int k = 1; k<=6; k++){
                    if(k == 1 || k == 6){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}