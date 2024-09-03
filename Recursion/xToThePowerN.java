import java.util.Scanner;

class xToThePowerN{
    public static int printXraiseN(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        return x*printXraiseN(x, n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int x=sc.nextInt();
        System.out.print("Enter base: ");
        int n=sc.nextInt();

        int result= printXraiseN(x,n);
        System.out.print(x+" ^ "+n+" = "+result);
    }
}