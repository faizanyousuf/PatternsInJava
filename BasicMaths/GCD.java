
public class GCD {
    public static void main(String[] args) {
         int gcd = GCD(100, 25);
         System.out.println(gcd);
    }

    static int GCD(int a , int b){
        int GCD = 1;
        int min = Math.min(a,b);
        for(int i = min; i > 1; i--){
            if(a % i == 0 && b % i == 0){
                GCD = i;
                break;
            }
        }
        return GCD;
    }
}