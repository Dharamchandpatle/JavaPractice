class exablocking implements Runnable{
Thread th ;
Boolean suspendFlag , stopFlag ;
exablocking(String t){
th = new Thread(this,t);
suspendFlag = false;
stopFlag = false ;
th.start();
}
public void run(){
try{
int j = 1;
while(++j < 20){ 
synchronized(this){
while(suspendFlag ){
wait();
}
if(stopFlag){
break;
}
}
}
}
catch(Interrupted Exception ie){
System.out.println("Thread Interrupted ");
}
}
synchronized void exasuspend(){
suspendFlag = true ;
}
synchronized void exaresume(){
suspendFlag =false;
notify();
}
synchronized void exastop(){
suspendFlag = false;
stopFlag = true;
notify();
}
}
class Threadcommunication{
public static void main (String args[])
{
try{
exablocking e = new exablocking();
System.out.println("Thread is created and started ");
Thread.sleep(2000);

e.exasuspend();
System.out.println("Threa is suspended ");
Thread.sleep(2000);

e.exaresume();
System.out.println("Threa is Exaresumed  ");
Thread.sleep(2000);

e.exastop();
System.out.println("Threa is Exastoped ");
Thread.sleep(2000);

e.exasuspend();
System.out.println("Threa is suspended ");
Thread.sleep(2000);

e.exaresume();
System.out.println("Threa is Exaresumed  ");
Thread.sleep(2000);

e.exastop();
System.out.printl("Thread is stoped ");
}
catch(Interrupted Exception ie){
System.out.println(" Generated Interrupted Exception ");
}
}
}




