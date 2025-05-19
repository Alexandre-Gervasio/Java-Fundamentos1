import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner (System.in)){
        System.out.println("Olá, qual seu nome? ");
        String name = scanner.next();

        System.out.println("Qual sua idade? ");
        int age = scanner.nextInt();

        System.out.println("Olá " + name + ", você tem " + age + " anos.");
        System.out.println("Você é maior de idade? " + (age >= 18 ? "Sim" : "Não"));
        }
    }
}
