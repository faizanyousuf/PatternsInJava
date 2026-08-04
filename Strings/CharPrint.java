public class CharPrint{
    public static void main(String[] args) {
        String name = "faizan yousuf";

        char[] chars = name.toCharArray();

        for(char ch : chars){
            System.out.println(ch);
        }
    }
}