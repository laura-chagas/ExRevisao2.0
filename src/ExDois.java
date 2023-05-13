import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExDois {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual nome da empresa? ");
        String empresa = scan.next();

        System.out.println("Informe a grade de funcionários na empresa: ");
        int qtdeFuncionarios = scan.nextInt();

        List<Double> salarioFuncionarios = new ArrayList<>();

        for (int i = 0; i < qtdeFuncionarios; i++) {
            System.out.println("Informe o salário do funcionario " + (i + 1));
            salarioFuncionarios.add(scan.nextDouble());
        }

        mediaSalarios(qtdeFuncionarios, salarioFuncionarios, empresa);

    }

    public static void mediaSalarios(int qtdeFuncionarios, List<Double> salarioFuncionarios, String empresa) {
        double soma = 0;
        for (int i = 0; i < salarioFuncionarios.size(); i++) {
            soma += salarioFuncionarios.get(i);
        }

        double mediaSalario = soma / salarioFuncionarios.size();

        System.out.println("A media salarial da empresa " + empresa + " é de " + mediaSalario + " reais");

    }
}
