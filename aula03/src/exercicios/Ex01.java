//código para fazer a lenda de flavius josephus

package exercicios;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n, k;
        System.out.println("Digite o número de soldados: ");
        n = sc.nextInt();
        System.out.println("Digite o número de saltos: ");
        k = sc.nextInt();
        sc.close();
    }

    for (int i = 0; i < n; i++) {
        System.out.println("Soldado " + i);
    }

}
