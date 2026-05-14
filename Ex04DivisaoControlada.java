import java.util.Scanner;

public class Ex04DivisaoControlada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número incial (divisor) : ");
        int numeroInicial = scanner.nextInt();

        // Evitar divisao por zero caso o usuario digite 0
        if (numeroInicial == 0) {
            System.out.println("O numero inicial nao pode ser zero.");
            return;
        }

        int proximoNumero;
        boolean continuar = true;

        do {
            System.out.print("Informe um novo numero:");
            proximoNumero = scanner.nextInt();

            // Regra: Numeros menores que o inicial devem ser ignorados
            if (proximoNumero < numeroInicial) {
                System.out.println("Numero ignorado(menor que " + numeroInicial + ").");
                continue; // Pula para a proxima iteracao do loop
            }

            // Verifica se a divisao é exata (resto == 0)
            if (proximoNumero % numeroInicial == 0) {
                System.out.println(proximoNumero + " é divisivel por " + numeroInicial + ", continuando...");
            } else {
                System.out.println(proximoNumero + " nao é divisiel por " + numeroInicial + "(resto != 0).");
                continuar = false; // finaliza o loop

            }

        } while (continuar);

        System.out.println("Progama encerrado");
        scanner.close();

    }
}










