import java.util.Scanner;

public class towerOfHanoi {
    public static void toh(int n, String source, String helper, String destination){
        if(n==1){
            System.out.println(n+" is transfered from "+source+" to "+destination);
            return;
        }
        toh(n-1, source, destination, helper);
        System.out.println(n+" is transfered from "+source+" to "+destination);
        toh(n-1, helper, source, destination);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of discs: ");
        int n=sc.nextInt();

        toh(n, "S", "H", "D");
    }
}
