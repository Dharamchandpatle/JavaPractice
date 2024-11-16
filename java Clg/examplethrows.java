class examplethrows{
static void devide()
throws ArithmeticException{
int x =22 , y=0 , z ;
z=x/y;
}
public static void main(String args[]){
try{
devide();
}
catch(ArithmeticException e){
System.out.println("Catch the exception "+e);
}
}
}
