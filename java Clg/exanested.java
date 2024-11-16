class exanested
{
public static void main(String args[])
{
int a =10 , b=15 , c=20;
System.out.println("the largest number is = ");
 if(a>b){
    if(a>c){
     System.out.println(a);
}
else{
System.out.println(c);
}
}
else{
if(b>c){
System.out.println(b);
}
else{
System.out.println(c);
}
}
}
}