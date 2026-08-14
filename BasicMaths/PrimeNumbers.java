public class PrimeNumbers {
    public static void main(String[] args){
         int[] primes = primes(11);
         for(int val : primes){
            if(val != 0){
           System.out.println(val);

            }
         }
 int [] arr = {4, 5,2 ,5 ,2, 9 ,2,8,42,234,2342,4523 };
 int n = arr.length;
           for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int val : arr){
            System.out.print(val+" ");

        }
        }
     static boolean  isPrime(int num){
           
        for(int i = 2; i<= Math.sqrt(num);i++){
              if(num % i == 0){
                return false;
              }
        }
        return true;
    }
    static int[] primes(int n){
         int[] primes = new int[n];
         int j = 0;
        for(int i = 2; i <= n;i++){
            if(isPrime(i)){
                primes[j++] = i;
            }
        }

        return primes;
    }


}
