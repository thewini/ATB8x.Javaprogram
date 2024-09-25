package Exercises.ex_16092024;

public class Ternary_Operator {
    public static void main(String[] args) {
        //ternary operator(condition? expression_if_true:expression_if_false)

        //max,min between two numbers
        //Example1
        int vikas=8;
        int chiru=13;
        int max=vikas>chiru ? vikas : chiru;
        int min=vikas>chiru ? chiru: vikas;
        System.out.println(max);
        System.out.println(min);

        //Example2
        int a=20;
        int b=30;
        int max1=a>b ? a : b;
        int min1=a<b ? b : a;
        System.out.println(max1);
        System.out.println(min1);

    }
}
