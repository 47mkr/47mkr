import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static PrintStream out = System.out;
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        out.println("Введите число для перевода");
        int y = in.nextInt();
        out.println("В какую систему перевести?");
        int x = in.nextInt();
        String p = "";
        while(y > 0) {
            p = (y % x) + p;
            y = y / x;
        }
        out.print("Ваше число: ");
        out.println(p);
    }
}