import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//interface é semelhante a uma classe abstrata, mas não pode ter métodos concretos

public class Gerenciador {

    private List<Produto> lista = new LinkedList<>();

    //método para adicionar um produto
    public void inserir(Produto produto) {
        lista.add(produto);
    }

    //metodo para imprimir os proutos em ordem alfabética
    public void imprimirProdutos() {

        Collections.sort(lista);
        lista.forEach(produto -> {
            System.out.println(produto.getNome());
        });
    }

    //método para buscar um produto pelo nome por busca linear
    public Produto buscaLinear(String nome) {
        for (Produto produtoNome : lista) {
            if (produtoNome.getNome().equalsIgnoreCase(nome)) {
                return produtoNome;
            }
        }
        return null;
    }

    //metodo para buscar um produto pelo nome por busca binária
    public Produto buscaBinaria(String nome) {
        int inicio = 0;
        int fim = lista.size() - 1;
        int meio;
        Produto produto;
        Collections.sort(lista);

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            produto = lista.get(meio);
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            } if (produto.getNome().compareTo(nome) < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return null;
    }
    
}
