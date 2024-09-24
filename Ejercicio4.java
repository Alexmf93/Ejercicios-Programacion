import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digame un valor de a");
        int a = sc.nextInt();
        System.out.println("Digame un valor de b");
        int b = sc.nextInt();
        System.out.println("Digame un valor de c");
        int c = sc.nextInt();

        int aux = c;
        c = b;
        b = a;
        a = aux;
        System.out.println("Valor de b"+a);
        System.out.println("Valor de c"+b);
        System.out.println("Valor de a"+c);
    }
}