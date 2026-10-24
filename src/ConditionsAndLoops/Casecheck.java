package ConditionsAndLoops;
import java.util.Scanner;
public class Casecheck {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a character: ");
    char ch = in.nextLine().charAt(0);

    if (ch >= 'a' && ch<= 'z'){
        System.out.println("The given character is lowercase");
    }
    else if(ch >= 'A' && ch<= 'Z'){
        System.out.println("The given character is uppercase");
    }
    else {
        System.out.println("Enter a valid letter");
    }

}
}
