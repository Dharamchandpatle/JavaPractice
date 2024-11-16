class Area
{
int width , lenght ;
void getdata(int x,int y)
{
width =x;
lenght=y;
}
void putdata()
{
int z;
z = width*lenght;
System.out.println("Area="+z);
}
}
class rectArea
{
public static void main(String args[])
{
Area a1 = new Area();
a1.getdata(10,20);
a1.putdata();
}
}
