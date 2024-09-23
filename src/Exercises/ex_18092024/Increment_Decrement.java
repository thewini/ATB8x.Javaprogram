package Exercises.ex_18092024;

public class Increment_Decrement {
public static void main(String args[])
    {
        //Pre increment
        int a=10;
        System.out.println(++a);    //a=11
        int b=++a;                  //b=11
        System.out.println(a);           // a=12
        System.out.println(b);          //b=12
        System.out.println(++a + b);    //13+12
        System.out.println(++a + ++b);//14+13
        //A-- ++a --- 14
        //+
        //B-- ++b --- 13

        //Post increment
        int c=10;
        System.out.println(c++);     //c=10 later it becomes 11
        int d=c++;                   //d=11 later c=12
        System.out.println(c);           // c=12
        System.out.println(d);          //  d=11
        System.out.println(c++ + d);    //  12+11  c becomes 13
        System.out.println(c++ + d++);  //  13+11  c becomes 14 and d becomes 12
        //A--- c++ ----13   c=14
        //+
        //B--- d++ ----11   d=12

        //Examples
        int e=10;
        System.out.println(++e + e++ + ++e);  //11+11+13
        System.out.println(e);   //13
        //A---- ++e ---- 11
        //+
        //B---- e++ ---- 11  e=12
        //+
        //C---- ++e ----13  e=13


    }
}
