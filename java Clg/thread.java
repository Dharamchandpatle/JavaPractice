class A extends Thread {
public void run(){
int i ;
for(i = 1 ; i<=10 ; i++){
if(i==1)
Thread.yield();
System.out.println("A="+i);
}
}
}
class B extends Thread{
public void run(){
int j;
for(j=1;j<=10;j++){
if(j==3){
try {
sleep(10000);
}
catch(Exception e){}
}
if(j==4)
stop();
System.out.println("b="+j);
}
}
}

class thread{
public static void main(String args[]){
A a1=new A();
B b1 = new B();
a1.start();
b1.start();
}
}

