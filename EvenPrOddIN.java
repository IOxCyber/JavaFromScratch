class HelloWorld {
    public static void main( String args[] ) {
        int x = 3;
        String answer;
        if (x % 2 == 0) {
            answer = "even";
        }
        else {
            answer = "odd";
        }
        System.out.println(answer);
    }
}

//Switching the Days
   class HelloWorld {
    public static void main( String args[] ) {
        int x =3;
        String answer = "";
        switch (x) {
            case 1:
                answer = "Monday";
                break;
            case 2:
                answer = "Tuesday";
                break;
            case 3:
                answer = "Wednesday";
                break;
            case 4:
                answer = "Thursday";
                break;
            case 5:
                answer = "Friday";
                break;
            case 6:
                answer = "Saturday";
                break;
            case 7:
                answer = "Sunday";
                break;
            default:
                answer = "invalid input";
        }
        System.out.println(answer);
        }
    }
