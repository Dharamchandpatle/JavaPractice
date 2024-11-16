class rectangle{
int length , width;
rectangle(int x , int y)
{
length = x;
width = y;
}
int area (){
return(length * width);
}
}
class rectarea{
public static void main(String args[])
{
rectangle r1 = new rectangle(20,30);
 int r2 = r1.area();
System.out.println("area ="+r2);
}
}

