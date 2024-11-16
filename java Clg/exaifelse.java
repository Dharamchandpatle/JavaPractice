import java.io.DataInputStream;
class exaifelse
{
public static void main(String args[])
{
try{
DataInputStream in = new DataInputStream(System.in);
int n;
System.out.println("enter value of n ");
n = Integer.parseInt(in.readLine());
 
if((n%2)==0)
{
System.out.println("even");
}
else{
System.out.println("odd");ut
}
}
catch(Exception e){


}
}
}