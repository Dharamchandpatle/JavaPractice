import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class server45 {
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(5555);
        Socket s = ss.accept();
        System.out.println("client connected");
    }
}