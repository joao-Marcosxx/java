import java.util.Scanner;

public class Ex02AreaDoQuadrado {
    public static void main(String [] args) {
        // Cria um objeto Scanner para ler a entrada do usuario
        Scanner scanner = new Scanner(System. in);

        System.out. print("Digite o tamanho do lado do quadrado: ");

        // recebe o lado como double para permitir numeros decimais
        double lado = scanner. nextDouble();

        // calcula a área : lado * lado
        double area = lado * lado;

        // exibe o resultado
        System.out.println(" A área do quadrado com lado " + lado + " é : " + area);

        // fecha o scanner
        scanner. close();



    }

}



