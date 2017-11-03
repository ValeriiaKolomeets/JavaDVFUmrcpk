import java.util.Scanner;

/**
 * Created by user on 03.11.2017.
 */
public class Zadacha4 {
    public static void main(String[] args) {
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.println("vvedite naturalnoe chislo");
        double x = in.nextDouble();
        System.out.println("vvedite naturalnoe chislo");
        double y = in.nextDouble();
        System.out.println("vvedite naturalnoe chislo");
        double z = in.nextDouble();
        double v = (x+y+z)/3;
        System.out.format("srednee arifmeticheskoe = "+ "%.2f",+v);
    }
}