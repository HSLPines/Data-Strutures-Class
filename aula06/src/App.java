public class App {
    public static void main(String[] args) throws Exception {
        
        Gerenciador g = new Gerenciador();
        g.inserir(new Produto("sorvete", "alimento", 100));
        g.inserir(new Produto("batata", "alimento", 100));
        g.inserir(new Produto("arroz", "alimento", 100));

        //g.imprimirProdutos();

        //System.out.println(g.buscaLinear("arroz"));
        System.out.println(g.buscaBinaria("arroz"));

    }
}
