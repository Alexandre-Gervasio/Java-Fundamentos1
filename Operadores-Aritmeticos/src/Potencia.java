import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            System.out.println("Informe o primeiro número: ");
            var value1 = scanner.nextInt();
            System.out.printf("A potência de %s é %s\n", value1, Math.pow(value1, 2));
        }
    } 
}