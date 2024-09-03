import java.util.Scanner;

public class sumOdd{
    
    public static void sum(int num[]){
        int sumNum= 0;
        for(int i=0; i<num.length; i++){
            if(num[i]%2!=0)
            sumNum=sumNum+num[i];
        }
        System.out.println("\n\nSum of the given odd numbers are: "+sumNum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many odd numbers do you want to take: ");
        int odd=sc.nextInt();

        System.out.print("Enter "+odd+" odd numbers: ");
        int num[]=new int [odd];
        for(int i=0; i<odd; i++){
            num[i]=sc.nextInt();  
        }

        System.out.print("The odd numbers are: ");
        for(int i=0; i<odd; i++){
            if(num[i]%2!=0)
            System.out.print(num[i]+" ");
        }

        sum(num);
        sc.close();
    }
}