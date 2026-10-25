package Methods;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(5,9,"Rishi","Jana","Ganesh","Akshit");
    }
    static void fun(int a,int b ,String ...v){
        System.out.println(Arrays.toString(v));
    }

}
