class A extends Thread{
public void run(){
int i ;
for(i =1; i<=10;i++){
System.out.println("A = "+i);
}
}
}
class B extends Thread{
public void run(){
int j ;
for(j =1; j<=10;j++){
System.out.println("B = "+j);
}
}
}
class thread1{
public static void main(String args[]){
A a1=new A();
B b1 = new B();
a1.start();
b1.start();
}
}

