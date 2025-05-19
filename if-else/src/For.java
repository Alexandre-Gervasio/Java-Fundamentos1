import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)){
            for (;;){
                System.out.println("Digite seu nome: ");
                var name = scanner.nextLine();

                if(name.equalsIgnoreCase("exit")){
                    System.out.println("Saindo...");
                    break;
                }
                System.out.println("Olá " + name + "!");
            }
        }
    }
}
