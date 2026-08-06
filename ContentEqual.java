public class ContentEqual {
    public static void main(String[] args) {
        String str = "Java";
        StringBuffer sb = new StringBuffer("Java");

        System.out.println(str.contentEquals(sb)); // true
    }
}