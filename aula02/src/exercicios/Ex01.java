// código para dividir pedaços de duas tortas por duas pessoas, MDC com recursividade com tres testes

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {  
       
        Scanner sc = new Scanner(System.in);
        int qtdTestes, ana, beto, resultado;
        long inicio, fim, inicio2, fim2;
         
        System.out.print("Digite a quantidade de testes: ");
        qtdTestes = sc.nextInt();
        for (int i = 1 ; i <= qtdTestes ; i++) {
            System.out.print("Digite o tamanho da torta de Ana: ");
            ana = sc.nextInt();
            System.out.print("Digite o tamanho da torta do Beto: ");
            beto = sc.nextInt();
            inicio = System.currentTimeMillis();
            inicio2 = System.nanoTime();
            resultado = mdc(ana, beto);
            fim = System.currentTimeMillis();
            fim2 = System.nanoTime();
            System.out.printf("tamanho = %d\n", resultado);
            System.out.println("Tempo de execução recursivo: " + (fim2 - inicio2) + " ns");
            System.out.println("Tempo de execução recursivo: " + (fim - inicio) + " ms");

            // versão com mdc iterativo
            inicio = System.currentTimeMillis();
            inicio2 = System.nanoTime();
            resultado = mdci(ana, beto);
            fim = System.currentTimeMillis();
            fim2 = System.nanoTime();
            System.out.printf("tamanho = %d\n", resultado);
            System.out.println("Tempo de execução iterativo: " + (fim2 - inicio2) + " ns");
            System.out.println("Tempo de execução iterativo: " + (fim - inicio) + " ms");


        }
        sc.close();

    }

    private static int mdci(int ana, int beto) {
        int resto;
        while (beto != 0) {
            resto = ana % beto;
            ana = beto;
            beto = resto;
        }
        return ana;
    }

    private static int mdc(int ana, int beto) {
        if (beto == 0) {
            return ana;
        } else {
            return mdc(beto, ana % beto);
        }
    }
}
