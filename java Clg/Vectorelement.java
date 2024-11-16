import java.util.Vector;

public class Vectorelement{
  public static void main(String args[])
  {
    Vector v = new Vector();
    v.add("a");
    v.add("b");
    v.add("c");
    v.add("10");
    v.add("20");
    System.out.println("Vector: "+ v);
    System.out.println(" ");
    System.out.println("The element is: "
            + v.elementAt(3));
  }
}