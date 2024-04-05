import java.util.*;
import java.io.*;
import java.net.*;

public class tserver {
public static void main(String [] args) throws Exception {
ServerSocket sersoc= new ServerSocket(5555);
System.out.println("server established");
Socket socket = sersoc.accept();
System.out.println("connection established waiting for client");

InputStream istream  = socket.getInputStream();
Scanner sc = new Scanner(new InputStreamReader(istream));
String fname = sc.nextLine();
System.out.println("requested file" + fname);
OutputStream  ostream = socket.getOutputStream();
PrintWriter pWrite = new PrintWriter(ostream,true);

try{
    Scanner filescan = new Scanner(new FileReader(fname));
    while(filescan.hasNextLine()){
        pWrite.println(filescan.nextLine());
    }
    filescan.close();

}catch(FileNotFoundException e ){
System.out.println("file not found");
}
finally{
    System.out.println("clossing connection");
    sc.close();
    sersoc.close();
    socket.close();
}
}    
}
