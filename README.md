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
jawaban : sudah di commit

4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis menu)?
jawaban : sudah di commit.

PERTANYAAN PERCOBAAN 4
1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String... namaPengunjung!
jawaban : Karena program ingin menerima jumlah data yang berubah-ubah, dan bisa menerima berapa pun jumlah String tanpa harus mendefinisikan array secara manual

2. Modifikasi method daftarPengunjung menggunakan for-each loop.
jawaban : sudah di commit

3. Bisakah menggunakan dua tipe data varargs dalam satu fungsi? Jelaskan jawaban Anda berdasarkan aturan varargs di Java, dan berikan contohnya!
jawaban : Tidak bisa menggunakan dua tipe data dalam satu fungsi, karna berdasarkan aturan di java yaitu, hanya boleh ada satu varargs dalam satu metode, dan Varargs harus berada di posisi paling akhir dalam parameter.

4. Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen. Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan? Jika tetap berjalan, bagaimana output yang dihasilkan?
jawaban : program tidak error, dan tetap berjalan sekaligus mengeluarkan output. Output yang dihasilkan yaitu hanya "Daftar Nama Pengunjung: " tanpa adanya isi nama, karna argumennya tidak diisi, jadi tidak ada nama yang muncul didalam daftar nama pengunjung.

PERTANYAAN PERCOBAAN 5 
1. Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program dijalankan hingga menampilkan luas persegi panjang dan volume balok!
jawaban :yang pertama program akan meminta kita memasukkan/menginputkan nilai panjang, lebar, dan tinggi, lalu program akan menghitung menggunakan rumus yang sudah tertulis, dan akhirnya program akan menampilkan hasil luas persegi panjang dan volume balok.

2. Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna memasukkan panjang = 4, lebar = 3, dan tinggi = 5. Jelaskan secara singkat alur jalannya program sampai output tersebut muncul.
jawaban : awalnya program akan menghitung luas dengan rumus yang ada pada fungsi hitung luas yaitu "int Luas = pjg * lb;" selanjutnya program akan menghitung volume balok dengan rumus yang ada pada fungsi hitung volume yaitu "int volume = hitungLuas(a, b) * tinggi;"

3. Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program tersebut!
public class programKu {
    public static void TampilHinggakei(int i) {
        for (int j = 1; j <= i; j++){
            System.out.print(j);
        }
    }
    public static int Jumlah (int bil1, int bil2) {
        return (bil1+bil2);
    }
    public static void TampilJumlah(int bil1, int bil2) {
        TampilHinggakei(Jumlah(bil1, bil2));
    }
    public static void main(String[] args) {
        int temp = Jumlah(1, 1);
        TampilJumlah(temp, 5);
    }
}
jawaban : dimulai dari "int temp = Jumlah(1, 1);" yang berarti 1+1 = 2 lalu "TampilJumlah(temp, 5);" lalu "TampilHinggakei(Jumlah(bil1, bil2));" yang dmn bil1 adalah 2 dan bil2 adalah 5, jadi "Jumlah(2, 5) → 7" dan terakhir "TampilHinggakei(7);" jadi program akan menampilkan angka bilangan dari 1 hingga 7

4. Pada saat apakah fungsi yang kita buat harus menggunakan parameter atau tidak? Pada saat apakah fungsi yang kita buat harus memiliki nilai kembalian atau tidak? Jelaskan!
jawaban : kita bisa gunakan parameter ketika fungsi membutuhkan data dari luar agar bisa bekerja. Kita bisa gunakan nilai kembalian ketika fungsi menghasilkan perhitungan atau informasi yang perlu dipakai lagi di bagian lain dari program.

5. Jelaskan kapan sebuah fungsi sebaiknya menggunakan parameter dan kapan fungsi boleh tanpa parameter, dengan mengacu pada fungsi hitungLuas dan hitungVolume di Percobaan 5.
jawaban : kita bisa menggunakan parameter jika data yang diperlukan untuk perhitungannya berasal dari luar fungsi (bukan ditentukan sendiri oleh fungsi), dann kapan kita boleh tidak menggunakan parameter? yaituu pada saat semua data yang dibutuhkan sudah tersedia dalam fungsi, atau nilai tersebut selalu sama sehingga tidak perlu dikirim dari luas.

6. Jelaskan kapan sebuah fungsi sebaiknya memiliki nilai kembalian (return value) dan kapan tidak perlu memiliki nilai kembalian, dengan mengacu pada fungsi main, hitungLuas, dan hitungVolume.
jawaban : Fungsi perlu memiliki nilai kembalian ketika hasil perhitungannya masih akan digunakan lagi oleh bagian program lain, dan Fungsi tidak butuh return value jika tujuannya hanya menjalankan proses, bukan menghitung nilai yang dibutuhkan kembali.