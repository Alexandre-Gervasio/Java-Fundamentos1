// CALCULADORA DE TABUADAS

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)){
            System.out.println("Informe um número para saber sua tabuada: ");
            var number = scanner.nextInt();
            
            System.out.println("Tabuada de " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%s * %s = %s \n", number, i, number * i);
            }
        }
    }    
}
