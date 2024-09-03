import java.util.Scanner;

public class even {
    public static void evenNum(int num){
        if(num%2==0){
            System.out.println(num+" is an even number.");
        }
        else{
            System.out.println(num+" is not an even number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        evenNum(num);
        sc.close();
    }
}
