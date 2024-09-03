import java.util.Scanner;

public class palindromicNumberPyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row= sc.nextInt();
        
        for(int i=1; i<=row; i++){
            for(int s=1; s<=row-i+1; s++){
                System.out.print("  ");
            }
            for(int j=i; j>=2; j--){
                System.out.print(j+" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(k+" ");
            }
            sc.close();
            
            System.out.println();
        }
    }
}
