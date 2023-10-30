import java.util.Scanner;

/**
 * Program untuk menghitung luas dan keliling persegi panjang berdasarkan input panjang dan lebar.
 */
public class PersegiPanjang {
    /**
     * Metode utama program.
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan panjang dan lebar persegi panjang
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = input.nextDouble();

        // Menghitung luas dan keliling persegi panjang
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        // Menampilkan hasil perhitungan
        System.out.println("Luas persegi panjang: " + luas);
        System.out.println("Keliling persegi panjang: " + keliling);

        // Menutup Scanner untuk menghindari kebocoran sumber daya
        input.close();
    }
}
