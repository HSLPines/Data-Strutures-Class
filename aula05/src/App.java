
public class App{

    public static void main(String[] args) throws Exception {

        Venda [] venda = new Venda[4];
        venda[0] = new Venda("Selmini", 1000);
        venda[1] = new Venda("Flavio", 2000);
        venda[2] = new Venda("Sandra", 5000);
        venda[3] = new Venda("Rafa", 10000);

        for (Venda v : venda) {
            System.out.println(v.getNome() + " vendeu R$ " + v.getValor());
        }
    
    }

}