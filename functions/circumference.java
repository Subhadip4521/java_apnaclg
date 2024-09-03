import java.util.Scanner;

public class circumference {
    public static void ccfrnce(int rad){
        double pi=3.14;
        System.out.print("The circumference of the circle is: "+2*pi*rad);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int rad=sc.nextInt();
        ccfrnce(rad);   
        sc.close();
    }
}
