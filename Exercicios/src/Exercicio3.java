import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        try (var scanner = new Scanner (System.in)) {
            System.out.println("Informe o valor da base do retângulo: ");
            var base = scanner.nextInt();
            System.out.println("Informe o valor da altura do retângulo: ");
            var altura = scanner.nextInt();
            var area = base * altura;
            System.out.printf("A área do retângulo é: %s \n", area);
        }
    }
}
