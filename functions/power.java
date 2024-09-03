import java.util.Scanner;

public class power {
    public static void toThePower(int x, int n){
        int ans=0;
        for(int i=1; i<=n*x; i*=x){
            ans=i*x;
        }
        System.out.print(x+" raise to the power "+n+" = "+ans);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x=sc.nextInt();
        System.out.print("Enter the number on the power: ");
        int n=sc.nextInt();

        toThePower(x,n);
    }
}
