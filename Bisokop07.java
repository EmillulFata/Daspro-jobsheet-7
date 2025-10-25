import java.util.Scanner;

public class Bisokop07 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int Total_tiket_terjual,totalTiket = 0;
    double diskon,total_pendapatan = 0, harga_tiket = 50_000;
    boolean lanjut = true;

    while (lanjut) {
      System.out.println("Masukkan Jumlah Tiket Yang Dibeli : ");
      int Jumlah_Tiket = input.nextInt();

      if (Jumlah_Tiket <= 0) {
        System.out.println("Jumlah Tiket Tidak Valid,Silahkan Input Ulang");
        continue;
      }
        if (Jumlah_Tiket > 10) {
          diskon = 0.15;
        }else if (Jumlah_Tiket > 4) {
          diskon = 0.10;
        }else {
          diskon = 0;
        }
        double totalHarga = Jumlah_Tiket * harga_tiket;
        double potongan = totalHarga * diskon;
        double bayar = totalHarga - potongan;

        System.out.println("Total Harga Sebelum Diskon: Rp" + totalHarga);
        System.out.println("Diskon: Rp" + potongan);
        System.out.println("Total Yang Harus Dibayar: Rp " + bayar + "");

         totalTiket += Jumlah_Tiket;
         total_pendapatan += bayar;

         System.out.print("Apakah Ada Pelanggan Lain? (y/n): ");
         String jawab = input.next();

            if (jawab.equalsIgnoreCase("n")) {
            lanjut = false;
      }
    }
    System.out.println("\n=== LAPORAN PENJUALAN HARIAN ===");
    System.out.println("Total tiket terjual: " + totalTiket);
    System.out.println("Total pendapatan hari ini: Rp" + total_pendapatan);

   }
}


