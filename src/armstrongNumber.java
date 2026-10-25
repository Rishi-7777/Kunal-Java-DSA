import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter  the number: ");
        int n = in.nextInt();
        boolean ans = armstrong(n);
        System.out.println("Is the number armstrong number? "+ans);

    }
    static boolean armstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum += rem*rem*rem;
            n =n/10;
        }
        if (sum == original){
            return true;
        }
        else {
            return false;
        }
    }
}
