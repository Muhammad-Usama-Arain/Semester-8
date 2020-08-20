import java.rmi.*;  
import java.rmi.server.*;  
public class RemoteCalculator extends UnicastRemoteObject implements Calculator{  
RemoteCalculator()throws RemoteException{  
super();  
}  
public int add(int x,int y){return x+y;}  
public int multiply(int x,int y){return x*y;} 
public int subtract(int x,int y){return x-y;} 
}  