package Methods;

import java.util.Scanner;

public class sumWithReturnType {
    static int sum(){
        int num1;
        int num2;
        int sum;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        num2 = in.nextInt();
        sum= num1+num2;
        return sum;
    }
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }
}
