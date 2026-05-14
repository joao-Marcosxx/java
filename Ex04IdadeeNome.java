import java.util.Scanner;

public class Ex04IdadeeNome {
    public static void main(String[] args) {
        // criando o Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // entada de dados para a pessoa 1
        System.out.print("Digite o nome da pessoa: ");
        String nome1 = scanner. nextLine();
        System.out.print("Digite a idade de " + nome1 + ": ");
        int idade1 = scanner. nextInt();

        // limpa o buffer do teclado
        scanner.nextLine();

        //Entrada de dados para a pessoa 2
        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = scanner. nextLine();
        System.out.print(" Digite a idade de " + nome2 + ": ");
        int idade2 = scanner. nextInt();

        // calcule a diferenca (usando Math.abs para garantir valor positivo)
        int diferença = Math.abs(idade1 - idade2 );

        // imprime o resultado
        System.out.println("resultado ");
        System.out.println("A diferenca de idade entre " + nome1 + " e " + nome2 + "é: "+ diferença + " anos(s).");


        // fecha o scanner
        scanner.close();

     }

}