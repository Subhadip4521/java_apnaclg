import java.util.Scanner;
public class hollowRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numnber of rows: ");
        int row= sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=row+1; j++){
                if(j==1 || j==row+1 || i==1 || i==row){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}
