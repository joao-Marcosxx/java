import java.util.Scanner;

public class Ex03AreaDoRetangulo {
   public static void main(String [] args) {
       // Cria um scanner para ler dados do teclado
       Scanner scanner = new Scanner(System.in);

       // solicita e le a base
       System.out.print(" Digite a base do retangulo; ");
       double base = scanner .nextDouble();

       // solicita e le a altura
       System.out.print("Digite a altura do retangulo");
       double altura = scanner.nextDouble();

       //Calcule a area
        double area = base * altura;

      // exibe o resultado
       System.out.println("A area do retangulo é: " + area);

      // fecha scanner
       scanner.close();
   }

}