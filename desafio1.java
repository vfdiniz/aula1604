package desafios;

import java.util.Random;
import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int numeroSecreto = rand.nextInt(100) + 1; // entre 1 e 100
        int tentativas = 0;
        int palpite;

        System.out.println("Vamos jogar! Tente adivinhar o número entre 1 e 100.");

        while (true) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
                break;
            } else if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior.");
            } else {
                System.out.println("O número secreto é menor.");
            }
        }

        scanner.close();
    }
}