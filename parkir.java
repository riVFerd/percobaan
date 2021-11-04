import java.util.Scanner;

public class parkir {
    public static void main(String[] args){
        int jamMasuk, jamKeluar, menitMasuk, menitKeluar, selisihJam, selisihMenit, biayaParkir;
        Scanner input = new Scanner(System.in);

        System.out.print("jam masuk : ");
        jamMasuk=input.nextInt();
        System.out.print("menit masuk : ");
        menitMasuk=input.nextInt();
        System.out.println("------------------------");
        System.out.print("jam keluar:");
        jamKeluar=input.nextInt();
        System.out.print("menit keluar : ");
        menitKeluar=input.nextInt();

        selisihMenit=(menitKeluar+60)-menitMasuk;
        int bulatMenit = (selisihMenit / 60) - 1;
        int sisaMenit = 0;
        sisaMenit=(selisihMenit % 60);
        selisihJam=jamKeluar-jamMasuk+bulatMenit;

        System.out.println("------------------------");
        System.out.println("lama parkir : "+selisihJam+":"+sisaMenit);

        System.out.println("------------------------");
        double waktuJam;
        waktuJam=Math.ceil(selisihJam+(sisaMenit/60.0));
        biayaParkir = (int)waktuJam*1000;
        System.out.println("biaya parkir  : "+biayaParkir);

    }
    
}