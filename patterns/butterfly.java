import java.util.Scanner;

class butterfly{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number fo rows: ");
        int row= sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int s=1; s<=2*(row-i); s++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row-i+1; j++){
                System.out.print("* ");
            }
            for(int s=1; s<=2*i-2; s++){
                System.out.print("  ");
            }
            for(int j=1; j<=row-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}