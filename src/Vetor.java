public class Vetor {

    private Integer[] vetor;
    private int tamanho;
    private int numElementos;

    public Vetor(int tamanho) {
        this.vetor = new Integer[tamanho];
        this.tamanho = tamanho;
        this.numElementos = 0;
    }

    // Insere no final; se cheio, dobra o tamanho do vetor
    public void inserir(int valor) {
        if (numElementos >= tamanho) {

            System.out.println("vetor cheio");

            // cria novo vetor com valor dobrado
            Integer[] novoVetor = new Integer[tamanho*2];

            // copia os valores do antigo vetor
            for (int i = 0; i < numElementos-1; i++) {
                novoVetor[i] = vetor[i];
            }

            // define o vetor como novoVetor
            vetor =  novoVetor;
        }

        vetor[numElementos] = valor;
        numElementos++;
    }


    // Percorre item por item e retorna a posição; -1 se não encontrado
    public int buscar(int valor) {

        for (int i = 0; i < numElementos - 1; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    // Encontra o elemento e realoca os próximos uma posição para trás
    public boolean remover(int valor) {

        int valorIndex = buscar(valor);

        if (valorIndex == -1) {return false;}
        for (int i = valorIndex; i < numElementos-1; i++) {
            vetor[i] = vetor[i+1];
        }

        vetor[numElementos-1] = 0;
        numElementos--;

        return true;
    }

    // Printa elemento por elemento do vetor
    public void exibir() {

        System.out.println("vetor:");
        for (int i = 0; i < numElementos ; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("---");
    }


    // Insere na posição indicada, realocando os próximos; se cheio, dobra o tamanho
    public void inserirNaPosicao(int posicao, int valor) {

        // valor que guardará o valor do valor que o valor
        int novoValor;

        // verificando se o numero da posicao é entre 0 e o ultimo numero do index
        // se for a posicao é válida
        if (posicao < numElementos && posicao >= 0) {

            // insere um valor igual ao valor do ultimo index
            // ssim se ficar cheio a funcao inserir ja resolve
            novoValor = vetor[numElementos-1];
            inserir(novoValor);

            // o i comeca no ultimo index, vai diminuindo e passando pelos elementos
            // quando chegar no index da posicao escolhida ele para

            for (int i = numElementos-1; i > posicao; i--) {

                // o valor do index maior se torna o do index menor
                vetor[i] = vetor[i-1];
            }

            // coloca o valor na posicao escolhida depois de todas as mudanças
            vetor[posicao] = valor;
        }
        else {
            System.out.print( "posição invalida");
        }
    }

    public int getNumElementos() { return numElementos; }

    public int getTamanho() { return tamanho; }
}
