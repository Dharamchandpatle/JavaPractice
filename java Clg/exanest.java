class nesting {
int n , m ;
nesting(int x , int y )
{
m = x ;
n = y;
}
int lagest()
{
if(m>=n)
return(m);
else
retun(n);
}
void display(){
int large = largest();
System.out.println("largest value ="+large);
}
}
class exanest{
public static void main(String args[]){

nesting n1 = new nesting(10,20);
n1.display();

}
}
