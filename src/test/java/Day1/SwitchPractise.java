package Day1;

public class SwitchPractise {
    public static void main(String[] args) {

        int op = 8;
        switch (op){
            case 1 :
                System.out.print("Sunday");
                break;
            case 2:
                System.out.print("monday");
                break;
            case 3:
                System.out.print("Tuesday");
                break;
            case 4:
                System.out.print("Wednesday");
            case 5:
                System.out.print("Thursday");
                break;
            case 6:
                System.out.print("Friday");
                break;
            default:
                System.out.print("enter proper number");
        }

    }
}
