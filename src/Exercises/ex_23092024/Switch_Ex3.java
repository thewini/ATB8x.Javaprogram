package Exercises.ex_23092024;

public class Switch_Ex3 {
    public static void main(String[] args)
    {
        //Switch condition----multiple cases(if multiple values has same output)----jdk>13
        int itemcode=001;
        switch(itemcode){
            case 001,003,005:
                System.out.println("these are electronic gadgets");
                System.out.println("these are toxic gadgets");
                break;
            case 002,004,006:
                System.out.println("these are mechanical gadgets");
                break;

        }
    }
}
