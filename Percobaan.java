import java.util.Scanner;

//percobaan program 
public class Percobaan {
    public static void main(String[] args) {
        double keuntungan,banyakPekerja, pendapatanPot, potTerjual, pengeluaranPot;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya pekerja: ");
        banyakPekerja = sc.nextDouble();

        pendapatanPot = banyakPekerja*20_000;
        potTerjual = banyakPekerja*5_000;
        pengeluaranPot = (potTerjual/10_000)*1_000;
        double pengeluaran = 15_000;
        double bayarStaff = 85_000;

        keuntungan = pendapatanPot - pengeluaran - pengeluaranPot - bayarStaff;
        System.out.println("Jumlah keuntungan pertahun = " + keuntungan);
    }
}
