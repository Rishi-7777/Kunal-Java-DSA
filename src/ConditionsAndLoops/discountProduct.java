package ConditionsAndLoops;
import java.util.Scanner;
public class discountProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the product name: ");
        String name = in.nextLine();

        System.out.print("Enter the product price: ");
        double price = in.nextDouble();

        System.out.print("Enter the discount in percentage(%): ");
        int discount = in.nextInt();

        double discountedamount= price*discount/100;
        double discountedprice = price-discountedamount;

        System.out.println("Discounted amount: "+discountedamount);
        System.out.println("Discounted price: "+discountedprice);
        }
    }

