1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode
   program Percobaan 1! 
2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? 
   Apa yang terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0? 
3. Jelaskan fungsi dan alur kerja dari potongan kode berikut! 
    if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
4. Modifikasi kode program sehingga terdapat perhitungan untuk menentukan
   berapa mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60). Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi dan terendah! 
5. Commit dan push kode program ke Github 

Jawab : 
1. Struktur perulangan FOR:
   for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
   Komponen-komponennya:
   Inisialisasi: int i = 1 (untuk nilai awal variabel penghitung.)
   Kondisi: i <= 10 (untuk perulangan berjalan selama kondisi ini benar.)
   Increment: i++ (untuk menambah nilai i sebanyak 1 setiap kali perulangan
   selesai.)

2. Karena Nilai tertinggi harus lebih besar dari semua nilai yang dimasukkan.
   Maka awalnya diberi 0, agar setiap nilai mahasiswa yang lebih besar bisa
   menggantikannya.
   dan Nilai terendah harus lebih kecil dari semua nilai yang dimasukkan.
   Maka awalnya diberi 100, agar setiap nilai yang lebih kecil bisa menggantikannya.
   Jika tertinggi = 100 dan terendah = 0, maka:
    a. Tidak ada nilai mahasiswa yang lebih besar dari 100, jadi tertinggi akan
       tetap 100 (salah).
    b. Tidak ada nilai mahasiswa yang lebih kecil dari 0, jadi terendah akan
      tetap 0 (salah).

3. a. Baris pertama mengecek apakah nilai lebih besar dari tertinggi.
      Jika iya, maka tertinggi diganti dengan nilai tersebut.
   b. Baris kedua mengecek apakah nilai lebih kecil dari terendah.
      Jika iya, maka terendah diganti dengan nilai tersebut.
   Jadi kedua kondisi ini digunakan untuk memperbarui nilai tertinggi dan terendah selama perulangan.