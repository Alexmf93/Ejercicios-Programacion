import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el primer numero");
        int numero = sc.nextInt();
        System.out.println("Dime el segundo numero");
        int numero2 = sc.nextInt();
        System.out.println("Dime el tercer numero");
        int numero3 = sc.nextInt();
        System.out.println("Dime el cuarto numero");
        int numero4 = sc.nextInt();
        int multiplication = numero * numero2 *numero3* numero4;
        System.out.println("El resultado de la multiplicacion es"+multiplication);
        int suma = numero + numero2 + numero3 + numero4;
        System.out.println("El resultado de la suma es"+suma);
        double media = (numero + numero2 + numero3 + numero4) / 2;
        System.out.println("La media es"+media);
    }
}