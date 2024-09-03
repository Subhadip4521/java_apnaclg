import java.util.Scanner;

public class factorial {

    public static void fact(int num){
        int fac=1;
        if(num==0 || num==1){
            System.out.print("The factorial of "+num+" is: ");
            System.out.print(1);
        }
        else if(num>1){
            for(int i=num; i>=1; i--){
                fac=fac*i;
            }
            System.out.print("The factorial of "+num+" is: ");
            System.out.print(fac);
        }
        else{
            System.out.println("Invalid number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        int num= sc.nextInt();

        fact(num);
    }
}
