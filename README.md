PERTANYAAN PERCOBAAN 1
1. Apakah fungsi tanpa parameter selalu harus bertipe void?
Jawaban : Tidak, fungsi tanpa parameter tidak harus bertipe void.

2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi
Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu
tanpa menggunakan fungsi!
Jawaban : bisaaa, saya menghapus bagian ini " public static void Menu() {}"

3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua
perintah penampilan menu langsung di dalam fungsi main.
jawaban : keuntungannya adalah dapat membuat program lebih rapi dan juga mudah diubah sekaligus dibaca

4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main
(mulai dari program dijalankan sampai daftar menu tampil di layar).
jawaban : ketika fungsi main dipanggil atau di run, Semua baris S.O.P di dalam Menu() dieksekusi satu per satu dari atas ke bawah, dan baris itulah yang ditampilkan di terminal ketika di run.

PERTANYAAN PERCOBAAN 2
1. Apakah kegunaan parameter di dalam fungsi?
jawaban : parameter digunakan untuk mengirimkan data dari luar fungsi ke dalam fungsi.
Maka fungsi bisa menerima nilai yang berbeda-beda setiap kali dipanggil

2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter
namaPelanggan dan isMember?
jawaban : namaPelanggan itu digunakan untuk menampilkan nama pelanggan, kalau isMember digunakan untuk mengetahui apakah pelanggan adalah member.

3. Apakah parameter sama dengan variabel? Jelaskan.
jawaban : parameter dan variabel itu memiliki beberapa kesamaan namun juga ada perbedaan, persamaannya adalah keduanya sama-sama tempat buat menyimpan nilai. Kalau perbedaanya adalah jika parameter itu nlainya dikirim dari luar fungsi saat fungsi dipanggil, kalau variabel itu nilainya dibuat sekaligus di dalam fungsi.

4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa
perbedaan output ketika isMember bernilai true dan ketika false?
jawaban : fungsi akan menentukan kondisi yang ada pada if, jika fungsi menuliskan true, maka baris s.o.p di if akan ditampilkan, namun jika fungsi menuliskan false maka baris s.o.p di if tidak ditampilkan.

5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter
namaPelanggan dan isMember?
jawaban : akan terjadi sebuah error, yang dikarenakan fungsi tersebut membutuhkan dua parameter yang sudah dicantumkan di void agar dapat dijalankan.

6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String).
Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo
adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang
berlaku, tampilkan kode invalid.
jawaban : saya tambahkan ini  
        if (kodePromo.equals("DISKON50")) {
         System.out.println("Kode promo valid! Anda mendapatkan diskon 50%.");
      } else if (kodePromo.equals("DISKON30")) {
         System.out.println("Kode promo valid! Anda mendapatkan diskon 30%.");
      } else {
         System.out.println("Kode promo invalid.");
      }

7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan
tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris
perintah pemanggilan fungsi menu yang benar.
jawaban :      Menu("Budi" ,true, "DISKON30");

8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember
pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan
dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter?
Jelaskan alasan Anda.
jawaban : Ya, penggunaan parameter namaPelanggan dan isMember membuat program jauh lebih mudah dibaca dan dikembangkan dibandingkan jika nilainya ditulis langsung di dalam fungsi tanpa parameter.


PERTANYAAN PERCOBAAN 3
1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh dari program kafe pada Percobaan 3 untuk masing-masing kasus.
jawaban : Fungsi membutuhkan nilai kembalian ketika fungsi tersebut harus menghasilkan suatu nilai untuk digunakan kembali, seperti yang di percobaan 3 waktu menghitung totalharga, sedangkan Fungsi tidak membutuhkan nilai kembalian ketika tugasnya hanya melakukan proses tertentu—misalnya menampilkan informasi, mencetak menu seperti pada percobaan 3 dibagian menampilkan menu.

2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter dalam konteks program kafe.
jawaban :
- 1. pilihanMenu, Menyimpan nomor menu yang dipilih pelanggan (1 sampai 6), dan digunakan untuk menentukan harga item berdasarkan array harga. 
- 2. jumlahPesanan Menyimpan berapa banyak item/porsi yang dipesan, dan digunakan untuk menghitung total harga = harga satuan × jumlah pesanan.

3. Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga totalHarga.
jawaban :

4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis menu)?
jawaban : 