import java.util.Scanner;
public class RekapPenjualanCafe12 {
    String[] namaMenu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
    int[][] penjualan = new int[5][7];

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~ INPUT DATA PENJUALAN ~~");
        for (int j = 0; j < 7; j++) {
            System.out.println("\nHari ke-" + (j + 1));
            for (int i = 0; i < namaMenu.length; i++) {
                System.out.print(namaMenu[i] + " : ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }
    public void tampilkanData() {
    System.out.println("\n~~~ DATA PENJUALAN PER HARI ~~~");
    for (int j = 0; j < 7; j++) {
        System.out.println("\nHari ke-" + (j + 1));
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.println(namaMenu[i] + " : " + penjualan[i][j]);
            }
        }
    }
    public void tampilMenuTertinggi() {
        int maxTotal = -1;
        String menuTertinggi = "";
        for (int i = 0; i < namaMenu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
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
        for (int i = 0; i < namaMenu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            double rata = total / 7.0;
            System.out.printf("%-15s : %.2f\n", namaMenu[i], rata);
        }
    }
    public static void main(String[] args) {

        RekapPenjualanCafe12 cafe = new RekapPenjualanCafe12();

        cafe.inputData();
        cafe.tampilkanData();
        cafe.tampilMenuTertinggi();
        cafe.tampilRataRata();

    }
}

