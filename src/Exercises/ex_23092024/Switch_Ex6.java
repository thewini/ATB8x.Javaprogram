package Exercises.ex_23092024;

public class Switch_Ex6 {
    public static void main(String[] args)
    {
        //Switch Condition---concatenation is also allowed in switch

        char ch='A';       //case value
        switch(ch){
            case 'A':
                System.out.println('A'+1);
                break;
            case 'B'+1:
                System.out.println('B');
                break;
        }
    }
}
