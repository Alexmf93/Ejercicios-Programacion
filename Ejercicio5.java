import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digame los segundos");
        int segundos1 = sc.nextInt();
        int horas = segundos1 / 3600;
        int minutos = ((segundos1-horas*3600)/60);
        int segundos = (segundos1-(horas*3600+minutos*60));
        System.out.println("Horas"+horas);
        System.out.println("Minutos"+minutos);
        System.out.println("Segundos"+segundos);
    }
}