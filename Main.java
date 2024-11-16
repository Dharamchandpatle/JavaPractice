class Overloaded3 {
public void m1(float d)
{
System.out.println("float Version " +d);
}
public void m1(double S)
{
System.out.println("double Version "+ S);
}
public static void main(String args[])
{
Overloaded3 t=new Overloaded3();
t.m1(10);
t.m1('J');
}
}