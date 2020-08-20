import java.rmi.*;  
import java.rmi.registry.*;  
public class MyServer{  
public static void main(String args[]){  
try{  
Calculator stub=new RemoteCalculator();
// rmiregistry within the server JVM with 
// port number 1900 
LocateRegistry.createRegistry(1900); 
Naming.rebind("Usama",stub);  
}catch(Exception e){System.out.println(e);}  
}  
}  