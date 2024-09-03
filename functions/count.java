import java.util.Scanner;

public class count {
    public static void select(int arr[]){
        int pve=0, nve=0, zero=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                pve=pve+1;
            }
            else if(arr[i]<0){
                nve=nve+1;
            }
            else{
                zero=zero+1;
            }
        }
        System.out.println("Positive numbers from your given numbers are: "+pve);
        System.out.println("Negative numbers from your given numbers are: "+nve);
        System.out.println("Zeros from your given numbers are: "+zero);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("How many numbers do you want to give: ");
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.print("Enter numbers: ");
        for(int i=0; i<arr.length; i++ ){
            arr[i]=sc.nextInt();
        }
        
        System.out.print("Your numbers are: ");
        for(int i=0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        select(arr);   
        sc.close(); 
    }
}
