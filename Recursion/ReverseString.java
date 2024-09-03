import java.util.Scanner;

class ReverseString{
    public static void printReverse(String str, int index){
        if(index==0){
            System.out.print(str.charAt(index));
            return;
        }
        
        System.out.print(str.charAt(index));
        printReverse(str, index-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sc.next();
        System.out.print("String after reversing: ");
        printReverse(s, s.length()-1);
    }
}