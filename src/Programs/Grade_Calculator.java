package Programs;

public class Grade_Calculator {
    public static void main(String[] args){
        //Grade Calculator:Write a program that calculates and displays the letter grade for a given numerical
        // score (e.g., A, B, C, D, or F) based on the following grading scale:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59


        //1.Find the user inputs
        //score---int score
        //grade---char grade

        //2.Basic logic
        //if (score>=90 && score<=100) -->garde=A
        //else if (score>=80 && score<=89) -->grade=B
        //else if (score>=70 && score<=79) -->grade=C
        //else if (score>=60 && score<=69) -->grade=D
        //else garde=F


        //Ask interviewer for datatypes and values

        char grade='F';
        int score=105;
        if (score>=90 && score<=100) {
            grade = 'A';
        }
        else if (score>=80 && score<=89) {
            grade = 'B';
        }
        else if (score>=70 && score<=79){
            grade = 'C';
        }
        else if (score>=60 && score<=69) {
            grade = 'D';
        }
        else if (score<=0 || score>100) {    //negative test case,here || is given bcz it should satisfy either of the condition
            grade='O';
            System.out.println("Lol are you god?");
        }
        else{
            grade='F';
        }
        System.out.println("Your grade is:" + grade);


    }
}
