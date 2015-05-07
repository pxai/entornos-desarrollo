package org.cuatrovientos.maven.interfaces;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Greet myGreet = new PoliteGreet();
    	
        System.out.println(myGreet.greet());
        
        myGreet = new RudeGreet();
        System.out.println(myGreet.greet());
        
        
    }
}
