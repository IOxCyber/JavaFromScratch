/*
The Java Math class is from the java.lang package. It is easy to use, and since it is a part of the java.lang package and
everything from the java.lang package is automatically imported and available, so it does not need to be explicitly imported.
*/
public class exponent {
    public static void main(String[] args) {
        System.out.println("2 raised to the power 3 is " + Math.pow(2, 3));
        System.out.println("Exponent squared is " + Math.exp(2));
        System.out.println("The square root of 16 is " + Math.sqrt(16));
        System.out.println("The cube root of 27 is " + Math.cbrt(27));
        
        //Log
        System.out.println("log of 2 is " + Math.log(2));
        System.out.println("log to the base 10 of 100 is " + Math.log10(100));
        
        //Trigonometry
        System.out.println("tan(45) =" + Math.tan(Math.toRadians(45)));
        System.out.println("sin(45) =" + Math.sin(Math.toRadians(45)));
        System.out.println("cos(45) =" + Math.cos(Math.toRadians(45)));
        
        //Absolute value
        System.out.println("Absolute value of -2: " + Math.abs(-2));
        System.out.println("Absolute value of 2: " + Math.abs(2));

        //Maximum and minimum values
        System.out.println("Maximum between 2.04 and 2.05: " + Math.max(2.04, 2.05));
        System.out.println("Minimum between 2 and 23: " + Math.min(2, 23));
        
        
    }
}
