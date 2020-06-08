class conditional_exp {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int answer;
        // Using conditional expression 
        answer = (x > y) ? x : y;
        System.out.println("Answer using conditional: " + answer);
        // The above code is equivalent to:
        // Using the if-else method 
        if (x > y) {
            answer = x;
        } else {
            answer = y;
        }
        System.out.println("Answer using if-else: " + answer);
    }
}
//Answer using conditional: 10
//Answer using if-else: 10
