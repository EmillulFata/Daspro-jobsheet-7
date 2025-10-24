1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks
   berikut:
    if (nilai < 0 || nilai > 100) {
        System.out.println(" Nilai tidak valid. Masukkan lagi nilai yang valid!");
        continue;
      }
    a. nilai < 0 || nilai > 100 
    b. continue 
2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi
   jika posisinya dituliskan di awal perulangan WHILE? 
3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan
   WHILE akan berjalan? 
4. Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat
   nilai A, program menampilkan pesan tambahan "Bagus, pertahankan nilainya"! 
5. Commit dan push kode program ke Github 

Jawab :
1. a. nilai < 0 || nilai > 100
     Merupakan kondisi logika untuk mengecek apakah nilai tidak valid.
    - Jika nilai kurang dari 0 atau lebih dari 100, maka kondisi ini
      bernilai true.
    - Operator || artinya “atau” (OR).
      Jadi, jika salah satu kondisi terpenuhi (nilai < 0 atau nilai > 100), maka program akan menolak input tersebut.
   b. continue
      Fungsi continue adalah melompat ke iterasi berikutnya pada perulangan (dalam hal ini while).
      Artinya, jika nilai yang dimasukkan tidak valid, program tidak menjalankan sisa kode di bawahnya, tetapi langsung kembali ke awal perulangan untuk meminta input nilai lagi.

2. Karena i++ berfungsi untuk menaikkan penghitung mahasiswa setelah input nilai
  mahasiswa valid dimasukkan.
  Jika i++ ditulis di awal perulangan, maka Nomor mahasiswa akan bertambah sebelum input dilakukan,Akibatnya jumlah mahasiswa yang diinput akan berkurang satu,
  Dan ketika input tidak valid, penghitung tetap bertambah sehingga program tidak memberi kesempatan input ulang untuk mahasiswa yang sama.

3. Jika jumlah mahasiswa = 19, berapa kali perulangan WHILE berjalan?
   Jika semua nilai yang dimasukkan valid, maka Perulangan akan berjalan 19 kali (karena i mulai dari 0 dan berhenti saat i < 19 menjadi salah, yaitu i = 19).
   Namun, jika ada nilai yang tidak valid, maka Perulangan bisa berjalan lebih dari 19 kali, karena input tidak valid tidak menaikkan i (karena ada continue).

4. 