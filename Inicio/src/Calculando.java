import java.util.Scanner;

public class Calculando {
    public static void main(String[] args) {
        
        try (var scanner = new Scanner(System.in)) {
        System.out.println("Quanto é 2 + 2 ?");
        var result = scanner.nextInt();
        var isRight = result == 4;
        System.out.printf("O resultado é 4, você acertou? %s \n", isRight ? "Sim" : "Não");

        }
    }
}
