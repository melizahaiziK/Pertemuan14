public class PengunjungCafe12 {
    public static void main(String[] args) {
        daftarPengunjung();
        daftarPengunjung();
        daftarPengunjung();
    }
    static void daftarPengunjung(String...namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung: ");
        for (String nama : namaPengunjung) {
        System.out.println("- " + nama);
    }
    }    
}