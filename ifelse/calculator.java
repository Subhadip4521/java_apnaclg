import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1=sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2=sc.nextInt();
        System.out.println("Enter 1 for addition.");
        System.out.println("Enter 2 for subtraction.");
        System.out.println("Enter 3 for multiplication.");
        System.out.println("Enter 4 for division.");
        System.out.println("Enter 5 for checking remainder.");
        System.out.print("Enter which operation you want: ");
        int sign =sc.nextInt();

        switch(sign){
            case 1:
                System.out.println(num1+ " + " +num2 +" = " +(num1+num2));
                break;
            case 2:
                System.out.println(num1 + " - " +num2 +" = " +(num1-num2));
                break;
            case 3:
                System.out.println(num1 + " x " +num2 +" = " +(num1*num2));
                break;
            case 4:
                System.out.println(num1 + " / " +num2 +" = " +(num1/num2));
                break;
            case 5:
                System.out.println("The ramainder of "+num1+" / "+num2+" is " +(num1%num2));
                break;
            default:
                System.out.println("Invalid input sign...");
        }


    }
}
