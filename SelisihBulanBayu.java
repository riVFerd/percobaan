import java.util.Scanner;

public class SelisihBulanBayu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //deklarasi variable
        int uangAwal, bulanAwal = 10, tahunAwal = 2021;
        int uangAkhir = 0, bulanAkhir, tahunAkhir;
        int selisihBulan = 0, selishTahun = 0;

        //meminta input user
        System.out.println("Masukan tabungan awal : ");
        uangAwal = sc.nextInt();
        System.out.println("Masukkan bulan akhir(1-12) : ");
        bulanAkhir = sc.nextInt();
        System.out.println("Masukkan tahun akhir : ");
        tahunAkhir = sc.nextInt();

        if (bulanAwal > bulanAkhir) {
            while (bulanAwal != bulanAkhir) {
                if (bulanAwal == 12) {
                    bulanAwal = 0;
                    tahunAwal++;
                    continue;
                }
                bulanAwal++;
                selisihBulan++;
            }
        } else {
            selisihBulan = bulanAkhir - bulanAwal;
        }
        selisihBulan = selisihBulan + ((tahunAkhir-tahunAwal)*12);
        System.out.println(selisihBulan);

        int i=1;
        while (i <= selisihBulan) {
            i++;
        }
    }
}