class multi extends Thread{
public void run(){
for(int i =1 ; i<=5 ; i++){
System.out.println("thread i ="+i);
}
}
}
class multi2 implements Runnable{
public void  run(){
for(int j =1 ; j<=5 ; j++){
System.out.println("thread j ="+j);
}
}
}
class exarunnable{
public static void main(String args[]){
multi m1 = new multi();
m1.start();
multi2 m2 = new multi2();
Thread t = new Thread(m2);
t.start();
}
}
