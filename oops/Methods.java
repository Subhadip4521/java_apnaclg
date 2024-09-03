import java.util.Scanner;

class Car{
    void carName(){
        System.out.println("I have a care named Dezire.");
    }
    void speed(int maxSpeed){
        System.out.println("The maximum speed of the car is: "+maxSpeed);
    }
}

public class Methods {
    public static void main(String[] args) {
        Car c=new Car();
        c.carName();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter maximum speed: ");
        int maxSpeed=sc.nextInt();
        c.speed(maxSpeed);
    }
}
