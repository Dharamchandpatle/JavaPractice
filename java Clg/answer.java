abstract class shape
{
abstract void drow();
}
class shaper extends shape{
void drow(){
System.out.println("value of x= 30");
System.out.println("value of y= 60");
}
}
class answer{
public static void main(String args[]){
shaper s = new shaper();
s.drow();
}
}



