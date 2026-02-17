
import java.util.Scanner;

public class palindrone_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check palindrome: ");
        int number = sc.nextInt();
        if (number < 0 || (number % 10 == 0 && number != 0)) {
            System.out.println("Invalid Number");
            return;
        }
        int reversed = 0;
        while (number > reversed) {
            reversed = reversed * 10 + number % 10;
            number = number / 10;
        }
        if (number == reversed || number == reversed / 10) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }
    }
}
