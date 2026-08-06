import java.util.Scanner;
public class CodePointAt {
    public static void main(String[] args) {
        String str = "Hello";

        int code = str.codePointAt(1);

        System.out.println(code);
        System.out.println((char) code);
    }
}
