package Methods;

public class Overloading {
    public static void main(String[] args) {
        fun(90);
        fun(82,87);
        fun("Rishi");
    }
    //two functions with the same name can exist as long as their parameters are different
    //This is called function overloading
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(int a,int b){
        int result = a+b;
        System.out.println(result);
    }
    static void fun(String name){
        System.out.println("Hello!"+name);
    }
}
