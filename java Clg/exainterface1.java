interface New{
public void draw();
}
interface circle extends New{
void getradius();
int radius = 10;
}
class New_circle implements circle{
public void getradius(){
System.out.println(radius);
}
public void draw()
{
System.out.println("hii");
}
}
class exainterface1 extends New_circle{
public static void main (String args[]){
New_circle n = new New_circle();
n.getradius();
n.draw();
}
}
