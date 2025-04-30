package desafios;

import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int estrelasColetadas = 0;
        final int estrelasPorMeteoro = 10;

        System.out.println("Início da corrida espacial! Coleta estrelas e desvia de meteoros!");

        while (true) {
            estrelasColetadas++;
            System.out.println("Estrela coletada! Total: " + estrelasColetadas);

            if (estrelasColetadas % estrelasPorMeteoro == 0) {
                System.out.println("Um meteoro apareceu! Você deve desviar.");
                String comando;
                do {
                    System.out.print("Digite 'esquerda' ou 'direita': ");
                    comando = scanner.nextLine().toLowerCase();

                    if (!comando.equals("esquerda") && !comando.equals("direita")) {
                        System.out.println("Comando inválido. Tente novamente.");
                    }
                } while (!comando.equals("esquerda") && !comando.equals("direita"));

                System.out.println("Desvio registrado: " + comando);
            }

            if (estrelasColetadas >= 50) {
                System.out.println("Fim da corrida! Você coletou " + estrelasColetadas + " estrelas.");
                break;
            }
        }

        scanner.close();
    }
}