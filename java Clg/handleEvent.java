import java.io.*;
import java.awt.*;
class readstudent extends Frame {
TextField no , name , marks ;
Button next , done ;
Lable num_Lable , name_Lable , marke_Lable ;
DataInputStream dis ;
Boolean more_record = true ;
public readstudent(){
super("Create Student File ");
}
public void setup(){
resize( 400 , 200 );
setLayout(GridLayout(4,2));
no = new TextField(25);
num_Lable = new Lable("new number ");
name = new TextField(25);
name_Lable = new Lable("Student Name ");
marks = new TextField(25);
marke_Lable = new Lable("Marks ");
next = new Button("Next ");
done = new Button("Done ");
add(num_Lable);
add(number);
add(name_Lable);
add(name);
add(marke_Lable);
add(marks);
add(next);
add(done);
show();
try{
dis = new DataInputStream(new FileInputStream("Student.txt"));
}
catch(IOException e ){
System.err.println(e.toString());
System.exit(1);
}
}
public void readrecord(){
int n ;
String s ;
double d ;
try {
n = dis.readInt();
s = dis.readUTF();
d = dis.readDouble();
no.setText(String.valueOf(n));
name.setText(String.valueOf(s));
marks.setText(String.valueOf(d));
}
catch(Exception e){
more_record  = false ;
}
catch(IOException e ){
System.out.println("Input Output Error ");
System.exit(1);
}
}

public void cleanup(){
try {
dis.close();
}
catch(IOException e ){}
}
public boolean action(Event e , Object o ){
if(e.target instanceof Button){
if(e.arg.equals("Next ").readrecord())


return true ;
}
}
public Boolean handleEvent(Event e){
if(e.target instanceof Button){
if(e.arg.equals("Done  ").more_record == false)
{
cleanup();
System.exit(0);
return true ;
}
}
return super.handleEvent(e);
}

public static void main (String args ){
readstudent rs = new readstudent();
rs.setup();
}
}


