package Exercises.ex_06092024;


public class Variables
{
    public static void main(String[] args)  //main method
    {
        /*int a;   //declaration
        a=10;   //assignment
        int a=10; //declaration+assignment in one line
        */

        /*Approach1: If all the variables belongs to diff datatypes
        int a=10;
        char b='A';
        boolean $=true;
         */

        /*Approach2: If all the variables belongs to same datatype
        int a,b,c
        a=10;
        b=20;
        c=30;
        OR
        a=10,b=20,c=30;
         */

        int a=10,b=20,c=30;
        System.out.println("value of a:"+a); // + is concatination used to join multiple variables
        System.out.println("value of b:"+b);
        System.out.println("value of c:"+c);
        //System.out.println(a,b,c);      // , is not allowed
        System.out.println(a+b+c);        //here it will add all values
        System.out.println(a+" "+b+" "+c); //use " " to print all variables in one line
    }
}
