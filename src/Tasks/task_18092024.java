package Tasks;

public class task_18092024 {
    public static void main(String[] args)
    {
        //Task1
        // Give some another example of Widening with Implicit and Explicit, Narrowing with implicit and explicit.
        //Widening
        int a=100;
        byte b=10;
        int c=a+b;        //implicit
        int c1=a+(int)b;  //explicit
        System.out.println(c);
        System.out.println(c1);

        //Narrowing
        int d=123;
        float e=249.89f;
        //int f=d+e;   //implicit---invalid
        int f1= d+ (int)e;  //explicit
        System.out.println(f1);

        //Task2
        /*
        int a = 10;
        System.out.println(  --a + a --  + a--); //9+9+8=26
        System.out.println(a);  //7

        int a = 10;
        System.out.println(  --a + a++ + a--);  //9+9+10=28
        System.out.println(a);   //9

        int a = 10;
        System.out.println(  a-- + a --  + a--);   //10+9+8=27
        System.out.println(a);  //7
        */

    }
}
