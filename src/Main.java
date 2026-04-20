
public class Main {
    public static void main(String[] args) {
        
        // testando vetor
        Vetor vetor = new Vetor(3);

        // inserindo os valores
        vetor.inserir(10);
        vetor.inserir(20);
        vetor.inserir(30);
        vetor.exibir();

        // testando busca
        System.out.println("Index da busca:" + vetor.buscar(10));

        // removendo
        vetor.remover(10);
        vetor.exibir();

        // inserindo numa posicao escolhifa
        vetor.inserirNaPosicao(1, 50);
        vetor.exibir();

    }
}