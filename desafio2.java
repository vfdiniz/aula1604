package desafios;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String codigoArmadilha = "1234";

        System.out.print("Digite o número final: ");
        int finalNumero = scanner.nextInt();

        int contador = 1;

        do {
            System.out.println(contador);

            if (contador % 10 == 0) {
                System.out.println("Armadilha ativada! Digite o código para salvar a cidade:");
                while (true) {
                    System.out.print("Código da armadilha: ");
                    String tentativa = scanner.next();

                    if (tentativa.equals(codigoArmadilha)) {
                        System.out.println("Código correto! Continue salvando...");
                        break;
                    } else {
                        System.out.println("Código errado! Tente novamente.");
                    }
                }
            }

            if (contador == finalNumero) {
                System.out.println("Você salvou a cidade até o número final!");
                break;
            }

            contador++;
        } while (true);

        scanner.close();
    }
}
