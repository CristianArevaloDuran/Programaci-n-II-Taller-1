import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int centinela = 0;
        int fechaNac;

        Scanner sc = new Scanner(System.in);

        while (centinela == 0) {
            System.out.println("Ingrese el año de nacimiento");
            fechaNac = sc.nextInt();

            if ((2024 - fechaNac) < 18 ) {
                System.out.println("No es apto para votar");
            } else {
                System.out.println("Es apto para votar");
            }

            System.out.println("Quiere continuar?");
            System.out.println("0. Si");
            System.out.println("1. No");

            centinela = sc.nextInt();
        }
    }
}