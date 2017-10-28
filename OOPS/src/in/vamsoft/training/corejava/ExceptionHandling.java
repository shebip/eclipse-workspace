package in.vamsoft.training.corejava;

public class ExceptionHandling {
	public static void main(String args[]) { 
    try { 
       int a=20;
       int b=0;  
       int c=a/b;
    }  
    catch(ArithmeticException ae)
    {
    	System.out.println("Divide by zero cannot be completed");}  
   
   
    catch(ArrayIndexOutOfBoundsException ai){
    	System.out.println("task 2 completed");
    	}  
    catch(Exception e)
    {
    	System.out.println("common task completed");
    	}
 }  
} 


