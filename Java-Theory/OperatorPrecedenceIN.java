public class Oper_Prec {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = 7;
        int w = 6;
        int answer;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
        System.out.println("w: " + w);

        System.out.println("Calculating Expressions with Multiple Operators");

        System.out.println("(x-z) + y*y = " + ((x - z) + y * y));
        answer = (w / y + (x * z));

        System.out.println("w/y + (x*z) = " + answer);
    }
}
