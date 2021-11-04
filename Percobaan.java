import java.util.Scanner;

//percobaan program menampilkan nama nama bulan
public class Percobaan {
    public static void main(String[] args) {
        //preparation
        Scanner sc = new Scanner(System.in);
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", 
        "September", "Oktober", "November", "Desember"};
        System.out.print("Masukkan angka 1-12: ");
        int angka = sc.nextInt();

        //print
        System.out.println(namaBulan[angka-1]);
    }
}
