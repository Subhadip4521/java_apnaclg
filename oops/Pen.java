class NewPen{
    String color;
    String type;

    public void writing(){
        System.out.println("I am writing something...");
    }

    void penColour(){
        System.out.println(this.color);
    }
}

public class Pen {
    public static void main(String[] args) {
        NewPen pen= new NewPen();
        pen.color="Blue";
        pen.type="Gel";

        NewPen pen2= new NewPen();
        pen2.color="Blue";
        pen2.type="Gel";

        pen2.penColour();
        System.out.println(pen.color);
        System.out.println(pen.type);
        pen.writing();
    }
}
