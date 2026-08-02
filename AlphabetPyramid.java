public class AlphabetPyramid {
    public static void main(String[] args){

        int n = 4;

        for(int i = 1; i <= n; i++){
            int num = 65;
            for(int j = 1; j <= n-i; j++){
                 System.out.print("  ");
            }
            for(int k = 1; k < i; k++){
                char ch = (char)num;
                System.out.print(ch+" ");
                num += 1;
            }
            num = 65+i-1;
            for(int l = 1; l <= i; l++){
                 char ch = (char)num;
                  System.out.print(ch+" ");
                  num -=1;
            }
            System.out.println();
        }
    }
}
