package desafios;

import java.util.Scanner;

public class desafio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] gabarito = {"A", "B", "C", "D", "A", "D", "B", "C", "A", "D"};
        
        int totalAlunos = 0;
        int somaNotas = 0;
        String respostaOutroAluno;

        do {
            int acertos = 0;
            System.out.println("Resposta do aluno:");

            String[] respostasAluno = new String[10];

            for (int i = 0; i < 10; i++) {
                System.out.printf("Questão %d: ", i + 1);
                respostasAluno[i] = scanner.nextLine().toUpperCase();
            }
            
            for (int i = 0; i < 10; i++) {
                if (respostasAluno[i].equals(gabarito[i])) {
                    acertos++;
                }
            }

            totalAlunos++;
            somaNotas += acertos;

            System.out.println("Total de acertos: " + acertos);

            System.out.print("Outro aluno vai utilizar o sistema? (sim/não): ");
            respostaOutroAluno = scanner.nextLine().toLowerCase();

        } while (respostaOutroAluno.equals("sim"));

        double media = (double) somaNotas / totalAlunos;

        System.out.println("Total de alunos que utilizaram o sistema: " + totalAlunos);
        System.out.printf("Média das notas da turma: %.2f\n", media);

        scanner.close();
    }
}