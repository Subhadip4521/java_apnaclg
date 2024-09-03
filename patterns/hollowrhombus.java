import java.util.Scanner;

class hollowrhombus{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row=sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int s=1; s<=row-i+1; s++){
                System.out.print("  ");
            }
            for(int j=1; j<=row; j++){
                if(i==1 || j==row || i==row || j==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}