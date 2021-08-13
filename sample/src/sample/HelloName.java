package sample;

import java.util.Scanner;

public class HelloName {

	
	      public static void main(String args[]) {
		
		     Scanner input = new Scanner(System.in);
		     System.out.println("Enter a name: ");
		     
		     String name = input.next();
		     Name(name);
	      }	
	      
	     

	       static void Name(String name)
	       {
		          
	               System.out.println("Hello, " + name + "!");   
	       }
		
	}

