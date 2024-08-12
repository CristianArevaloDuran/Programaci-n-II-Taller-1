import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int multiplicador;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero: ");
        multiplicador = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println("El resultado de " + multiplicador + " * " + i + " es igual a " + (multiplicador * i));
        }
    }
}