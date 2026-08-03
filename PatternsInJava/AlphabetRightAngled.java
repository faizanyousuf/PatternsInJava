public class AlphabetRightAngled {
    public static void main(String[] args){
        int n = 5;
        
        for(int i = 1; i <= n; i++){
            int num = 65+n;
            for(int j = 1; j <= i; j++){
                num -= 1;
             char ch = (char)num;
                System.out.print(ch + " ");
            }
            System.out.println();
        }
      
    }
}
