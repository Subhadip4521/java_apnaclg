import java.util.Scanner;

public class findIn2Darray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row=sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col=sc.nextInt();

        int[][] nums=new int[row][col];

        System.out.println("Now enter numbers in rows and columns.");

        for(int i=0; i<row; i++){
            System.out.println("Row "+i+": ");
            for(int j=0; j<col; j++){
                System.out.print("    ");
                System.out.print("Col "+j+": ");
                nums[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter the number to find it in the array: ");
        int x=sc.nextInt();

        System.out.println("Your matrix: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(nums[i][j]==x){
                    System.out.print(x+" is present at the index: "+" ( "+i+" , "+j+" ) ");
                }
            }
        }
    }
}
