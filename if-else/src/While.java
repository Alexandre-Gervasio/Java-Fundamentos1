import java.util.Scanner;

public class While {
    public static void main(String[] args){
        try (var scanner = new Scanner(System.in)){
            var name = "";
            while (true){
                System.out.println("Informe um nome (Quando quiser parar digite (exit)): ");
                name = scanner.nextLine();
                System.out.println(name);

                if (name.equalsIgnoreCase( "exit")) break;
            }
        }
    }
}