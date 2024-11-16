class superclass{
int x;
superclass(int a){
this.x = a;
}
}
//void show(){

//System.out.println("superclass x ="+x);


class subclass extends superclass{
int y ;
subclass(int a , int b){
super(a);
this.y = b;
}
}
void show(){
System.out.println("superclass x ="+x);
//System.out.println("superclass y ="+y);
}
class exariding {
public static void main(String args[])
{
subclass s = new subclass(10,20);
s.show();
}
}