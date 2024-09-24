import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digame el numero de ventas de ropa");
        int ropa = sc.nextInt();
        System.out.println("Digame el numero de ventas electronicas");
        int electronica = sc.nextInt();
        int ventas = ropa + electronica;
        System.out.println("el total de ventas es "+ventas);
        double porcentaje1 = (ropa*100)/ventas;
        double porcentaje2 = (electronica*100)/ventas;
        System.out.println("El porcentaje de ventas en ropa es "+porcentaje1);
        System.out.println("El porcentaje de ventas de electronica es "+porcentaje2);
    }
}