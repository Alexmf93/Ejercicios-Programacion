import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Digame el radio");
        double radio = sc.nextDouble();
        final double pi = 3.14;
        double perimetro = radio * pi * 2;
        double area = radio * radio * pi;
        System.out.println("EL perímetro de la circunferencia es"+perimetro);
        System.out.println("El area de la circunferancia es"+area);



    }
}