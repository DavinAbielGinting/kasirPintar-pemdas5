import java.util.Scanner;

public class MarketPintar {

    // 1. VARIABEL GLOBAL
    static String namaToko = "Minimarket Sukses";

    // 2. PROSEDUR (Pass by Reference lewat Array)
    // Parameter Formal: harga, hasil
    public static void hitungTotal(double[] harga, double[] hasil) {
        // VARIABEL LOKAL
        double total = 0;
        for (int i = 0; i < harga.length; i++) {
            total += harga[i];
        }

        hasil[0] = total;                       
        hasil[1] = (total >= 50000) ? 5000 : 0; 
        hasil[2] = hasil[0] - hasil[1];         
    }

    // 3. FUNGSI (Pass by Value)
    // Parameter Formal: diskon
    public static boolean adaDiskon(double diskon) {
        return diskon > 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 4. ARRAY
        double[] hargaBarang = new double[3]; 
        double[] hasilBayar = new double[3];  //[0]=Total, [1]=Diskon, [2]=TotalAkhir

        System.out.println("=== " + namaToko + " ===");

        // Input harga menggunakan Scanner
        for (int i = 0; i < hargaBarang.length; i++) {
            System.out.print("Masukkan harga barang ke-" + (i + 1) + ": Rp ");
            hargaBarang[i] = input.nextDouble();
        }

        // Pemanggilan Prosedur (Pass by Reference lewat Array hasilBayar)
        hitungTotal(hargaBarang, hasilBayar);

        // Cetak Struk
        System.out.println("\n-----------------------------");
        System.out.println("Total Awal  : Rp " + hasilBayar[0]);
        System.out.println("Diskon      : Rp " + hasilBayar[1]);
        System.out.println("Total Bayar : Rp " + hasilBayar[2]);

        // Pemanggilan Fungsi (Pass by Value)
        if (adaDiskon(hasilBayar[1])) {
            System.out.println("Status      : Selamat! Anda mendapat diskon.");
        }
    }
}

    // 1. VARIABEL GLOBAL
    static String namaToko = "Minimarket Sukses";

    // 2. PROSEDUR (Pass by Reference lewat Array)
    // Parameter Formal: harga, hasil
    public static void hitungTotal(double[] harga, double[] hasil) {
        // VARIABEL LOKAL
        double total = 0;
        for (int i = 0; i < harga.length; i++) {
            total += harga[i];
        }

        hasil[0] = total;                       // Total awal
        hasil[1] = (total >= 50000) ? 5000 : 0; // Diskon Rp 5.000 jika total >= 50rb
        hasil[2] = hasil[0] - hasil[1];         // Total akhir
    }

    // 3. FUNGSI (Pass by Value)
    // Parameter Formal: diskon
    public static boolean adaDiskon(double diskon) {
        return diskon > 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 4. ARRAY
        String[] barangUser = new String[3];
        String[] namaBarang = {"Karbol", "Susu", "Pasta Gigi", "Mie Instan", "Minyak"};
        double[] hargaTiapBarang = {11000, 150000, 20000, 3000, 45000};
        double[] hargaBarang = new double[3];
        double[] hasilBayar = new double[3];  // Menampung [0]=Total, [1]=Diskon, [2]=TotalAkhir

        System.out.println("=== " + namaToko + " ===");
        
        // Input harga menggunakan Scanner
        for (int i = 0; i < barangUser.length; i++) {
            System.out.print("Masukkan nama barang " + (i + 1) + " : ");
            barangUser[i] = input.nextLine();
        }
        
        for (int i = 0; i < barangUser.length; i++) {
            for (int j = 0; j <namaBarang.length; j++) {
                if (barangUser[i].equalsIgnoreCase(namaBarang[j])){
                hargaBarang[i] = hargaTiapBarang[j];
                break;
                }
            }
        }

        // Pemanggilan Prosedur (Pass by Reference lewat Array hasilBayar)
        hitungTotal(hargaBarang, hasilBayar);

        // Cetak Struk
        System.out.println("\n-----------------------------");
        System.out.println("Total Awal  : Rp " + hasilBayar[0]);
        System.out.println("Diskon      : Rp " + hasilBayar[1]);
        System.out.println("Total Bayar : Rp " + hasilBayar[2]);

        // Pemanggilan Fungsi (Pass by Value)
        if (adaDiskon(hasilBayar[1])) {
            System.out.println("Status      : Selamat! Anda mendapat diskon.");
        }
    }
}

