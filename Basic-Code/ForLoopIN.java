class Loops {
    public static void main(String args[]) {
        for (int i = 0; i < 10; ++i) {
            // for loop iterates 10 times
            System.out.println("value of i = " + i);
        }
    }
}

/*
Prior to the first iteration, it sets the value of i to 0.
Next, it tests (like a normal while loop) if i is less than 10.
If the conditional statement evaluates to true, the body of the loop is executed, 
and the program will print the value of i to the console.
Once all the statements in loop body are executed, i is incremented (by 1), as specified in the update statement, 
and the conditional is tested again.
*/
