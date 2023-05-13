import java.util.Scanner;

public class ExQuatro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número qualquer: ");
        String num = scan.next();

        numConv(num);

    }

    public static void numConv(String num) {

        String[] numeroDividido = num.split("");

        String numeroInvertido = "";

        for (int i = numeroDividido.length - 1; i >= 0; i--) {
            numeroInvertido += numeroDividido[i];

        }
        System.out.println(numeroInvertido);
    }
}
