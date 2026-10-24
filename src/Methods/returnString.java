package Methods;
import java.util.Scanner;

public class returnString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name:");
        String name = in.nextLine();
        String welcome = greet(name);
        System.out.println(welcome);
    }
    static String greet(String name){
       String greeting = ("Vanakam "+name);
       return greeting;
    }
}
