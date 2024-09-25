package Exercises.ex_23092024;

public class Switch_Ex4 {
    public static void main(String[] args)
    {
        //Switch Condition----using arrow we can eliminate break---jdk>13

        int itemcode= 003;
        switch(itemcode){
            case 001,002 ->System.out.println("its a laptop");    //in this case we can have only one print statement whereas in normal syntax using break can use multiple print statements
            case 003 ->System.out.println("its a mobile");
            case 004,005 ->System.out.println("its a desktop");

        }

    }
}
