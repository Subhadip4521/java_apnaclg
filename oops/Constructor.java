class Number{
    int x;
    Number(){
        x=10;
        int y=20;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Number n=new Number();
        System.out.println(n.x);
        // System.out.println(n.y);    //It will give error as y is the local variable.
        
    }
}
