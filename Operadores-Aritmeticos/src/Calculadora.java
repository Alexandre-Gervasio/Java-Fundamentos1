import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try(var scanner = new Scanner(System.in)){
        System.out.println("Digite o primeiro número:");
        var value1 = scanner.nextFloat();
        System.out.println("Digite o segundo número:");
        var value2 = scanner.nextFloat();
        System.out.printf("%s - %s = %s \n", value1, value2, value1 - value2);
        }
    }
}
