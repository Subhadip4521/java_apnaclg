import java.util.Scanner;

public class rating {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("1 star ---> Not satisfied.");
        System.out.println("2 star ---> satisfied.");
        System.out.println("3 star ---> Nice, can be better.");
        System.out.println("4 star ---> Good service.");
        System.out.println("5 star ---> Best service.");
        System.out.print("Please give rating: ");
        int rating= sc.nextInt();

        switch (rating) {
            case 1:
                System.out.println("You are not satisfied.\nSorry for your inconvinience.");
                break;
            case 2:
                System.out.println("You are satisfied.\nThank you for using our service.");
                break;
            case 3:
                System.out.println("Thank you, we will make our service better.");
                break;
            case 4:
                System.out.println("Thank you. Hopefully you will use our service again.");
                break;
            case 5:
                System.out.println("Thank you for the 5 star rating. Please use our service again.");
                break;
        
            default:
                System.out.println("Invalid input...");
                break;
        }
    }
}
