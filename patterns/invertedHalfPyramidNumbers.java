import java.util.Scanner;

public class invertedHalfPyramidNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numnber of rows: ");
        int row= sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=row-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
}