import java.util.Scanner;


public class recursion1 {
    public static void printNum(int n){
        if(n==0){
            return;
        }
        else{
            System.out.print(n+" ");
            printNum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        System.out.println();
        printNum(num);
    }
}
