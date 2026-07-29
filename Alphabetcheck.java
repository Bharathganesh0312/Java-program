import java.util.Scanner;

public class Alphabetcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("The character is an Alphabet.");
        }
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println("The character is an Alphabet.");
        }
        else {
            System.out.println("The character is NOT an Alphabet.");
        }

        sc.close();
    }
}
