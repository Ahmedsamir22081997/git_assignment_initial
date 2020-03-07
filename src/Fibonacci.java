/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.assignment;

/**
 *
 * @author face
 */
public class Fibonacci implements ISubscriber {
    
    static int fibonacci(int n) 
    { 
    if (n <= 1) 
       return n; 
    return fibonacci(n-1) + fibonacci(n-2); 
    } 

    
    
    @Override
	public void notifySubscriber(int input) {
      System.out.println("Hello,I am a Fibonacci Series and  I am notified with"+input);
      System.out.println( "and my result is : " + fibonacci(input));
    /*
    public static void main(String[] args) {
        
   int num1=0,num2=1,num3,i,count;
   Scanner s = new Scanner(System.in);
   System.out.print("Enter count of numbers:");
   count = s.nextInt();
   System.out.print(num1+" "+num2);    
    
 for(i=2;i<count;++i)   
 {    
  num3=num1+num2;    
  System.out.print(" "+num3);    
  num1=num2;    
  num2=num3;    
 }      
    }
    */
    
}
}
