public class CountLength {
    public static void main(String[] args) {
        String name = "faizan yousuf reshi";

        char[] chars = name.toCharArray();

        int length = 0;
        for(char ch : chars){
            length += 1;
        }
        System.out.println(length);
    }
}
