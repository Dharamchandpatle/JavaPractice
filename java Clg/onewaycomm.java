import java.net.*;
import java.io.*;
public class onewaycomm {
    public static void main(String[] args) throws IOException {
try{
        Socket s = new Socket("192.168.20.139",5555);
    }
catch(SocketException e){
System.out.println("vaibhav ji galti hai");
}    
    }
}