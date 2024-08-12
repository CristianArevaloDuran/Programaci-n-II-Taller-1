import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int suma = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 9; i++) {
            System.out.println("Ingrese el #" + i + " del array: ");
            numeros[i] = sc.nextInt();
            suma = numeros[i] + suma;
        }

        System.out.println("El promedio de los números es: " + (suma / 10));

        for (int i = 0; i <= 9; i ++) {
            int temporal = 0;
            System.out.println("-. " + numeros[i] + ": ");
            for (int j = 0; j <= 9; j++) {
                if (numeros[i] == numeros[j]) {
                    temporal = temporal + 1;
                }
            }

            System.out.println(temporal);
        }
    }
}