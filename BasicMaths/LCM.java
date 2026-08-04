public class LCM {
    public static void main(String[] args){
        
        int lcm = LCM(1,1);
        System.out.println(lcm);
        
    }

    static int LCM (int a , int b){
            return (a*b)/GCD(a,b);
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
