import java.util.Scanner;
public class Reverse {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Digits :");
    int num = sc.nextInt();
    int a  = num;
    int rev = 0;
    int rem = 0;
    while(num>0)
    {
        rem = num % 10;
        rev = rev * 10 + rem;
        num /= 10;
    }
    System.out.println("Given Digits :" +a);
    System.out.println("Reverse Digits :" + rev);

}
}
