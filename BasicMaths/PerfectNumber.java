public class PerfectNumber {
    public static void main(String[] args){

        System.out.println(isPerfect(2));

    }
    static boolean isPerfect(int num){
        int sum = 1;
       for(int i = 2; i <= Math.sqrt(num); i++){
         if(num % i == 0){
            int quotient = num / i;
            sum += (quotient + i);
         }
       }
       return sum == num;
    }
}
