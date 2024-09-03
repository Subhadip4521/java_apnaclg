import java.util.Scanner;

public class fibonacci {
    public static void fib(int f, int s, int n) {
        
        if(n==0){
            return;
        }
        int t=f+s;
        System.out.print(t+" ");
        fib(s, t, n-1);
        
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numbers of terms: ");
        int n=sc.nextInt();
        System.out.print("Fibonacci series: ");
        if(n==0){
            System.out.print("Invalid input...");
        }
        if(n==1){
            System.out.print("0 ");
        }
        if(n==2){
            System.out.print("0 1 ");
        }
        if(n>2){
            System.out.print("0 1 ");
            fib(0,1,n-2);
        }




    }
}
