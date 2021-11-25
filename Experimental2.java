import java.util.Scanner;

public class Experimental2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        kaliDua(sc.nextInt());
    }
    
    static void kaliDua(int num) {
        int result = num * 2;
        System.out.println("Hasil kali dua dari "+num+" adalah "+result);
    }
}
