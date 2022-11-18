package com.linkedin.javacodechallenges;

/**
 * Hello world!
 * Test of fork
 */
public class App 
{
    public static boolean isEven(int n) {
        if (n % 2 > 0) {
            return false;
        } else {
            return true;
        }
        
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(isEven(2));
    }
}
