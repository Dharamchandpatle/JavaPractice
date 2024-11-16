import student.myclass;
class s1 extends myclass {
int rollno = 40 ;
void show(){
System.out.println("This is s1 class");
System.out.println("Roll number ="+rollno);
}
}
class class1 {
public static void main(String args[]){
//myclass m = new myclass();
//m.display();
s1 s = new s1();
s.show();
s.display();
}
}