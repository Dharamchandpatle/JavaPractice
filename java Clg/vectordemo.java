import java.util.Vector;

public class VectorDemo {
  public static void main(String args[])
  {
    Vector v = new Vector();
    v.add("Geeks");
    v.add("for");
    v.add("Geeks");
    v.add("10");
    v.add("20");
    System.out.println("Vector: "+ v);
      System.out.println(" ");
    System.out.println("The element is: "
            + v.elementAt(3));
  }
}