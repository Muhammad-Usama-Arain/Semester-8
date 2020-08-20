import java.rmi.*;  
import java.rmi.registry.*;  
public class Server{  
public static void main(String args[]){  
try{  
HelpSort stub=new RemoteSort();
// rmiregistry within the server JVM with 
// port number 1900 
LocateRegistry.createRegistry(1900); 
Naming.rebind("Usama",stub);  
}catch(Exception e){System.out.println(e);}  
}  
}  