import java.lang.Math;
import java.io.DataInputStream;
class exaroot{

public static void main(String args[])
{
DataInputStream in=new DataInputStream(System.in);

double a , n;
 try
{
System.out.println("enter value of n");
n=Integer.parseInt(in.readLine());

a = Math.sqrt(n);
System.out.print("a = "+a);
}
catch(Exception e){}
}
}
