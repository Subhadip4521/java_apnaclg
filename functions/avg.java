import java.util.Scanner;

public class avg {
    public static void avgNum(int num1, int num2, int num3) {
        float average=(num1+num2+num3)/3;
        System.out.println("The average of "+num1+", "+num2+", "+num3+" is: "+average);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1=sc.nextInt();
        System.out.print("Enter number2: ");
        int num2=sc.nextInt();
        System.out.print("Enter number3: ");
        int num3=sc.nextInt();

        avgNum(num1, num2, num3);
    }
}
