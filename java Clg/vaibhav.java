interface area{

final static float pi=3.14f;
float compute(float x,float y);
} 
class rectangle implements area{
 public float compute(float x,float y){
return(x*y);
}
}
class circle implements area{
	public float compute(float x,float y){
return(pi*x*x);
}
}
 class vaibhav{
public static void main(String[]args){
	rectangle r=new rectangle();
	circle c =new circle();
r.compute(3.0f,4.0f);
n=c.compute(10.0f,20.0f);
System.out.println(n);
}
}