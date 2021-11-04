import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        
        Scanner sc_29 = new Scanner(System.in);
        double bilangan1_29, bilangan2_29;
        char operator_29;

        System.out.print("Masukan bilangan pertama: ");
        bilangan1_29 = sc_29.nextDouble();
        System.out.print("Masukan operator bilangan (+,-,/,*): ");
        operator_29 = sc_29.next().charAt(0);
        System.out.print("Masukan bilangan kedua: ");
        bilangan2_29 = sc_29.nextDouble();
        sc_29.close();

        switch (operator_29) {
            case '+':
                System.out.printf("%.1f %s %.1f = %.1f\n", bilangan1_29, operator_29, bilangan2_29, bilangan1_29+bilangan2_29);
                break;
            case '-':
                System.out.printf("%.1f %s %.1f = %.1f\n", bilangan1_29, operator_29, bilangan2_29, bilangan1_29-bilangan2_29);
                break;
            case '/':
                System.out.printf("%.1f %s %.1f = %.1f\n", bilangan1_29, operator_29, bilangan2_29, bilangan1_29/bilangan2_29);
                break;
            case '*':
                System.out.printf("%.1f %s %.1f = %.1f\n", bilangan1_29, operator_29, bilangan2_29, bilangan1_29*bilangan2_29);
                break;
            default:
                System.out.println("Operator yang anda masukan salah!");
        }
    }
            
}