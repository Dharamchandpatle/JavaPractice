class perimeter
{
  int length,width;
perimeter ()
{
  length=0;
  width=0;
}
  perimeter(int x,int y)
{
  length=x;
  width=y;
}
 void cal()
{
 int p;
p=2*(length+width);
System.out.println("the perimeter of reactangle ="+p);
}
}

class cons
{
  public static void main(String args[])
{
  perimeter p1= new perimeter();
  perimeter p2=new perimeter(5,10);
  p2.cal();
}
}