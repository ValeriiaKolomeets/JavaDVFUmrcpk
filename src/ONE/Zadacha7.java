package ONE;

import java.util.Scanner;

/**
 * Created by user on 09.11.2017.
 */
public class Zadacha7 {
    public static void main(String[] args) {
        System.out.println("Находим площадь и длину окружности");
        Scanner in = new Scanner(System.in);
        System.out.println("a  и  b");
        double r = in.nextDouble();
        double S = Math.PI*(r*r);
        double D = Math.PI*2*r;
        System.out.println("Площадь "+ S);
        System.out.println("Длина "+ D);

    }
}
