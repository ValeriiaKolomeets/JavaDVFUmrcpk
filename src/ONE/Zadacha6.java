package ONE;

import java.util.Scanner;

/**
 * Created by user on 09.11.2017.
 */
public class Zadacha6 {
    public static void main(String[] args) {
        System.out.println("Находим корень числа");
        Scanner in = new Scanner(System.in);
        System.out.println("a  и  b");
        int a = in.nextInt();
        int b = in.nextInt();
        double x = Math.pow (a,b);

        System.out.println(x);
    }
}
