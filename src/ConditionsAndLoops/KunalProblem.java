package ConditionsAndLoops;
public class KunalProblem {
    public static void main(String[] args) {
        System.out.println("Kunal can go out in only the even days of the week");

        System.out.println("The number of days in the month of august:31");
        int days = 31;
        int count =0;
        for(int i = 1;i<=days;i++) {
            if (i%2==0){
                count++;
            }
        }
        System.out.println("The number of days Kunal can go out in the month of august is: "+count);
    }
}

