class Super{
//protected 
public void mathod(){
System.out.println("methods super ");
}
}
class sub extends Super{
//protected 
public void mathod(){
System.out.println("method sub");
}
}
class exadaynamic{
public static void main(String args[])
{
Super a = new sub();
a.mathod();
}
}
