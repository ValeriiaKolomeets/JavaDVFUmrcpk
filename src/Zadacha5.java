import java.util.Scanner;

/**
 * Created by user on 09.11.2017.
 */
public class Zadacha5 {
    public static void main(String[] args) {
        System.out.println("Находим корель линейного уравнения ax+b=0");
        Scanner in = new Scanner(System.in);
        System.out.println("a  и  b");
        int a = in.nextInt();
        int b = in.nextInt();
        int x=-b/a;
        System.out.println(x);

    }
}
