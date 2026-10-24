package Methods;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }

    static int sum() {
        int num1, num2, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        num2 = in.nextInt();
        result = num1 + num2;
        return result;
    }

}

