import java.util.Scanner;

public class hollowButterfly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number fo rows: ");
        int row= sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=2*row; j++){
                if(j==1 || j==row*2 || i==j || i+j==2*row+1)
                    System.out.print("* ");
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=1; i<=row; i++){
            for(int j=1; j<=2*row; j++){
                if(j==1 || j==2*row || i+j==row+1 || j-i==row)
                    System.out.print("* ");
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
