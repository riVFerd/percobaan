import java.util.Scanner;

public class MenuWithLoop {
    public static void main(String[] args) {
        Scanner sc_29 = new Scanner(System.in);
        String nama_29 = " ", alamat_29 = " ", noHp_29 = " ";
        int motorTerjual_29 = 1, masaKerja_29 = 1;

        //Main menu
        for(int i=1; i>0;) {
            System.out.println("\nPilih Menu:\n1. Data Karyawan\n2. Bonus");
            System.out.print("Menu: ");
            int menu_29 = sc_29.nextInt();
            sc_29.nextLine();
            if (menu_29 == 1) {
                if (i==1) {
                    //input data
                    System.out.println("Masukkan data karyawan\n");
                    System.out.print("Nama : ");
                    nama_29 = sc_29.nextLine();
                    System.out.print("Alamat : ");
                    alamat_29 = sc_29.nextLine();
                    System.out.print("NoHp : ");
                    noHp_29 = sc_29.nextLine();
                    System.out.print("Jumlah Penjualan Motor : ");
                    motorTerjual_29 = sc_29.nextInt();
                    System.out.print("Masa kerja : ");
                    masaKerja_29 = sc_29.nextInt();
                    sc_29.nextLine();
                    i++; //agar data tidak dimasukan lagi
                } else {System.out.println("Data telah dimasukan");}
                System.out.println("\nApakah anda ingin mencetak data karyawan? (y/t)");
                String menuY_29 = sc_29.nextLine();
                if (menuY_29.equalsIgnoreCase("y")) {
                    //cetak data
                    System.out.println("========================================");
                    System.out.println("Data Karyawan");
                    System.out.println("========================================");
                    System.out.println("Nama : "+nama_29);
                    System.out.println("Alamat : "+alamat_29);
                    System.out.println("No Hp : "+noHp_29);
                    System.out.println("Jumlah Penjualan Motor : "+motorTerjual_29+"motor");
                    System.out.println("Masa Kerja : "+masaKerja_29+"tahun");
                    System.out.print("Kembali ke menu? (y/t)");
                    String menuY1_29 = sc_29.nextLine();
                    if (menuY1_29.equalsIgnoreCase("y")) {
                        continue;
                    } else {
                        break;
                    }
                } else {
                    continue;
                }
            } else if (menu_29 == 2) {
                if (i == 1) {
                    System.out.print("Masukkan data karyawan terlebih dahulu\nKembali ke menu? (y/t)");
                    String menuY_29 = sc_29.nextLine();
                    if (menuY_29.equalsIgnoreCase("y")) {
                        continue;
                    } else {
                        break;
                    }
                }
                //menu bonus
                System.out.println("========================================");
                System.out.println("Data Gaji Karyawan");
                System.out.println("========================================");
                System.out.println("Nama : "+nama_29);
                break;
            } else {
                System.out.println("Menu yang anda pilih tidak tersedia");
                continue;
            }
        }
        
    }
}