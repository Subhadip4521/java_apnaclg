import java.util.Scanner;

public class Bits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        
        System.out.print("Enter position: ");
        int pos=sc.nextInt();

        int bitmask=1<<pos;


        // GET bit
        // if((bitmask&num)==0){
        //     System.out.println("bit was zero");
        // }
        // else{
        //     System.out.println("bit was one");
        // }

        // SET bit
        // int newNum= bitmask | num;
        // System.out.println(newNum);

        //clear bit
        // int notBitMask= ~(bitmask);
        // int newNum= notBitMask & num;
        // System.out.println(newNum);

        // update bit
        System.out.print("Enter operation (0 or 1): ");
        int opn= sc.nextInt();      //1--> set  bit and 0--> clear bit
        if(opn==1){
            int newNum= bitmask|num;
            System.out.println(newNum);
        }
        else if(opn==0){
            int notBitMask=~(bitmask);
            int newNum= notBitMask & num;
            System.out.println(newNum); 
        }
        else{
            System.out.println("Invalid operation input.");
        }

    }

}
