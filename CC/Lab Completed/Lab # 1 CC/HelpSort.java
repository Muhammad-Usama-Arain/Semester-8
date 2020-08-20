import java.rmi.*;  
public interface HelpSort extends Remote{  
public int [] sorter(int [] array)throws RemoteException;  
}
