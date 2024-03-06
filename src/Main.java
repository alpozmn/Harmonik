import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı alınır
        System.out.println("Bir sayı girin:");
        int n = scanner.nextInt();

        double harmonikSerisi = 0;

        // Harmonik seriyi hesaplamak için for döngüsü kullanılır
        for (int i = 1; i <= n; i++) {
            harmonikSerisi += 1.0 / i;
        }

        // Sonuç ekrana yazdırılır
        System.out.println(n + " sayısının harmonik serisi: " + harmonikSerisi);
    }
}
