import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExSeis {
    public static void main(String[] args) {

        receberNumeroseSomar();

    }public static void receberNumeroseSomar(){

        Scanner scan = new Scanner(System.in);
        List<Integer> numerosRecebidos = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite um número");
            numerosRecebidos.add(scan.nextInt());
        }
        int soma = 0;
        for (int i = 0; i < numerosRecebidos.size(); i++) {

            soma  += numerosRecebidos.get(i);

        }
        System.out.println(soma);

    }

}
