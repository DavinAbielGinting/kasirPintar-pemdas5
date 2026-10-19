import java.util.Scanner;

public class MarketPintar {

    // VARIABEL GLOBAL
    static String namaToko = "Minimarket Sukses";

    // PROSEDUR (pass by reference)
    public static void hitungTotal(double[] harga, double[] hasil) {
        double total = 0;
        for (int i = 0; i < harga.length; i++) {
            total += harga[i];
        }

        hasil[0] = total;                               // Total awal
        hasil[1] = (total >= 50000) ? total * 0.05 : 0; // Diskon 5% jika total >= 50rb
        hasil[2] = hasil[0] - hasil[1];                 // Total akhir
    }

    // FUNGSI
    public static double cariHarga(String nama, String[] daftarBarang, double[] daftarHarga) {
        for (int i = 0; i < daftarBarang.length; i++) {
            if (nama.equalsIgnoreCase(daftarBarang[i])) {
                return daftarHarga[i]; // Pengembalian harga
            }
        }
        return 0; // Mengembalikan 0 jika barang tidak ditemukan
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] barangUser = new String[3];
        String[] namaBarang = {"Karbol", "Susu Formula", "Pasta Gigi", "Mie Instan", "Minyak"};
        double[] hargaTiapBarang = {11000, 150000, 20000, 3000, 45000};
        double[] hargaBarang = new double[3];
        double[] hasilBayar = new double[3];  // [0]=Total, [1]=Diskon, [2]=TotalAkhir

        System.out.println("=== " + namaToko + " ===");
        System.out.println("Daftar Barang:");
        System.out.println("Karbol       ==> Rp11,000");
        System.out.println("Susu Formula ==> Rp150,000");
        System.out.println("Pasta Gigi   ==> Rp20,000");
        System.out.println("Mie Instan   ==> Rp3,000");
        System.out.println("Minyak       ==> Rp45,000");

        // Input nama barang
        for (int i = 0; i < barangUser.length; i++) {
            System.out.print("Masukkan nama barang " + (i + 1) + " : ");
            barangUser[i] = input.nextLine();

            // Memanggil fungsi cariHarga
            hargaBarang[i] = cariHarga(barangUser[i], namaBarang, hargaTiapBarang);
        }

        // MEmanggil prosedur
        hitungTotal(hargaBarang, hasilBayar);

        // Cetak Struk
        System.out.println("\n-----------------------------");
        System.out.printf("Total Awal  : Rp %,.0f\n", hasilBayar[0]);
        System.out.printf("Diskon      : Rp %,.0f\n", hasilBayar[1]);
        System.out.printf("Total Bayar : Rp %,.0f\n", hasilBayar[2]);

        // Cek diskon
        if (hasilBayar[1] > 0) {
            System.out.println("Status      : Selamat! Anda mendapat diskon 5%.");
        } else {
            System.out.println("Status      : Maaf, anda belum mendapatkan diskon.");
        }
    }
}
