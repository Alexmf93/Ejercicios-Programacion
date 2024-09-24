import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("digame un numero de 5 cifras ");
        int num = sc.nextInt();

        if(num<10000 || num>99999){
            System.out.println("Error, el numero debe contener 5 digitos");
        }
        else{
        int digito1 = num/10000;
        System.out.println("El digito 1 es "+digito1);
        int digito2 = (num/1000)%10;
        System.out.println("El digito 2 es "+digito2);
        int digito3 = (num/100)%10;
        System.out.println("El digito 3 es "+digito3);
        int digito4 = (num/10)%10;
        System.out.println("El digito 4 es "+digito4);
        int digito5 = (num/1)%10;
        System.out.println("El digito 5 es "+digito5);

        }
    }
}