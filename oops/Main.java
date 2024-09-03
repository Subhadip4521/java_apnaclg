class Main1{
    int x=10;
}
class Main2{
    final int y=10;
}

class Static{
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects before version 1.7.");
    }
}
class Public{
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
}

public class Main {
    public static void main(String[] args) {
        // Main1 m1= new Main1();
        // Main1 m2= new Main1();
        // System.out.println(m1.x);
        // m2.x=20;    //modifying the value of x
        // System.out.println(m2.x);

        // Main2 m3=new Main2();
        // // m3.y=30; //can't change the value because of final keyword
        // System.out.println(m3.y);


        Static s=new Static();
        s.myStaticMethod();
        Public p=new Public();
        p.myPublicMethod();
    }
}
