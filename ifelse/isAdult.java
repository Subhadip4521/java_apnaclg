import java.util.Scanner;


public class isAdult {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age= sc.nextInt();

        if (age>=18 && age<=60) {
            System.out.println("You are an adult.");
        }
        else if(age>60){
            System.out.println("You are a retired person.");
        }
        else{
            System.out.println("You are a minor.");
        }
    }
}
