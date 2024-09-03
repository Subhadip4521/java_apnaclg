import java.util.Scanner;

public class greater {
    public static void takeNum(int a, int b){
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else if(a<b){
            System.out.println(b+" is greater than "+a);
        }
        else{
            System.out.println("Both are equal.");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1=sc.nextInt();
        System.out.print("Enter number2: ");
        int num2=sc.nextInt();

        takeNum(num1, num2);
    }
}
