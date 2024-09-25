package Exercises.ex_23092024;

public class Switch_Ex2 {
    public static void main(String[] args)
    {
        //Switch Condition
        //Web automation:I will ask which browser you want to run the code

        String browser="safari";
        switch(browser){
            case "chrome":
                System.out.println("Starting the chrome browser");
                break;
            case "edge":
                System.out.println("Starting the edge browser");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                break;
            case "safari":
                System.out.println("Starting the safari browser");
                break;
            default:                                                   //default can be placed anywhere
                System.out.println("No idea which browser is this");
                break;

    }

        //int a=10;
        // switch(a)
        // {
        //}
        //this is valid syntax it will print 10,case break is optional.

        //boolean b=true;
        //switch(b)
        //{
        //}
        //This is invalid boolean is not supported

        //long lo=300l ;
        //switch((int)lo)
        //{
        //}
        //long is valid but it should be converted to int first
    }

}
