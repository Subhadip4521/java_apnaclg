import java.util.Scanner;


public class fibonacci {
    public static void fibo(int n){
        int first=0;
        int second=1;
        int third;

        System.out.print("Fibonacci series: ");
        if(n==1){
            System.out.println(first);
        }
        if(n==2){
            System.out.println(second);
        }
        if(n>2){
            System.out.print(first+" "+second+" ");
            for(int i=0; i<n-2; i++){
                third=first+second;
                System.out.print(third+" ");
                first=second;
                second=third;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();

        fibo(n);
        sc.close();
    }
}
