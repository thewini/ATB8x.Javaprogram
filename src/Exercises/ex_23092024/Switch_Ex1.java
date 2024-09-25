package Exercises.ex_23092024;

public class Switch_Ex1 {
    public static void main(String[] args)
    {
        //Switch Condition
        //Mon-1 Tue-2 Wed-3 Thur-4 FRi-5 Sat-6 Sun-7

        int day=3;    //print wed
        switch(day){
            case 1:
                System.out.println("Mon");
                break;                          //If break is removed it will search for wed first and then it will print wed,thurs,fri....till break is found
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Not sure");
                break;

        }

    }
}
