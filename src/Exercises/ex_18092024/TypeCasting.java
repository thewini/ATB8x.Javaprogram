package Exercises.ex_18092024;

public class TypeCasting {
    public static void main(String[] args)
    {
        //Type Casting
        //widening--without data loss
        byte a=20;
        int b=a;   //implicit----jvm---valid
        int b1=(int)a;  //exlipicit----valid
        System.out.println(b);
        System.out.println(b1);

        //Narrowing----data loss
        int val=300;
       // byte b2=val;   //implicit---jvm---invalid
        byte val1=(byte)val;     //explicit----valid but there will be data loss
        System.out.println(val1);  //300 will be converted into 32bits then last 8bits will be taken by byte(destination) so that is why we get 44 as ouput

       //Example
        int course_fee=100;
        float gst=15.5f;
        //int total_price=course_fee+gst;     //narrowing---implicit(JVM)---invalid
        int total_price=course_fee+(int)gst;  //narrowing---exlpicit---valid but data loss
        System.out.println(total_price);
        float total_price1=course_fee+gst;          //widening---implicit(JVM)---valid
        float total_price2=(float)course_fee+gst;   //widening---exlpicit---valid
        System.out.println(total_price1);
        System.out.println(total_price2);


    }
}
