class a extends Thread
{
public void run()
{
for(int i=1;i<=15;i++)
{
try{
sleep(1000);
}
catch(Exception e){}
System.out.println("...........");

}
System.out.println("Nasha hacked Successfully...");
}
}
class threadclass
{
public static void main (String args[])
{
a s=new a();
s.start();
}
}