import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        //concatenation
        System.out.println("Your name is: "+name);

        // //length()
        // System.out.println("length of name is: "+name.length());

        // //charAt()
        // for(int i=0; i<name.length(); i++){
        //     System.out.println(name.charAt(i));
        // }

        //compareTo()
        // String name1="Amir";
        // String name2="Amir";

        //name1 > name2 --> +ve value
        //name1 = name2 --> 0
        //name1 < name2 --> -ve value


        // //This method is recommended to use while comparing.
        // if(name1.compareTo(name2)==0){
        //     System.out.println("Strings are equal.");
        // }
        // else{
        //     System.out.println("Strings are not equal.");
        // }


        //This method of comparing is not good because sometimes testcases maybe fail here. 
        // if(name1==name2){
        //     System.out.println("Strings are equal.");
        // }
        // else{
        //     System.out.println("Strings are not equal.");
        // }


        //substring(start index, end index)
        // String name="subhadip";
        // //it returns s to b means 0 to 3-1=2.
        // //if we don't pass end index it will be by default the last index.
        // System.out.println(name.substring(0,3));

        //strings are immutable.

    }
}
