/**
 * Jawaban tugas praktikum daspro minggu 13
 */
public class Experimental {

    public static void main(String[] args) {
        int[][] tabelPenjualan_29 = {
        {20, 15, 35, 24, 70},
        {30, 40, 10, 28, 35},
        {5, 10, 50, 48, 15}
        };
        menuFav_29(tabelPenjualan_29);
        pemasukan_29(tabelPenjualan_29);
        porsiTerjual_29(tabelPenjualan_29);
    }
    
    //fungsi menampilkan menu favorite di hari Selasa/Jum'at
    static void menuFav_29(int[][] tabel_29) {
        String[] daftarMenu_29 = {"Nasi goreng", "Soto", "Sate"};
        int favSls_29 = 0, indexSls_29 = 0;
        int favJmt_29 = 0, indexJmt_29 = 0;
        
        for (int j_29 = 0; j_29<tabel_29[0].length; j_29++) {
            for (int i_29 = 0; i_29<tabel_29.length; i_29++) {
                if (j_29 == 1) {
                    if (tabel_29[i_29][j_29] > favSls_29) {
                        favSls_29 = tabel_29[i_29][j_29];
                        indexSls_29 = i_29;
                    }
                } else if (j_29 == 4) {
                    if (tabel_29[i_29][j_29] > favJmt_29) {
                        favJmt_29 = tabel_29[i_29][j_29];
                        indexJmt_29 = i_29;
                    }
                }
            }
        }//outer loop
        System.out.println("Menu favorit di hari Selasa adalah " + daftarMenu_29[indexSls_29]);
        System.out.println("Menu favorit di hari Jum'at adalah " + daftarMenu_29[indexJmt_29]);
    }
    
    //fungsi menghitung total pemasukan
    static void pemasukan_29(int[][] tabel_29) {
        int totalPemasukan_29 = 0;
        
        for (int j_29 = 0; j_29<tabel_29[0].length; j_29++) {
            for (int i_29 = 0; i_29<tabel_29.length; i_29++) {
                if (i_29 == 0){
                    totalPemasukan_29 += (tabel_29[i_29][j_29] * 20_000);
                } else if (i_29 == 1) {
                    totalPemasukan_29 += (tabel_29[i_29][j_29] * 15_000);
                } else if (i_29 == 2) {
                    totalPemasukan_29 += (tabel_29[i_29][j_29] * 25_000);
                }
            }
        }//outer loop
        System.out.println("\nPemasukan restoran dari Senin sampai Jum'at adalah Rp. " + totalPemasukan_29);
    }
    
    //fungsi menampilkan berapa porsi terjual pada tiap menu dari Senin sampai Jum'at
    static void porsiTerjual_29(int[][] tabel_29) {
        int totalNasgor_29 = 0;
        int totalSoto_29 = 0;
        int totalSate_29 = 0;
        
        for (int j_29 = 0; j_29<tabel_29[0].length; j_29++) {
            for (int i_29 = 0; i_29<tabel_29.length; i_29++) {
                if (i_29 == 0){
                    totalNasgor_29 += tabel_29[i_29][j_29];
                } else if (i_29 == 1) {
                    totalSoto_29 += tabel_29[i_29][j_29];
                } else if (i_29 == 2) {
                    totalSate_29 += tabel_29[i_29][j_29];
                }
            }
        }//outer loop
        System.out.printf("%nMulai dari Senin sampai Jum'at, jumlah Nasi goreng yang terjual adalah %d porsi%n", totalNasgor_29);
        System.out.printf("Mulai dari Senin sampai Jum'at, jumlah Soto yang terjual adalah %d porsi%n", totalSoto_29);
        System.out.printf("Mulai dari Senin sampai Jum'at, jumlah Sate yang terjual adalah %d porsi%n", totalSate_29);
    }
}