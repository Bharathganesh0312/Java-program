import java.util.HashSet;
public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2};
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println(set);
    }
}
