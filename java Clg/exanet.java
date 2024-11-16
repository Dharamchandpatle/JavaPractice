import java.net.*;
public class exanet
{
public static void main(String args[]) throws Exception
{
if(args.length!=1)
{
System.out.println("this is computer");
System.exit(1);}
InetAddress I=InetAddress.getByName(args[0]);
System.out.println(I);
}
}
