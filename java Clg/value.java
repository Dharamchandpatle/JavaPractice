import java.util.*;
class value{
public static void main(String args[]){
Vector v = new Vector();
v.add("delhi");
v.add("mumbai");
v.add("kolkata");
v.add("chennai");
v.add("delhi");
Vector tv = new Vector();
String tvalue;
for(int j =0 ; j<=v.size();j++)
{
tvalue = (String)v.elementAt(j);
if(tvalue != null){
if(tv.isEmpty())
tv.addElement(tvalue);
if(tv.indexOf(tvalue)== -1){
tv.addElement(tvalue);
}
}
}
for(int j = 0 ; j<tv.size() ; j++)
System.out.println(tv.elementAt(j));
}
}