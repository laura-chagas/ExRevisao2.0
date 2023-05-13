import java.util.Scanner;

public class ExTres {
    public static void main(String[] args) {

        verificacaoNumero(receberNumero());

    }
    public static int receberNumero(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = scan.nextInt();

        return numero;
    }

    public static void verificacaoNumero(int numero) {

        if (numero % 5 == 0 && numero % 7 == 0) {
            System.out.println("O Número " + numero + " é múltiplo de 5 e 7!");
        } else if (numero % 5 == 0) {
            System.out.println("O Número " + numero + " é múltiplo de 5");
        } else if (numero % 7 == 0) {
            System.out.println("O Número " + numero + " é múltiplo de 7");
        } else {
            System.out.println("O Número " + numero + " não é múltiplo de 5 e nem de 7");
        }

    }

}
