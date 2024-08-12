import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 9; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + " al array");
            numeros[i] = sc.nextInt();
        }

        for (int j = 0; j <= 9; j++) {
            if (numeros[j] == 0) {
                ceros = ceros + 1;
            } else if (numeros[j] < 0) {
                negativos = negativos + 1;
            } else {
                positivos = positivos + 1;
            }
        }

        System.out.println("-- Hay: ");
        System.out.println("-. " + positivos + " numeros positivos");
        System.out.println("-. " + negativos + " numeros negativos");
        System.out.println("-. " + ceros + " ceros");
    }
}