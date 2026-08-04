public class IsPallindrome {
    public static void main(String[] args) {
        int num = 19391;
        int dupNum = num;
            
        int revNum = 0;

        while(dupNum != 0){
           int remainder  = dupNum % 10;
           revNum = revNum * 10 + remainder;
           dupNum /= 10;
        }
         System.out.println(revNum);
        if(revNum == num){
            System.out.println("Number is Pallindrome");
        }else{
            System.out.println("Number is Not pallindrome");
        }

    }
}
