import java.util.Scanner;

public class numComparisn {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1= sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2= sc.nextInt();

        if (num1==num2){
            System.out.println("Both numbers are equal.");
        }
        else if(num1>num2){
            System.out.println(num1+" is greater than "+num2);
        }
        else{
            System.out.println(num2+" is greater than "+num1);
        }
    }
}
