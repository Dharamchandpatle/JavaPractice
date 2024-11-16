class spare{
static final double pi = 3.14 ;
static int count = 0 ;
double radius ;
double xcenter ;
double ycenter ;
double zcenter ;
spare (double sradius , double x , double y,double z )
{
radius = sradius ;
xcenter = x;
ycenter = y;
zcenter = z;
++count ;
}
static int getcount(){
return count ;
}
double volume()
{
return (4.0 / 3.0*pi*radius*radius*radius);
}
}
class creatspare{
public static void main(String args[])
{
System.out.println("number of objects ="+spare.getcount());
spare vall = new spare(4.0 , 0.0 , 0.0 , 0.0 );
System.out.println("number of objects ="+spare.getcount());
spare globe = new spare(12.0 , 1.0 , 1.0 , 1.0 );
System.out.println("number of objects ="+spare.getcount());
System.out.println(" vall volume = "+vall.volume());
System.out.println("gloabe volume ="+globe.volume());
}
}




