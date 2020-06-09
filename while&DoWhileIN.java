class HelloWorld {
    public static void main(String args[]) {
        int x = 0;
        int y = 0;
        while (x != 4) { // the while loop will run as long as x==4 condition is true             
            y += x;
            x += 1;
        } 
        System.out.println("Value of y = " + y);
        System.out.println("Value of x = " + x);    
    }
}

//do while,it will run the loop at least once before checking the conditional statement.
//For example, let’s consider a scenario where we want to take an integer input from the user until the user has entered a positive number. In this case, 
we will use a do-while as we have to run loop at-least-once because we want input from the user at least once. 
This loop will continue running until the user enters a positive number.
do {
    //body
} while (condition)
