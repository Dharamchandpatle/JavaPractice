class a extends Thread{
public void run(){
System.out.println("This is thread a and thread id = "+Thread.currentThread().getId()+"\tThread priority = "+Thread.currentThread().getPriority());
}
}
class b extends Thread{
public void run(){
System.out.println("This is thread b and thread id = "+Thread.currentThread().getId()+"\tThread priority = "+Thread.currentThread().getPriority());
}
}
class c extends Thread{
public void run(){
System.out.println("This is thread c and thread id = "+Thread.currentThread().getId()+"\tThread priority = "+Thread.currentThread().getPriority());
}
}
class exapriority{
public static void main(String args[]){
a a1 = new a();
b b1 = new b();
c c1 = new c();

a1.setPriority(Thread.MIN_PRIORITY);
b1.setPriority(Thread.NORM_PRIORITY);
c1.setPriority(Thread.MAX_PRIORITY);
System.out.println("This is main  Thread and Thread id = "+Thread.currentThread().getId()+"\t Thread priority = "+Thread.currentThread().getPriority());
a1.start();
b1.start();
c1.start();
}
}
