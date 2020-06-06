class split_string {
    public static void main(String[] args) {
        //Spiting String according to comma (,)
        String greet = "Hello World,My name is Saransh,How are you?";
        String choice = "CoffeeOrTea";     
        String greeting = "HeLlo WoRld";
        String[] greetings = greeting.split(",");
        System.out.println(greetings[0]);
        System.out.println(greetings[1]);
        System.out.println(greetings[2]);
        
        //Sub String
        //First: Only one argument
        System.out.println(choice.substring(8));
        //Second: Two arguments
        System.out.println(choice.substring(0, 6))
        
        //String Case
        //Returns new string in which all characters are converted to upper case
        System.out.println(greet.toUpperCase());
        //Returns new string in which all characters are converted to lower case
        System.out.println(greet.toLowerCase());
        //length
        System.out.println("The length of greeting is: " + greeting.length());    
    }
}
