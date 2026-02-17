import java.util.Scanner;

public class Fibonacci_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pre_pre = 0;
        int pre = 1;
        System.out.print("Enter the number of terms you want: ");
        int n = sc.nextInt();
        if(n>=1){
        System.out.print(pre_pre);
        }
        if(n>=2){
            System.out.print(" "+pre);
        }
        for(int i=0;i<n-2;i++){
            int newno = pre_pre + pre;
            System.out.print(" "+newno);
            pre_pre=pre;
            pre=newno;
        }
        sc.close();

    }
}
