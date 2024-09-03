
import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size=sc.nextInt();

        int array[]=new int[size];

        System.out.print("Enter numbers: ");
        for(int i=0; i<array.length; i++){
            array[i]=sc.nextInt();
        }
        System.out.print("Your numbers: ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
