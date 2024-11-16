 
import java.util.*;
class vector_demo {
	 
	public static void main(String[] args)
	{
	Vector<Integer> v = new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(6);
		System.out.println("Before deleting");
		System.out.println("Vector: " + v);
		System.out.println("Size: " + v.size());

		System.out.println("\nAfter deleting");
		boolean flag = v.removeElement(3);
		if (flag) {
	System.out.println("Element '3' has been removed");
		}
		else {
	System.out.println("Element '3' is not present in Vector");
		}

		System.out.println("Vector: " + v);
		System.out.println("Size: " + v.size());
	}
}
