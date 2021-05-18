package Day1;

import java.util.Scanner;

public class MarksIfElsse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks");

        int marks = sc.nextInt();

        //int marks = 80;
        if (marks>=85){
            System.out.println("Distinction congratulations!!");
        }
        else if (marks>=50 && marks<85){
            System.out.println("first class congratulations!!");
        }
        else if (marks>40 && marks<50){
            System.out.println("Second class congratulation!!");
        }
        else if (marks>=35 && marks<40){
            System.out.println("Third class congratulations !!");
        }
        else if (marks<35){
            System.out.println("Fail, Better luck next time");
        }

    }
}
