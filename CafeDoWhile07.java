import java.util.Scanner;

public class CafeDoWhile07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int roti,teh,kopi;
    double harga_roti = 20_000,harga_kopi = 12_000,harga_teh = 7_000,total_harga;
    String nama,NamaPelanggan;

    do {
      System.out.print("Masukkan Nama Pelanggan (ketik 'batal' untuk keluar): ");
      nama = sc.nextLine();
      if (nama.equalsIgnoreCase("batal")) {
        System.out.println("Transaksi dibatalkan.");
        break;
    }
    System.out.println("Jumlah Roti : ");
    roti = sc.nextInt();
    System.out.println("Jumlah kopi : ");
    kopi = sc.nextInt();
    System.out.println("Jumlah Teh : ");
    teh = sc.nextInt();
    total_harga = (roti * harga_roti) + (kopi * harga_kopi ) + (teh * harga_teh);

    System.out.println("Jadi Total Harga Yang Harus Dibayarkan Sebesar : Rp " + total_harga);
    sc.nextLine();

  } while (true);

  System.out.println("Semua Transaksi Selesai");

  }
}
