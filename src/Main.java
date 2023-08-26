import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Questao1();
        Questao2();
    }

    // #region Questão 1
    static void Questao1() {
        Scanner ler = new Scanner(System.in);

        int max30 = 0, soma30 = 0, somatotal = 0;
        int[] vet = new int[8];

        System.out.println("Entre com os números: ");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = ler.nextInt();
            somatotal += vet[i];
        }
        System.out.print("Numeros maiores que 30: ");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > 30) {
                soma30 += vet[i];
                max30 = vet[i];
                System.out.print(max30 + " | ");
            }
        }
        System.out.println("\nSoma dos numeros maiores que 30: " + soma30);
        System.out.println("Soma total do vetor: " + somatotal);
    }

    // #endregion
    // #region
    static void Questao2() {
        Scanner ler = new Scanner(System.in);
        int[][] estoque = new int[4][5];
        boolean parar = false;

        while (!parar) {
            System.out.print("Entre com o número do armario: ");
            int armario = ler.nextInt();

            System.out.print("Emtre com o número da prateleira: ");
            int prateleira = ler.nextInt();

            if (armario < 0 || armario > 4 || prateleira < 0 || prateleira > 3) {
                System.out.println("Armario ou prateleira invalido.");
                continue;
            }

            if (estoque[armario][prateleira] >= 10) {
                System.out.println("Espacos insuficiente");
            } else {
                estoque[armario][prateleira]++;
                System.out.println("A caixa foi adicionada!");
            }

            System.out.print("Deseja prosseguir, (1)sim ou (2)nao ? ");
            int keep = ler.nextInt();

            if (keep == 2) {
                parar = true;
            } else if (keep == 1) {
                parar = false;
            }
        }
        System.out.println("Quantidade de caixas em cada prateleira/armario");
        for (int prateleira = 0; prateleira <= 3; prateleira++) {
            for (int armario = 0; armario <= 4; armario++) {
                System.out.print(estoque[prateleira][armario]);
            }
        }
        ler.close();
    }
    // #endregion
}
