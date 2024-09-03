import java.util.Scanner;

public class factorial {
    public static int fact(int num){
        if(num==0 || num==1){   
            return 1;
        }
        int fac= num*fact(num-1);
        return fac;
        
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number for factorial: ");
        int num=sc.nextInt();

        int ans = fact(num);
        System.out.println("Factorial of "+num+" is "+ans);
        sc.close();

    }
}
