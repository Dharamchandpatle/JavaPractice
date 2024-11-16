
class two extends Thread{
public void run(){
for(int j= 0 ; j<=1 ; j++){
if(j==3)
stop();
System.out.println("Hacked nasha.......");
}
//System.out.println("outof thread two");
}
}
class three extends Thread{
public void run(){
for(int k = 1 ; k<=1 ; k++){
if(k==2)
try{
sleep(2000);
}
catch(Exception e){}
System.out.println("........... ");
System.out.println("........... ");
System.out.println("........... ");
System.out.println(" successfully hacked...... ");
}
//System.out.println("outof thread three");
}
}
class testingthread{
public static void main(String args[]){
one a = new one();
two b = new two();
three c = new three();
 
b.start();
c.start();
}
}
