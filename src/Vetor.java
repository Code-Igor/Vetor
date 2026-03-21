public class Vetor {

    private final int[] vetor;
    private final int tamanho;
    private int numElementos;

    public Vetor(int tamanho){
        this.vetor = new int[tamanho];
        this.tamanho = tamanho;
        this.numElementos = 0;
    }

    public boolean inserir(int valor) {
        if (numElementos >= tamanho) {
            System.out.println("Vetor cheio!");
            return false;
        }

        vetor[numElementos] = valor;
        numElementos++;

        return true;
    }

    public int buscar(int valor) {

        for (int i = 0; i < numElementos - 1; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public int buscaBinaria(int valor) {

        int inicio = 0, fim = numElementos, chute = (fim-inicio)/2;

        while (inicio < fim) {
            if (vetor[chute] == valor) {
                return chute;
            }
            if (vetor[chute] < valor) {
                inicio = chute;
                chute = (fim+inicio)/2;
            } else {
                fim = chute;
                chute = (fim-inicio)/2;
            }
        }

        return -1;
    }

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

    public int getNumElementos() {
        return numElementos;
    }
}