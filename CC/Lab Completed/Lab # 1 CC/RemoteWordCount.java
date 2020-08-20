import java.rmi.*;  
import java.rmi.server.*;
import java.util.Arrays;  
public class RemoteWordCount extends UnicastRemoteObject implements WordCount{  
RemoteWordCount()throws RemoteException{  
super();  
}  
public int counter(String sentence){
	return wordcount(sentence);}  

	
public static int wordcount(String string)  
        {
          int count=0;  
      
            char ch[]= new char[string.length()];     
            for(int i=0;i<string.length();i++)  
            {  
                ch[i]= string.charAt(i);  
                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                    count++;  
            }  
            return count;  
        }  

}  
