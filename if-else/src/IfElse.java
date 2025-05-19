import java.util.Scanner;

public class IfElse{
    public static void main(String[] args) throws Exception {
        try (var scanner = new Scanner(System.in)){
            
            System.out.println("Informe seu nome: ");
            var name = scanner.nextLine();
            
            System.out.println("Informe sua idade: ");
            var age = scanner.nextInt();

            System.out.println("Você é emancipado? (sim/não): ");
            var isEmancipated = scanner.next().equalsIgnoreCase("sim");

            if (age >= 18) {
                System.out.printf("%s você tem %s anos, você pode dirigir \n", name, age);
            }
            else if (age >= 16 && isEmancipated) {
                System.out.printf("%s você tem %s anos, mas tem a liberação deviado a sua emancipação, então pode dirigir \n", name, age);
            }
            else {
                System.out.printf("%s você tem %s anos, e não tem emancipação, então você não pode dirigir \n", name, age);
            }

            System.out.println("Fim da execução");
        }
    }
}
