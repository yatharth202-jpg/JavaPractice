package PracticeProblem;
 class Pen {
  String colour;
  String type ;

  public void write() {
 System.out.print("Write something");
  }
}

public class OOPS{
     public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.colour = "Pink";
        pen1.type = "gel";

        pen1.write();

     }
}