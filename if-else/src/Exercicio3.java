import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        try (var scanner = new Scanner(System.in)){
            System.out.println("Informe um primeiro número: ");
            var primeiroNumeroStr = scanner.nextLine().replace(",", ".");

            System.out.println("Informe um segundo número, maior que o primeiro: ");
            var segundoNumeroStr = scanner.nextLine().replace(",", ".");

            System.out.println("Você deseja ver números pares ou ímpares? (P/I): ");
            var tipoStr = scanner.nextLine().toUpperCase();
            try{
                double primeiroNumero = Double.parseDouble(primeiroNumeroStr);
                double segundoNumero = Double.parseDouble(segundoNumeroStr);

                if (segundoNumero <= primeiroNumero) {
                    System.out.println("Erro: O segundo número deve ser maior que o primeiro.");
                    return;
                }

                if (!tipoStr.equals("P") && !tipoStr.equals("I")) {
                    System.out.println("Erro: Tipo inválido. Use 'P' para pares ou 'I' para ímpares.");
                    return;
                }

                for (double i = primeiroNumero; i <= segundoNumero; i++) {
                    if (tipoStr.equals("P") && i % 2 == 0) {
                        System.out.printf("%.0f ", i);
                    } else if (tipoStr.equals("I") && i % 2 != 0) {
                        System.out.printf("%.0f ", i);
                    }
                }
                System.out.println();

            } catch (NumberFormatException e){
                System.out.println("Erro: Números inválidos.");
            }
        }
    }
}
