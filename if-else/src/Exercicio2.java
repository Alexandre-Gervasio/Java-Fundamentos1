import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        try(var scanner = new Scanner(System.in)){
            System.out.println("Informe seu peso: ");
            var pesoStr = scanner.nextLine().replace(",", ".");

            System.out.println("Informe sua altura: ");
            var alturaStr = scanner.nextLine().replace(",",".");

            try{
                double peso = Double.parseDouble(pesoStr);
                double altura = Double.parseDouble(alturaStr);

                double imc = peso / (altura * altura);
                System.out.printf("Seu IMC é: %.2f%n", imc);

                if(imc < 18.5){
                System.out.println("e está abaixo do peso");
                } else if(imc >= 18.5 && imc < 24.9){
                System.out.println("e está com o peso normal");
                } else if(imc >= 25 && imc < 29.9){
                System.out.println("e está com sobrepeso");
                } else if(imc >= 30 && imc < 34.9){
                System.out.println("e está com obesidade grau 1");
                } else if(imc >= 35 && imc < 39.9){
                System.out.println("e está com obesidade grau 2 (Severa)");
                } else {
                System.out.println("e está com obesidade grau 3 (Mórbida)");
                }

            } catch (NumberFormatException e){
                System.out.println("Erro: Peso ou altura inválidos.");
            }
            
            scanner.close();
        }
    }
}
