import java.io.DataInputStream;
class exaswitch{
public static void main(String arg[])
{
DataInputStream in=new DataInputStream(System.in);
int month,year;
try
{
System.out.println("enter month");
month=Integer.parseInt(in.readLine());
System.out.println("enter year");
year=Integer.parseInt(in.readLine());
switch(month)
{
case 4:
case 6:
case 9:
case 11:
System.out.println("30 Days in your month");
break;
case 2:
{
if((year%4)==0)
{
System.out.println("29 days in your months");
}
else{
System.out.println("28 days in your months");

}
break;
}

default:
System.out.println("31 days in your month");
break;
}
}
catch(Exception e){}
}
}


