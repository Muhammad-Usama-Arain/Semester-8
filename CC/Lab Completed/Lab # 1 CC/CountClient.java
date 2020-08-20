import java.rmi.*;  
import java.util.*;
public class CountClient{  
public static void main(String args[]){  
try{  
 Scanner s=new Scanner(System.in);
 		System.out.println("Program will count words in the senetence");
        System.out.println("Enter senetence: ");
        String sen=s.nextLine();
        System.out.println();
        System.out.println("Your Entered Paragraph : ");
        System.out.print(sen);
    	System.out.println();

WordCount stub =(WordCount)Naming.lookup("Usama");  
System.out.println("Words in sentence are : "+ stub.counter(sen));

}catch(Exception e){}  
}  
}  