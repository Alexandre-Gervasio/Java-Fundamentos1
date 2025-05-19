import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        try (var scanner = new Scanner (System.in)){
            System.out.println("Informe o valor de um dos lados do quadrado equilátero: ");
            var lado = scanner.nextInt();
            var area = lado * lado;
            System.out.printf("A área do quadrado é: %s \n", area);
        }
    }
}
