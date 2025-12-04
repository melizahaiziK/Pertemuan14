import java.util.Scanner;
public class RekapPenjualanCafe12 {
    String[] namaMenu;
    int[][] penjualan;
    int jumlahMenu;
    int jumlahHari;

    public void setup() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah menu  : ");
        jumlahMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari  : ");
        jumlahHari = sc.nextInt();
        sc.nextLine(); 

        namaMenu = new String[jumlahMenu];
        penjualan = new int[jumlahMenu][jumlahHari];
        System.out.println("\n~~~ INPUT MENU ~~~");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Menu ke-" + (i + 1) + ": ");
            namaMenu[i] = sc.nextLine();
        }
    }
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n~~ INPUT DATA PENJUALAN ~~");
        for (int j = 0; j < jumlahHari; j++) {
            System.out.println("\nHari ke-" + (j + 1));
            for (int i = 0; i < jumlahMenu; i++) {
                System.out.print(namaMenu[i] + " : ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }
    public void tampilkanData() {
    System.out.println("\n~~~ DATA PENJUALAN PER HARI ~~~");
    for (int j = 0; j < jumlahHari; j++) {
        System.out.println("\nHari ke-" + (j + 1));
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println(namaMenu[i] + " : " + penjualan[i][j]);
            }
        }
    }
    public void tampilMenuTertinggi() {
        int maxTotal = -1;
        String menuTertinggi = "";
        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                menuTertinggi = namaMenu[i];
            }
        }
        System.out.println("\n~~~ MENU DENGAN TOTAL PENJUALAN TERTINGGI ~~~");
        System.out.println(menuTertinggi + " : " + maxTotal + " porsi");
    }
    public void tampilRataRata() {
        System.out.println("\n~~~ RATA-RATA PENJUALAN SETIAP MENU ~~~");
        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }
            double rata = total / jumlahHari;
            System.out.printf("%-15s : %.2f\n", namaMenu[i], rata);
        }
    }
    public static void main(String[] args) {
        RekapPenjualanCafe12 cafe = new RekapPenjualanCafe12();

        cafe.setup();  
        cafe.inputData();
        cafe.tampilkanData();
        cafe.tampilMenuTertinggi();
        cafe.tampilRataRata();

    }
}

