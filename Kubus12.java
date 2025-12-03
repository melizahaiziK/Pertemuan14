import java.util.Scanner;
public class Kubus12 {
    static int hitungLuasPermukaanKubus(int sisi){
        int luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }
    static int hitungVolume(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s;
        System.out.print("Masukkan panjang sisi kubus: ");
        s = input.nextInt();

        int L = hitungLuasPermukaanKubus(s);
        System.out.println("Luas permukaan kubus adalah " + L);
        
        int vol = hitungVolume(s);
        System.out.println("Volume kubus adalah " + vol);

        input.close();
    }
}
