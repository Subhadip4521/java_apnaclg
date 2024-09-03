import java.util.Scanner;

public class prime {
    public static void primeNum(int num){
        if(num<=0){
            System.out.println("Invalid number.");
        }
        else if(num==1){
            System.out.println(num+" is not prime number.");
        }
        else if(num==2){
            System.out.println(num+" is a prime number.");
        }
        else{
            for(int i=2; i<num; i++){
                if(num%i==0){
                    System.out.println(num+" is not a prime number.");
                    break;
                }
                
                else{
                    System.out.println(num+" is a prime number.");
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        primeNum(num);
        sc.close();
    }
}
