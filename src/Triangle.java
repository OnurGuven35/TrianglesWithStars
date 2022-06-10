
// Javada döngüler kullanarak yıldızlar ile üçgen yapımı.

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Lutfen Yapilacak Ucgenin Basamak Sayisini Giriniz : ");
        int n = inp.nextInt();

        if (n < 0) {
            System.out.print("Hatali Bir Deger Girdiniz, Lutfen Tekrar Deneyiniz ! ");
        } else {
            // İlk olarak alt alta satırları sıralıyoruz.
            for (int i = 1; i <= n; i++) {
                // Ucgen olması için yıldızdan önce gelecek boşlukları formülize ederek döngü ayarlıyoruz.
                for (int j = 1; j <= (n - i); j++) {
                    System.out.print(" ");
                }
                // Her satıra gelecek yıldız sayısını formülüze ederek döngü ayarlıyoruz.
                for (int k = 1; k <= ((2 * i) - 1); k++) {
                    System.out.print("*");
                }

                // Yıldızların alt alta gelmesi için sout atıyoruz.
                System.out.println();

            }
        }
    }
}
