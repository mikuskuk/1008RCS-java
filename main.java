import java.lang.Math;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ievadi skaitli x");
        double x = scan.nextDouble();
        System.out.println("Ievadi skaitli y");
        double y = scan.nextDouble();
        System.out.println("Izvēlies matemātisko darbību (+, -, *, /, ^)");
        String math0p = scan.next();
        // scan.nextLine() -> scan.next()
        
        double result = 0; 
 
        switch (math0p) {
            case "+":
                 result = sum(x, y);
                break;
            case "-":
                result = sub(x, y);  
                break;
            case "*":
                result = mult(x, y);
                break;
            case "/":
                result = div(x, y);
                break;
            case "^":
                result = pow(x, y);            
        }

        System.out.println("Rezultāts ir " + result) ;
    }

    public static double sum(double x, double y) {
        return x + y;
    }
    public static double sub(double x, double y) {
        return x - y;
    }
    public static double mult(double x, double y) {
        return x * y;
    }
    public static double div(double x, double y) {
        return x / y;
    }
    public static double pow(double x, double y) {
        return Math.pow(x, y);
    }
}