import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        // Maneira mais manual de solicitar entrada de dados do utilizador.
        /*
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);
        
        System.out.println("Olá, me chamo "+ nome + " " + sobrenome + ".");
        System.out.println("Tenho " + idade + " anos de idade.");
        System.out.println("Minha altura é " + altura + "cm.");
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        //vamos imprimir os dados obtidos pelo utilizador.
        System.out.println("Olá, me chamo " + nome + " " + sobrenome + ".");
        System.out.println("Tenho " + altura + "cm, de altura.");
        System.out.println("Atualmente estou com " + idade + " anos.");

    }
}
