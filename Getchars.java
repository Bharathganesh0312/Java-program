import java.util.Arrays;

public class Getchars {
    public static void main(String[] args) {
        String str = "Programming";
        char[] ch = new char[6];

        str.getChars(0, 6, ch, 0);

        System.out.println(Arrays.toString(ch));
    }
}