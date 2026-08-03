public class Overloaded {
    public static void main(String[] args) {
           overloaded(10,"hello");
    }
    static void overloaded(int a, String msg){
           System.out.println(a+ " times "+ msg);
    }
}
