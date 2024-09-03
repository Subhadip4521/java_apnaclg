import java.util.Scanner;

public class InsertionSort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.print("Enter numbers in the array: ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.print("Numbers in your array before sorting: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Numbers in your array after sorting: ");
        for(int i=0; i<arr.length; i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=current;
        }

        printArray(arr);
    }
}