import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int k = String.valueOf(num).length();
        int original = num;
        int sum = 0;

        while (num > 0) {
            int ld = num % 10;      //lastdigit
            sum += Math.pow(ld, k);
            num /= 10;
        }

        if (original == sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}

