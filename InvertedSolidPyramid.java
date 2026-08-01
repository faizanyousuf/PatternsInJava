public class InvertedSolidPyramid {
    public static void main(String[] args){
        int n = 4;
        for(int i = 1; i<= n; i++){
            for(int j = 1; j <= i-1; j++){
                  System.out.print(" ");
            }
            for(int k = (n-i)*2+1;k>0;k--){
            System.out.print("*");
        }
            System.out.println();
        }
    }
}
