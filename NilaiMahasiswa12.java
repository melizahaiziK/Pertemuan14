import java.util.Scanner;
public class NilaiMahasiswa12 {
    static void isianArray (int[] arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke- " + (i+1) + " :");
            arr[i] = sc.nextInt();
        }
    }
     static void tampilArray(int[] arr){
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int nilai : arr) {
            System.out.println(nilai);
        }
    }
    static double hitTot(int[] arr) {
        double total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();

        int[] nilaiMhs = new int[jumlah];

        isianArray(nilaiMhs);
        tampilArray(nilaiMhs);

        double total = hitTot(nilaiMhs);
        System.out.println("\nTotal nilai seluruh mahasiswa = " + total);

        input.close();
    }
}

