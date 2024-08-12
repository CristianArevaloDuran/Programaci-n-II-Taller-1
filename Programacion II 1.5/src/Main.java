import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] notas = new double[5][4];

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.println("Ingrese la nota #" + (j+1) + " para el estudiante #" + (i+1));
                notas[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i <= 4; i++) {
            double prom = 0;
            System.out.println("Las notas del estudiante #" + (i+1) + " son: ");
            for (int j = 0; j <= 3; j++) {
                prom = notas[i][j] + prom;
                System.out.println(notas[i][j]);
            }
            System.out.println("Y su promedio es: " + (prom / 4));
        }

    }
}