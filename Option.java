package mainmodule;
import module.Calculator;
import java.util.*;
public class Option {
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	double num1=0;
    	double num2=0;
    	int option=0;
    	
    	while(true)
    	{
    		System.out.println("Enter the numbers num1 and num2");
    		num1=sc.nextDouble();
    		num2=sc.nextDouble();
    		
    		System.out.println("Choose your option\n 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n 5. Exit");
    		option=sc.nextInt();
    		Calculator cobj=new Calculator(num1,num2);
    		
    		switch(option)
    		{
    		  case 1:
    			 {
    		       System.out.println("Result: "+cobj.add());
    		       break;
    			 }
    		  case 2:
 			 {
 		       System.out.println("Result: "+cobj.sub());
 		       break;
 			 }
    		  case 3:
 			 {
 		       System.out.println("Result: "+cobj.multiply());
 		       break;
 			 }
    		  case 4:
 			 {
 		       System.out.println("Result: "+cobj.divide());
 		       break;
 			 }
 			 default:
 				 System.exit(0);
    		}
    		
    	}
    }
}
