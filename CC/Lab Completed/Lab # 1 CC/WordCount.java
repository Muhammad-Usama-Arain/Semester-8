import java.rmi.*;  
public interface WordCount extends Remote{  
public int counter(String sentence)throws RemoteException;  
}
