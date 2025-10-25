import java.util.Scanner;

public class Parkir07 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int jenis, total = 0;
    double durasi;

    while (true) {
    System.out.println("Masukkan Jenis Kendaraan : ");
    System.out.println("1. Mobil ");
    System.out.println("2. Motor ");
    System.out.println("0. Keluar");
    jenis = input.nextInt();

    if (jenis == 0) {
        break;
      }
    if (jenis == 1 || jenis == 2) {
      System.out.println("Masukkan Durasi Parkir (jam) : ");
      durasi = input.nextDouble();

      if (durasi > 5) {
        total += 12_500;
      } else if (jenis == 1) {
        total += durasi * 3_000;
      } else if (jenis == 2) {
        total += durasi * 2_000;
      }
    } else {
      System.out.println("Jenis Kendaraan Tidak Valid!");
      System.out.println("Silahkan Masukkan Jenis Kendaran Dengan Benar ");
    }
    System.out.println("\n============================");
    System.out.println("Total Pembayaran Parkir : Rp " + total);
    System.out.println("Terima Kasih Telah Menggunakan Layanan Parkir!");
    }
    input.close();
  }
}
