public class NumberPyramid {
    public static void main(String[] args){
        int n = 4;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= i;k++){
                if(k == i){
                    continue;
                }
                System.out.print(k+" ");
            }
               for(int l = i; l >= 1; l--){
                
                   System.out.print(l+" ");
                
            }
            System.out.println();
        }
    }
}
