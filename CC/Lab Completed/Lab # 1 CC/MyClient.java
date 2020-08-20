import java.rmi.*;  
import java.util.*;
public class MyClient{  
public static void main(String args[]){  
try{  

Scanner sc= new Scanner(System.in);
		System.out.print("Enter first number- ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number- ");
		int num2= sc.nextInt();

Calculator stub =(Calculator)Naming.lookup("Usama");  
System.out.println("Result of Addition is: " + stub.add(34,4));  
System.out.println("Result of Multiplication is: " + stub.multiply(34,4));  
System.out.println("Result of Subtraction is: "+ stub.subtract(34,4));  
}catch(Exception e){}  
}  
}  