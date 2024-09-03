import java.util.Scanner;

public class sum {

    public static int sumNum(int a, int b){
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1=sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2=sc.nextInt();

        int sum= sumNum(num1, num2);
        System.out.print("The sum of "+num1+ " and "+num2+" is: "+sum);
        sc.close();
    }
}
