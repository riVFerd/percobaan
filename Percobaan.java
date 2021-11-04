import java.util.Scanner;

//percobaan program menampilkan nilai dari array secara kebalik
public class Percobaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        //input loop
        for (int i=0; i<numbers.length; i++) {
            System.out.print("Masuukan nilai indeks ke-" + i + ": ");
            numbers[i] = sc.nextInt();
        }
        sc.close();

        //print array with loop
        for (int i=numbers.length-1; i>=0; i--) {
            System.out.printf("%s%d : %d\n", "Nilai dari indeks ke-", i, numbers[i]);
        }
    }
}
