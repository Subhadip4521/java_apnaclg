import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1=sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2=sc.nextInt();

        int sum= num1+num2;
        System.out.println("Sum of "+num1+" and "+num2+" is: "+sum);

    }
}
