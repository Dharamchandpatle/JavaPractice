
import java.io.DataInputStream;
class maths
{
int a,b,r;
void add(int x ,int y ){
a =x;
b=y;
r= a+b;
}
void sub(int x ,int y )
{
a =x;
b=y;
if(a>b)
r=a-b;
else 
r=b-a;
}
void multi(int x,int y){
a =x;
b=y;
r= a*b;
}
void devide(int x , int y){
a =x;
b=y;
if(a>b)
r=a/b;
else
r=b/a;

}
void result()
{
System.out.println("first no="+a);
System.out.println("second no="+b);
System.out.println("result ="+r);
}
}
class demo1{
public static void main(String args[])
{
maths m1 = new maths();
DataInputStream in = new DataInputStream(System.in);
int p , q;
try{
System.out.println("enter first number");
p= Integer.parseInt(in.readLine());
System.out.println("enter second number");
q= Integer.parseInt(in.readLine());
m1.add(p,q);
m1.result();
m1.sub(p,q);
m1.result();
m1.multi(p,q);
m1.result();
m1.devide(p,q);
m1.result();
}
catch(Exception e){}
}
}


