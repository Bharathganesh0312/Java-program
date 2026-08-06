public class CopyValueOf {
    public static void main(String[] args) {
        char[] ch = {'H', 'e', 'l', 'l', 'o'};
        String str = String.copyValueOf(ch);

        System.out.println(str);
    }
}