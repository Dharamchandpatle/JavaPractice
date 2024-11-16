class nesting
{
  int m ,n;
nesting(int x, int y)
{
  m =x;
  n=y;
}
 int largest()
{
  if(m>=n)
return(m);
else return(n);
}
void display()
{
 int large=largest();
System.out.println("largest value="+large);
}
}
class nest
  {
  public static void main(String args[])
{
  nesting n1=new nesting(98,90);
  n1.display();
  }
}