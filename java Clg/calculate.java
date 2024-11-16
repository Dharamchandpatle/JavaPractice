class room {
float length ;
float width ;
room(float x , float y)
{
length = x ;
width = y;
}
room(float x ){
length = width = x;
}
float area()
{
return(length*width);
}
}
class calculate{
public static void main(String args[])
{
room r1 = new room(5.0f,10.0f);
room r2 = new room(10.0f);
System.out.println("number of room ="+r1.area());
System.out.println("number of room ="+r2.area());
}
}
