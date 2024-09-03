import java.util.Scanner;

public class naturalnumbers{
    public static void main(String[] args) {
        System.out.print("sum of how many natural numbers: ");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();

        int i,sum=0;
        System.out.print("First "+num+" natural numbers are: ");
        for(i=1; i<num+1; i++){
            System.out.print(i+" ");
            sum=(i*(i+1)/2);
        }
        System.out.println("\nSum of first "+num+" natural numbers are: "+sum);
    }
}
