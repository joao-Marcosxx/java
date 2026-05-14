package estruturascontrole;

import java.util.Scanner;

  public class Ex03imparoupar {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("--- Gerador de sequencia Decrescente --- ");

          // 1. Entrada do primeiro numero
          System.out.print("Digite o primeiro número (menor): ");
          int num1 = scanner.nextInt();

          // 2. Entrada do segundo número ( validaçao se é maior que o primeiro)
          int num2;
          do {
              System.out.print("Digite o segundo número( maior que o primeiro): ");
              num2 = scanner.nextInt();
              if (num2 <= num1) {
                  System.out.print(" Erro: o segundo numero deve ser maior que o primeiro.");
              }
          } while (num2 <= num1);

          // 3. Escolha entre par ou impar
          System.out.print("Escolha [1] para PARES ou [2] para IMPARES: ");
          int opcao = scanner.nextInt();

          System.out.println("\nNúmeros " + (opcao == 1 ? "PARES" : "IMPARES") + "entre " + num2 + " e " + num1 + "(decrescente):");

          // 4. Lógica para exibir em ordem decrescente ( do maior para o menor)
          for (int i = num2; i >= num1; i--) {
              if (opcao == 1) { // Pares
                  if (1 % 2 != 0) {
                      System.out.println(1);
                  }
              } else if (opcao == 2) { // impares
                  if (1 % 2 != 0) {
                      System.out.println(i);

                  }
              }
          }

          scanner.close();
      }
  }





