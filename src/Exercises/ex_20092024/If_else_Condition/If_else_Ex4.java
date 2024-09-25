package Exercises.ex_20092024.If_else_Condition;

public class If_else_Ex4 {
    public static void main(String[] args) {
        //Example4
        boolean a1=true;
        a1=!a1;
        if(2+2>4) {
            System.out.println("Inside the loop");     //else condition is not there so, if condition will be terminated
        }
        System.out.println(a1);        //a1=false is printed
    }
}
