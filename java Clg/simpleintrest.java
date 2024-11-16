class simpleintrest{
float si , pa , r , t;
void getdata(float x ,float y ,float z)
{
pa = x;
r = y;
t = z;
}
void calculate()
{
 si = (pa*r*t)/100;
}
void show(){
System.out.println("principal amount = "+pa);
System.out.println("principal rate = "+r);
System.out.println("principal time = "+t);
System.out.println("principal simpleintrest = "+si);
}
}
class demo{
public static void main(String args[])
{
simpleintrest s1 = new simpleintrest();
s1.getdata(10.0f,20.0f,30.0f);
s1.calculate();
s1.show();
}
}