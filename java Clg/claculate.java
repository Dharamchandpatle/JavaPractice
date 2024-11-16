class sum 
{
int a , b ;
sum(int x ,int y)
{
a= x;
b = y;
}
sum(int x)
{
a = b = x ;
}
int value()
{
return (a+b);
}
}
class claculate 
{
public static void main(String args[])
{
sum s1 = new sum(5,10);
sum s2=  new sum(5);

System.out.println("number of sum ="+s1.value());
System.out.println("number of sum ="+s2.value());


}
}
