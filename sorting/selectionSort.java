import java.util.Scanner;

public class selectionSort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
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
        for(int i=0; i<arr.length-1; i++){
            int smallest=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp= arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }
        printArray(arr);
    }
}
