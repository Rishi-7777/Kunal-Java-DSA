package Methods;

public class overloadingEx {
    static void fun(int a,int b){
        int c = a+b;
        System.out.println(c);
    }
    static void fun(String name){
        System.out.println("Hello "+name);
    }
    public static void main(String[] args) {
        fun(20,40);
        fun("Rishi");
    }
}
