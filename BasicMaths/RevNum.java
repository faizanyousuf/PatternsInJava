public class RevNum{
    public static void main(String[] args) {
        int num  = 5429;


        int revNum = 0;

        while(num != 0){
           int remainder  = num % 10;
           revNum = revNum * 10 + remainder;
           num /= 10;
        }
        System.out.println(revNum);
    }
}