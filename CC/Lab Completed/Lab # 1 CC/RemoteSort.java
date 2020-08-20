import java.rmi.*;  
import java.rmi.server.*;
import java.util.Arrays;  
public class RemoteSort extends UnicastRemoteObject implements HelpSort{  
RemoteSort()throws RemoteException{  
super();  
}  
public int [] sorter(int [] array){
	Arrays.sort(array);
	return array;}  

}  