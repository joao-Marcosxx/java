import java.util.Scanner;
import java.util.Random;

public class jogodavelha {
    public static void main(String[] args) {
        // Passo 1 — O Tabuleiro (Array 2D)
        char[][] tabuleiro = new char[3][3];
        inicializarTabuleiro(tabuleiro);

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char jogadorAtual = 'X';
        boolean jogando = true;

        System.out.println("Bem-vindo ao Jogo da Velha!");

        // Passo 3 — Loop Principal
        while (jogando) {
            // Passo 2 — Exibir o Tabuleiro
            exibirTabuleiro(tabuleiro);

            // Passo 4 — Entrada e Validação (Jogador Humano)
            if (jogadorAtual == 'X') {
                System.out.println("Sua vez (Jogador X):");
                int linha, coluna;
                while (true) {
                    System.out.print("Digite a linha (0-2): ");
                    linha = scanner.nextInt();
                    System.out.print("Digite a coluna (0-2): ");
                    coluna = scanner.nextInt();

                    if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
                        tabuleiro[linha][coluna] = 'X';
                        break;
                    } else {
                        System.out.println("Posição inválida ou já ocupada! Tente novamente.");
                    }
                }
            }
            // Passo 7 — CPU com Random (Jogador O)
            else {
                System.out.println("Vez da CPU (Jogador O):");
                while (true) {
                    int linha = random.nextInt(3);
                    int coluna = random.nextInt(3);

                    if (tabuleiro[linha][coluna] == ' ') {
                        tabuleiro[linha][coluna] = 'O';
                        System.out.println("A CPU escolheu a posição: [" + linha + "][" + coluna + "]");
                        break;
                    }
                }
            }

            // Passo 5 — Verificar Vitória
            if (verificarVitoria(tabuleiro, jogadorAtual)) {
                exibirTabuleiro(tabuleiro);
                if (jogadorAtual == 'X') {
                    System.out.println("Parabéns! Você venceu!");
                } else {
                    System.out.println("Voce venceu!");
                }
                jogando = false;
            }
            // Passo 6 — Empate e Troca de Jogador
            else if (tabuleiroCheio(tabuleiro)) {
                exibirTabuleiro(tabuleiro);
                System.out.println("O jogo terminou em empate!");
                jogando = false;
            } else {
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        }
        scanner.close();
    }

    // Método auxiliar do Passo 1 para preencher com espaços vazios
    public static void inicializarTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    // Passo 2 — Exibir o Tabuleiro
    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + tabuleiro[i][0] + " | " + tabuleiro[i][1] + " | " + tabuleiro[i][2]);
            if (i < 2) {
                System.out.println("---|---|---");
            }
        }
        System.out.println();
    }

    // Passo 5 — Verificar Vitória (Linhas, colunas e diagonais)
    public static boolean verificarVitoria(char[][] tabuleiro, char jogador) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
                return true;
            }
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) {
                return true;
            }
        }
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
            return true;
        }
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
            return true;
        }
        return false;
    }

    // Passo 6 — Verificar se o tabuleiro está cheio
    public static boolean tabuleiroCheio(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

