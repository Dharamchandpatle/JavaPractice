interface FamousLine{
void  showLine();
}

class Novel1 implements FamousLine{
public void showLine()
{
System.out.println("to be , or not to be ");
}
}

class Novel2 extends Novel1{

public void AuthorName()
{
System.out.println("shankespeare");
}
 
}

public class UserInterface{
public static void main(String args[]){
Novel1 n1 = new Novel1();
Novel2 n2 = new Novel2();

n1.showLine();
n2.AuthorName();
n2.showLine();
}
}
