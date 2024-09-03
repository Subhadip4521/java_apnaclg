import java.util.Scanner;

public class floyd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numnber of rows: ");
        int row= sc.nextInt();
        int number=1;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.print("\n");
        }
    }
}
