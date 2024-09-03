import java.util.Scanner;

public class findNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter numbers in array: ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter a number you want to find in the array: ");
        int x=sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                System.out.println(x+" has been found at index "+i);
            }
        }
    }
}
