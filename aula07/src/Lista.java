
public class Lista{

    No inicio;
    No fim;
    int total;

    
    // método para inseririr um nó no final da lista
    public void inserirFim(String nome){
        No novo = new No(nome);
        if(total == 0){
            inicio = novo;
        }else{
            fim.prox = novo;
        }
        fim = novo;
        total++;
    }

    // método para inseririr um nó no inicio da lista

   

    //método para imprimir os dados armazenados na lista
    public void imprimir(){
        No aux = inicio;
        while(aux != null){
            System.out.println(aux.nome);
            aux = aux.prox;
        }
    }

}
