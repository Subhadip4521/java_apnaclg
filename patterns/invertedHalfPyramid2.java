import java.util.Scanner;

public class invertedHalfPyramid2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numnber of rows: ");
        int row= sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int space=1; space<=row-i; space++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
