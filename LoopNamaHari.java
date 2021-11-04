import java.util.Scanner;

/**
 * Contoh program untuk menampilkan nilai dari array berurutan sampai yang ditentukan
 */
public class LoopNamaHari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] namaHari = {"Senin ", "Selasa ", "Rabu ", "Kamis ", "Jum'at ", "Sabtu ", "Minggu "};
        System.out.print("Masukan NIM anda: ");
        int nim = sc.nextInt();
        int duaNim = nim%100;
        if (duaNim < 10) {
            duaNim += 10;
        }
        for (int i = 0; i < duaNim; i++) {
            System.out.print(namaHari[i%namaHari.length]);
        }
        sc.close();
    }
}
