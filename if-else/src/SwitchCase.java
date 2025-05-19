import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)){
        System.out.print("Informe um número de 1 até 7: ");
        var option = scanner.nextInt();
        
        var message = switch (option){
            case 1, 7 -> {
                var day = option == 1 ? "Domingo" : "Sábado";
                yield String.format("Hoje é %s", day);
            }
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            default -> "Opção inválida";
        };
        System.out.println(message);

        
        // O código abaixo usa a sintaxe moderna do switch-case, que é mais concisa e legível.
        // switch (option){
        //     case 1 -> System.out.println("Domingo");
        //     case 2 -> System.out.println("Segunda-feira");
        //     case 3 -> System.out.println("Terça-feira");
        //     case 4 -> System.out.println("Quarta-feira");
        //     case 5 -> System.out.println("Quinta-feira");
        //     case 6 -> System.out.println("Sexta-feira");
        //     case 7 -> System.out.println("Sábado");
        //     default -> System.out.println("Opção inválida");
        // }



        // O código abaixo é uma versão mais antiga do switch-case, que não usa a sintaxe moderna do Java.
        // switch (option) {
        //     case 1:
        //         System.out.println("Domingo");
        //         break;
        //     case 2:
        //         System.out.println("Segunda-feira");
        //         break;
        //     case 3:
        //         System.out.println("Terça-feira");
        //         break;
        //     case 4: 
        //         System.out.println("Quarta-feira");
        //         break;
        //     case 5:
        //         System.out.println("Quinta-feira");
        //         break;
        //     case 6:
        //         System.out.println("Sexta-feira");
        //         break;
        //     case 7:
        //         System.out.println("Sábado");
        //         break;
        //     default:
        //         System.out.println("Opção inválida");
        //     }
        }
    }
}