import java.io.DataInputStream ;
class exalader
{
public static void main(String args[])
{
int n=0 ;
String color=null;
System.out.println("enter color code = ");
DataInputStream in =new DataInputStream(System.in);
try{
n=Integer.parseInt(in.readLine());
if(n==0)

color = "black";

else if (n==1)
color = "red";
else if (n==2)
color = "blue";
else if (n==3)
color = "grey";
else
color = "white";
}
catch(Exception e){
}
System.out.println("your code is = "+n);
System.out.println("and color is = "+color);
}
}