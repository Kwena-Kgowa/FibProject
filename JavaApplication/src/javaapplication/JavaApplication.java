/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;
import java.util.Scanner;
/**
 *
 * @author Kwena Martin
 */
public class JavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Fib of > ");
        int fib = reader.nextInt();
        System.out.println("Fib of "+fib+" is = "+Fib(fib));
    }
    
    public static int Fib(int fib)
    {
        if(fib==0)
            return 0;
        else if(fib <=2)
            return 1;
        else
            return Fib(fib-1)+Fib(fib-2);
    }//end of the function
    
}
