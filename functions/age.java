import java.util.Scanner;

public class age {
    public static void vote(int age){
        if(age>18){
            System.out.println("You are eligible for vote.");
        }
        else{
            System.out.println("You are not eligible for vote.");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        vote(age);
        sc.close();
    }
}
