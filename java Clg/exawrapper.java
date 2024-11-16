import java.io.*;
import java.io.DataInputStream ;
import java.lang.*;
class  exawrapper{
public static void main(String args[]){
Float principalammount = new Float(0);
Float intrestrate = new Float(0);
int years = 0 ;
try{
DataInputStream in = new DataInputStream(System.in);

System.out.println("Enter principal ammount = ");
System.out.flush();
String principalstring = in.readLine();
principalammount = Float.valueOf(principalstring);

System.out.println("Enter intrest rate = ");
System.out.flush();
String intreststring = in.readLine();
intrestrate = Float.valueOf(intreststring);
 
System.out.println("Enter number of years  = ");
System.out.flush();
String yearstring = in.readLine();
years = Integer.parseInt(yearstring);
}
catch(IOException e){
System.out.println("input output error ");
}
float value = loan(principalammount.floatValue(),intrestrate.floatValue(),years);
printline();
System.out.println("final value = "+value);
printline();
}
static float loan(float p , float r , int n ){
int year = 1 ;
float sum = p;
while(year<=n)
{
sum = sum*(1+r);
year = year+1;
}
return sum ;
}
static void printline(){
for(int i = 1 ; i <= 40 ; i++){
System.out.print("=");
}
System.out.println(" ");
}
}


