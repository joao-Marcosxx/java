import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcaoMenu;

        do {
            exibirMenuPrincipal();
            opcaoMenu = scanner.nextInt();

            switch (opcaoMenu) {
                case 1: // Soma
                    realizarOperacaoContinua(scanner, "SOMA");
                    break;
                case 2: // Subtração
                    realizarOperacaoContinua(scanner, "SUBTRAÇÃO");
                    break;
                case 3: // Multiplicação
                    System.out.print("Informe o 1º número: ");
                    double multNum1 = scanner.nextDouble();
                    System.out.print("Informe o 2º número: ");
                    double multNum2 = scanner.nextDouble();
                    double resultadoMult = multNum1 * multNum2;
                    System.out.printf("Resultado da Multiplicação: %.2f\n\n", resultadoMult);
                    break;
                case 4: // Divisão
                    System.out.print("Informe o dividendo (numerador): ");
                    double dividendo = scanner.nextDouble();
                    System.out.print("Informe o divisor (denominador): ");
                    double divisor = scanner.nextDouble();

                    if (divisor == 0) {
                        System.out.println("Erro: Divisão por zero não permitida.\n");
                    } else {
                        double quociente = dividendo / divisor;
                        double resto = dividendo % divisor;
                        System.out.printf("Resultado da Divisão (Quociente): %.4f\n", quociente);
                        System.out.printf("Resto da divisão: %.4f\n\n", resto);
                    }
                    break;
                case 5: // Potência
                    System.out.print("Informe a base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Informe o expoente (N): ");
                    int expoente = scanner.nextInt();
                    double resultadoPot = Math.pow(base, expoente);
                    System.out.printf("Resultado de %.2f elevado a %d é: %.4f\n\n", base, expoente, resultadoPot);
                    break;
                case 6: // Sair
                    System.out.println("Saindo da calculadora. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.\n");
            }

        } while (opcaoMenu != 6);

        scanner.close();
    }

    public static void exibirMenuPrincipal() {
        System.out.println("=================================");
        System.out.println("       MENU DA CALCULADORA       ");
        System.out.println("=================================");
        System.out.println("1. Realizar uma soma");
        System.out.println("2. Realizar uma subtração");
        System.out.println("3. Realizar uma multiplicação");
        System.out.println("4. Realizar uma divisão");
        System.out.println("5. Elevar um número a uma potência N");
        System.out.println("6. Sair da calculadora");
        System.out.print("Escolha uma opção (1-6): ");
    }

    public static void realizarOperacaoContinua(Scanner scanner, String operacao) {
        System.out.print("Informe o 1º número: ");
        double resultado = scanner.nextDouble();

        System.out.print("Informe o 2º número: ");
        double proximoNumero = scanner.nextDouble();

        if (operacao.equals("SOMA")) {
            resultado += proximoNumero;
        } else {
            resultado -= proximoNumero;
        }

        int opcaoSubmenu;
        do {
            System.out.printf("=> Resultado atual da %s: %.2f\n", operacao, resultado);
            System.out.println("1. Informar mais números para continuar");
            System.out.println("2. Sair da operação (voltar ao menu principal)");
            System.out.print("Escolha uma opção: ");
            opcaoSubmenu = scanner.nextInt();

            if (opcaoSubmenu == 1) {
                System.out.print("Informe o novo número: ");
                double novoNumero = scanner.nextDouble();
                if (operacao.equals("SOMA")) {
                    resultado += novoNumero;
                } else {
                    resultado -= novoNumero;
                }
            } else if (opcaoSubmenu != 2) {
                System.out.println("Opção inválida!\n");
            }

        } while (opcaoSubmenu != 2);

        System.out.println("Retornando ao menu principal...\n");
    }
}












