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

    public static boolean isPasswordComplex(String password) {
        boolean hasUppercaseLetter = false;
        boolean hasLowercaseLetter = false;
        boolean hasDigit = false;
        char current;
        if (password.length() < 6) {
            return false;
        }

        for (int i=0; i<password.length(); i++) 
        {
            current = password.charAt(i);
            if (Character.isDigit(current)) {
                hasDigit = true;
            } else if (Character.isUpperCase(current)) {
                hasUppercaseLetter = true;
            } else if (Character.isLowerCase(current)) {
                hasLowercaseLetter = true;
            }
        }

        if (hasUppercaseLetter & hasLowercaseLetter & hasDigit) {
            return true;
        }

        return false;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(isEven(2));
        System.out.println(isPasswordComplex("1abCdef"));
    }
}
