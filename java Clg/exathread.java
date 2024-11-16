class one extends Thread{
public void run(){
for(int i = 1 ; i<=5 ; i++){
System.out.println("I am in Thread one i = "+i);
}
System.out.println("outof thread one ");
}
}
class two extends Thread{
public void run(){
for(int j = 2 ; j<=5 ; j++){
System.out.println("I am in Thread two j = "+j);
}
System.out.println("outof thread two ");
}
}
class three extends Thread{
public void run(){
for(int k = 3 ; k<=5 ; k++){
System.out.println("I am in Thread three k = "+k);
}
System.out.println("outof thread three ");
}
}
class exathread{
public static void main(String args[]){
new one().run();
//a.start();
new two().run();
//b.start();
new three().run();
//c.start();
}
}
