public class ArmStrong {
    public static void main(String[] args) {
        System.out.println(countDigits(453));
        System.out.println(armStrong(9474));
    }

    static boolean armStrong(int num) {

        int originalNum = num;
        int armStrong = 0;
       int count = countDigits(num);
        while(num != 0){
         int remainder = num % 10;
         armStrong += Math.pow(remainder, count);
          num /= 10;
        }
       return (armStrong == originalNum);
    }

    static int countDigits(int num) {
        int count = 0;

        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
