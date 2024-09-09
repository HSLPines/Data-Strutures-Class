
/*programa para ler um valor interiro e imprimir sua tabuada*/

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int numero;

        System.out.println("Digite um valor inteiro: ");
        numero = in.nextInt();
        
        tabuada(numero);
        in.close();
    }

    public static void tabuada(int numero) {
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);
        }
    }

}
