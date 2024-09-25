package Exercises.ex_06092024;

public class Concatenation {
    public static void main(String[] args) {
        int a = 10, b = 20;
        String first_name = "Vikku";
        String second_name = "Pikku";
        System.out.println(a + b);     //for integers it will add
        System.out.println(first_name+ " " +second_name);        //for string it will combine(+ is concatenation)

        System.out.println(first_name+second_name+a+b);     //if string is first then + will act as concatenation and it will combine the values
        System.out.println(a+b+first_name+second_name);     //if int is first them + will add the values for int datatype and combine the values for string
        System.out.println(first_name+second_name+(a+b));

    }
}
