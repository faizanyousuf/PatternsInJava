public class ReverseString {
    public static void main(String[] args) {
        String str = "faizan yousuf";

        String reverse = "";

        int length = str.length();

        for(int i = length-1; i >= 0; i--){
            reverse +=str.charAt(i);
        }
        System.out.println(reverse);
    }
}
