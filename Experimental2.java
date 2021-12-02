import java.util.Scanner;

//find fpb/hcf with simple logic by me (with recursive method)
public class Experimental2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan angka pertama: ");
        int n1 = sc.nextInt();
        System.out.println("Masukkan angka pertama: ");
        int n2 = sc.nextInt();
        
        System.out.printf("Fpb dari %d dan %d adalah %d", n1, n2, fpb(n1, n2, n2));
    }
    
    static int fpb(int n1, int n2, int i) {
        if (n1%i == 0 && n2%i == 0) {
            return i;
        } else {
            return fpb(n1, n2, i-1);
        }
    }
}
