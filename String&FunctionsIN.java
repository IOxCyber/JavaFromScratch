/*
1.String is a class that is built into the java.lang package. This represents character strings, 
i.e., text type of data is stored in the String type in Java.
2.String literals are a means of expressing text type of data in Java. They start with double-quotation marks and then contain zero or more characters, including Unicode characters. 
The String literal must end with another double-quotation marks ". This would be a String in Java, "Hello World!".
3.Keep in mind that String objects are immutable, i.e, they cannot be modified once created. Hence, when a String object is modified, it is actually a new string that is being created.
*/

class immutability {
    public static void main(String[] args) {
        String one = "Hello";
        String two = "World";
        String lower = "hello";
        String same = "Hello";
        int number = 10;
        String text = "       Cut string";
        // The trim function is meant to eliminate leading & trailing spaces
        text.trim();
        // Without assigning the text variable to the trimmed string
        System.out.println(text);

        // Assigning trimmed string to the variable
        text = text.trim();
        System.out.println(text);
       
        // concatenating two strings
        System.out.println(one + two);

        //concatenating a number and string
        System.out.println(one + " " + number);

        //saving concatenated string and printing
        String new_string = one + two + " " + number;
        System.out.println(new_string);
        
        //comparision
        System.out.println(one.equals(two));

        System.out.println(one.equals(lower));

        System.out.println(one.equals(same))
        
        
    }
}
