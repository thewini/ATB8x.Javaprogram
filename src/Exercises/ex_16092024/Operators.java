package Exercises.ex_16092024;

public class Operators {
    public static void main(String[] args)
    {
        //Arithmetic operators----binary operators means requires two or more operands(+ - * / %)
        /*
        int a=30,b=20;
        System.out.println("Sum of a and b:"+(a+b));
        System.out.println("Diff of a and b:"+(a-b));
        System.out.println("Multi of a and b:"+(a*b));
        System.out.println("Div of a and b:"+(a/b));
        System.out.println("Modulo div of a and b"+(a%b));

        //Assignment operators----unary operator(= + * / %)
        int c=40;   //unary plus
        int d=-30;  //unary minus

        System.out.println(c);
        System.out.println(d);

        d =d-2;
        System.out.println(d);

        //Compound assignment operators(+= -= *= /= %=)
        int e=10;
        e += 20; //e=e+20
        System.out.println(e);
        e -=20;  //e=e-20
        System.out.println(e);
        e /=10;  //e=e/10
        System.out.print(e);
*/

        //Relational operators(>  >=  <  <=  != ==)---boolean results----true/false
        int f=20,g=10;
        System.out.println(f>g);
        System.out.println(f<=g);
        System.out.println(f==g);
        System.out.println(f!=g);
        //practice
        System.out.println(!(f>g));
        System.out.println(!!!!!(f>g));
        //System.out.println((f>g)!);    //this is not possible

        //Logical operators(&&  ||  !)
        System.out.println(!true);
        System.out.println(true && false); //true and false
        System.out.println(true || false); //true or false
        //practice
        System.out.println(!(10>20 || 20<10));







    }

}
