import java.util.Scanner;

public class sumNum {
    public static void printSum(int s,int num, int sum){
        if(s>num){
            System.out.print(sum);
            return;
        }
        else{
            sum=sum+s;
            printSum(s+1,num, sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of natural numbers: ");
        int num=sc.nextInt();

        printSum(1,num,0);
    }
}
