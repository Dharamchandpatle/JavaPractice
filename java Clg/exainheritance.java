class sum{
int a,b;
sum(int x , int y ){
a = x ;
b = y;
}
int calculate(){
return(a+b);
}
}
class multi extends sum{
int c ;
multi(int x , int y , int z)
{
super(x , y);
c=x ;
}
int result()
{
return(a*b*c);
}
}
class exainheritance{
public static void main(String args[])
{
multi m1 = new multi(10,20,30);
System.out.println("this calculation is ="+m1.calculate());
System.out.println("this result is ="+m1.result());

}
}