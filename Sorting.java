import java.util.Scanner;

//Percobaan sorting
public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        
        //input loop
        for (int i=0; i<numbers.length; i++) {
            System.out.print("Masukkan anggak intuk indek ke-"+i+": ");
            numbers[i] = sc.nextInt();
        }
        
        //sorting, outer loop
        for (int i=0; i<numbers.length; i++) {
            //sorting, inner loop
            for (int j=0; j<numbers.length-1; j++) {
                if (numbers[j] < numbers[j+1]) {
                    int swapper = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = swapper;
                }
            }
        }

        //print with for each
        for (int i : numbers) {
            System.out.println(i + " ");
        }

        sc.close();
    }
}
