import java.time.OffsetDateTime;
import java.util.Scanner;

public class Exercicio4{
    public static void main(String[] args){
        var baseYear = OffsetDateTime.now().getYear();
        try (var scanner = new Scanner (System.in)){
            System.out.println("Informe o nome da PRIMEIRA pessoa: ");
            var name1 = scanner.next();
            
            System.out.println("Informe o ano de seu nascimento: ");
            var year1 = scanner.nextInt();
            var age1 = baseYear - year1;
            
            System.out.println("Informe o nome da SEGUNDA pessoa: ");
            var name2 = scanner.next();
            
            System.out.println("Informe o ano de seu nascimento: ");
            var year2 = scanner.nextInt();
            var age2 = baseYear - year2;
            
            var difference = age1 - age2;

            System.out.printf("%s tem %s anos de idade \n", name1, age1);
            System.out.printf("%s tem %s anos de idade \n", name2, age2);
            
            if (difference < 0) {
                difference = -difference;
                System.out.printf("A diferença de idade entre %s e %s é de %s anos \n", name2, name1, difference);
            } else {
                // difference = -difference;
            System.out.printf("A diferença de idade entre %s e %s é de %s anos \n", name1, name2, difference);
        
            }
        }
    }
}