import java.util.Scanner;

 public class Ex01tabuada {
     public static void main(String[]args) {
         // Criaçao do objeto Scanner para ler entrada do usuario
         Scanner scanner = new Scanner(System.in);

         System.out.print("Digite um numero para ver sua tabuada: ");


         // le o numero inteiro fornecido pelo usuario
         int numero = scanner. nextInt();

         System.out.println("Tabuada do " + numero + ":");

         // logo for para gerar a tabuada de 1 a 10
         for (int i = 1; i <= 10; i++) {
             System.out.println(numero + " x " + i + " = " + (numero * i));

         }
           // fecha o scanner para evitar vazamento de memoria
            scanner.close();
      }

}