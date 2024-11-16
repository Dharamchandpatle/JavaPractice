class A extends Thread {
public void run(){
for( int i = 1 ; i<=10 ; i++){
System.out.println("A="+i);
}
}
}
class B extends Thread {
public void run(){
for(int j =1 ; j<=10 ; j++){
System.out.println("B = "+j);
}
}
}
class exaThread1{
public static void main(String args[]){
A a = new A();
//B b = new B();
a.start();
//b.start();
}
}
