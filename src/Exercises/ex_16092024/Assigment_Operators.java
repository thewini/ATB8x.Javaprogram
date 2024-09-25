package Exercises.ex_16092024;

public class Assigment_Operators {
    public static void main(String[] args)
    {
        //Assignment operators----unary operator(= + * / %)
        int a=40;   //unary plus
        int b=-30;  //unary minus

        System.out.println(a);
        System.out.println(b);

        b =b-2;
        System.out.println(b);

        //Compound assignment operators(+= -= *= /= %=)
        int c=10,d=20,e=30;
        c += 20; //e=e+20
        System.out.println(c);
        d -=20;  //e=e-20
        System.out.println(d);
        e /=10;  //e=e/10
        System.out.print(e);
    }
}
