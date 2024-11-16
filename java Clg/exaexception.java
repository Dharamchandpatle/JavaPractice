class myexception extends Exception{
myexception (String msg ){
super(msg);
}
}
class testmyexception {
public static void main(String args[]){
int x = 5 , y= 1000;
try{
float z= x/y;
if(z<0.01f){
throw new myexception("Number is two small ");
}
}
catch (myexception e){
System.out.println("catch my exception ");
System.out.println(e.getMessage());
}
}
}