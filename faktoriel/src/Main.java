import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // faktöriyel hesaplayan program.
        int s = 1 ;

        Scanner scn = new Scanner(System.in);

        System.out.print("Sayi : ");
        int sayi = scn.nextInt();

        for (int i = 1 ; i <= sayi ; i++){
            s *= i ;
        }
        System.out.println(s);
    }
}
