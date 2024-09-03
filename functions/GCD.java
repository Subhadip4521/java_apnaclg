import java.util.Scanner;

public class GCD {
    public static void gcd(int num1, int num2){
        int r;
        if(num1<num2){
            while(num2%num1!=0){
                r=num2%num1;
                num2=num1;
                num1=r;
            }
            System.out.println("GCD is: "+num1);
        }
        if(num1>num2){
            while(num1%num2!=0){
                r=num1%num2;
                num1=num2;
                num2=r;
            }
            System.out.println("GCD is: "+num2);
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1=sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2=sc.nextInt();

        gcd(num1, num2);
    }
}
