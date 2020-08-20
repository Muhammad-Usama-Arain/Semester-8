import java.rmi.*;  
import java.util.*;
public class Client{  
public static void main(String args[]){  
try{  

 Scanner s=new Scanner(System.in);
 		System.out.println("Program will sort Array elements");

        System.out.println("enter number of elements");

        int n=s.nextInt();

        int arr[]=new int[n];

        System.out.println("enter elements");

        for(int i=0;i<n;i++){//for reading array
            arr[i]=s.nextInt();

        }

        System.out.println("Your Entered Array Looks like");

        for(int i: arr){ //for printing array

            System.out.print(i+ " ");

        }
        System.out.println();


HelpSort stub =(HelpSort)Naming.lookup("Usama");  
System.out.println("Sorted Array: ");
for (int number : stub.sorter(arr)) {
         System.out.print(number+"  ");
    } 
}catch(Exception e){}  
}  
}  