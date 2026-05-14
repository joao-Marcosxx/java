package estruturascontrole;

import java.util.Scanner;
import java.util.Locale ;

       public class Ex02Imc {
           public static void main(String[] args) {
               // usa a Locale.US para garantir que o ponto (.) seja usado como separador decimal
               Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

               System.out.println(" --- Calculadora de IMC --- ");

               // Entada de dados
               System.out.print("Digite o seu peso (kg):  ");
               double peso = scanner.nextDouble();

               System.out.print("Digite a sua altura (m):");
               double altura = scanner.nextDouble();

               // Calculo de IMC: peso / (altura * altura)
               double imc = peso / (altura * altura);

               // Exibiçao do IMC calculado
               System.out.printf("Seu IMC é: %.2f\n", imc);

               // Estrutura condicional para classificaçao
               String classificaçao;
               if (imc <= 18.5) {
                   classificaçao = "Abaixo do peso";
               } else if (imc <= 25.9) {
                   classificaçao = " Peso ideal";
               } else if (imc <= 29.5) {
                   classificaçao = "Levemente acima do peso";
               } else if (imc <= 34.9) {
                   classificaçao = " Obesidade Grau 1";
               } else if (imc <= 39.9) { // Nota: Corrigido o intervalo de 35 a 34.9 para 35 a 39.9
                   classificaçao = "Obesidade Grau 2 ( severa) ";
               } else {
                   classificaçao = " Obesidade Grau 3( morbida)";
               }

               // exibiçao do resultado ]
               System.out.println(" Classificaçao " + classificaçao);

               scanner.close();

           }

       }
