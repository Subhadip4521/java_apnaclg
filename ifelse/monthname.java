import java.util.Scanner;

public class monthname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to know the first month.");
        System.out.println("Enter 2 to know the second month.");
        System.out.println("Enter 3 to know the third month.");
        System.out.println("Enter 4 to know the fourth month.");
        System.out.println("Enter 5 to know the fifth month.");
        System.out.println("Enter 6 to know the sixth month.");
        System.out.println("Enter 7 to know the seventh month.");
        System.out.println("Enter 8 to know the eighth month.");
        System.out.println("Enter 9 to know the ninth month.");
        System.out.println("Enter 10 to know the tenth month.");
        System.out.println("Enter 11 to know the eleventh month.");
        System.out.println("Enter 12 to know the twelveth month.");

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("1st month of the year is JANUARY.");
                break;
            case 2:
                System.out.println("2nd month of the year is FEBRUARY.");
                break;
            case 3:
                System.out.println("3rd month of the year is MARCH.");
                break;
            case 4:
                System.out.println("4th month of the year is APRIL.");
                break;
            case 5:
                System.out.println("5th month of the year is MAY.");
                break;
            case 6:
                System.out.println("6th month of the year is JUNE.");
                break;
            case 7:
                System.out.println("7th month of the year is JULY.");
                break;
            case 8:
                System.out.println("8th month of the year is AUGUST.");
                break;
            case 9:
                System.out.println("9th month of the year is SEPTEMBER.");
                break;
            case 10:
                System.out.println("10th month of the year is OCTOBER.");
                break;
            case 11:
                System.out.println("11th month of the year is NOVEMBER.");
                break;
            case 12:
                System.out.println("12th month of the year is DECEMBER.");
                break;
        
            default:
                System.out.println("Invalid input...");
                break;
        }

    }
}
