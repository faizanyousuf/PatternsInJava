public class BridgePattern {
    public static void main(String[] args){

        int n = 8;
        int half = n/2;

        for(int i = 1; i <= half; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int k = 1; k <= (half - i)*2; k++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            

            System.out.println();
        }

        for(int i = 1; i <= half; i++){
            for(int j = 1; j <= half-i+1; j++){
                System.out.print("* ");
            }
            for(int k = 1; k <= (i-1)*2; k++){
                System.out.print("  ");
            }
            for(int j = 1; j <= half-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
