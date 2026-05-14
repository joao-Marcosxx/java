import java.util.Scanner;
import java.time.LocalDate;

public class Ex01Idade {
    public static void main(String[] args) {
        // Cria o scanner para ler a entrada do teclado
        Scanner scanner = new Scanner(System. in);

        // Pergunta o nome
        System.out.print("Digite seu nome: ");
        String nome= scanner.nextLine();

        // Pergunta o ano de nascimento
        System.out.print("Digite seu ano de nascimento: ");
        int  anoNascimento = scanner.nextInt();

        // Obtém o ano atual automaticamente
        int anoAtual = LocalDate.now().getYear();

        // calcula a idade
        int idade = anoAtual - anoNascimento;

        // imprima o resultado
        System.out.println("Olá, " + nome + " ! Voce tem " + idade + " anos de idade!");

        // fecha o scanner
        scanner.close();



}

}
