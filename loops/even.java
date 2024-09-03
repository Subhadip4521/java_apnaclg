

import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();

        System.out.print("Even numbers are: ");
        for(int i=1; i<=num; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
