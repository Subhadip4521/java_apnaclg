import java.util.Scanner;


//here we have made the height of the stack log n... so time complexity is log n

class xToThePowerN2{
    public static int printXraiseN(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(n%2==0)
            return printXraiseN(x, n/2)*printXraiseN(x, n/2);
        else 
            return printXraiseN(x, n/2)*printXraiseN(x, n/2)*x;   
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