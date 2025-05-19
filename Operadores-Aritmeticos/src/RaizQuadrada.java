import java.util.Scanner;

public class RaizQuadrada {

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            System.out.println("Informe o primeiro número: ");
            var value1 = scanner.nextInt();
            System.out.printf("A raiz quadrada de %s é %s\n", value1, Math.sqrt(value1));
        }
    } 
}