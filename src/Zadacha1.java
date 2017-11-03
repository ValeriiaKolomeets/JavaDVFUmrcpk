import java.util.Scanner;

/**
 * Created by user on 03.11.2017.
 */
public class Zadacha1 {
    public static void main(String[] args) {
        System.out.println();
        Scanner in= new Scanner(System.in);
        System.out.println("vvedite naturalnoe chislo");
        int x=in.nextInt();
        int y=x%10;
        System.out.println(y);
    }
}
