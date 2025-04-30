package desafios;

import java.util.Random;
import java.util.Scanner;

public class desafio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int pontos = 0;
        boolean derrotado = false;

        System.out.println("Você entrou na Caverna dos Dragões!");

        while (!derrotado && pontos < 100) {
            System.out.println("Para onde quer ir? Digite: frente, esquerda ou direita");
            String decisão = scanner.nextLine().toLowerCase();

            int chance = random.nextInt(100) + 1;

            if (chance <= 50) {
                System.out.println("Você encontrou um dragão! Você perdeu a batalha");
                derrotado = true;
            } else {
                int pontosGanhas = random.nextInt(20) + 10;
                pontos += pontosGanhas;
                System.out.println("Você encontrou um tesouro Pontos ganhos: " + pontosGanhas);
                System.out.println("Pontos totais: " + pontos);
            }

            if (pontos >= 100) {
                System.out.println("Parabéns! Você encontrou o tesouro final e venceu a caverna");
            }
        }

        if (derrotado) {
            System.out.println("A aventura acabou. Você foi derrotado na caverna");
        }

        scanner.close();
    }
}