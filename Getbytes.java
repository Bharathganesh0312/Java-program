import java.util.Arrays;

public class Getbytes{
    public static void main(String[] args) {
        String str = "Java";

        byte[] bytes = str.getBytes();

        System.out.println(Arrays.toString(bytes));
    }
}