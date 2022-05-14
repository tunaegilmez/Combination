import java.util.Scanner;

public class OdevMain {
    public static void main(String[] args) {
        // kombinasyon hesaplayan program.

        Scanner scn = new Scanner(System.in);

        System.out.print("1.Sayi : ");
        int n = scn.nextInt();
        System.out.print("2.Sayi : ");
        int r = scn.nextInt();

        int f = 1 , f2 = 1 , n_r , f3 = 1 ;
        String errorMessage = "Hatalı giriş yapıldı!";

        if (n >= r) {
            for (int i = 1; i <= n; i++) {
                f *= i;                    // Formülde n gorulen yere f yazıcaz.
            }
            for (int j = 1; j <= r; j++) {
                f2 *= j;                   // Formülde r görülen yere f2 yazıcaz.
            }

            n_r = n - r;
            for (int k = 1; k <= n_r; k++) {
                f3 *= k;                   // Formülde (n-r)! gçrülen yere f3 yazıcaz.
            }

            int kombinasyon = f / (f2 * f3) ; // Formül : C(n,r) = n! / r! * (n-r)!

            System.out.println(kombinasyon);

        }else {
            System.out.println(errorMessage);
        }
    }
}
