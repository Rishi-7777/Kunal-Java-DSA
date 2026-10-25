package Methods;

public class Shadowing {
    static int x =77;
    public static void main(String[] args) {
        System.out.println(x);//here prints the original value 77
            int x = 69;
            System.out.println(x);
            fun();//here 77 is shadowed and it prints69
        }
    static void fun(){
        System.out.println(x);//here the value outside the block (77) is displayed
    }

}
