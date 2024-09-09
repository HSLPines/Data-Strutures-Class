
public class Produto implements Comparable <Produto>{


    private String nome;
    private String categoria;
    private int qntEstoque;

    public Produto(String nome, String categoria, int qntEstoque) {
        this.nome = nome;
        this.categoria = categoria;
        this.qntEstoque = qntEstoque;
    }

    @Override
    public String toString() {
        return nome + " - " + categoria + " - " + qntEstoque;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getQntEstoque() {
        return qntEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setQntEstoque(int qntEstoque) {
        this.qntEstoque = qntEstoque;
    }

    @Override
    public int compareTo(Produto produto) {
        return nome.compareTo(produto.nome);
    }

}
