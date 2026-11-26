package Methods;
import java.util.Scanner;

public class Greeting {
    static void greet(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = in.nextLine();
        System.out.println("Vanakkam "+name);
    }
    public static void main(String[] args) {
        greet();
    }
}
