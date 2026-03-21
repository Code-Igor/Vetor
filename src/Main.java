
public class Main {
    public static void main(String[] args) {
        Vetor v = new Vetor(3);
        v.inserir(10);
        v.inserir(12);
        v.inserir(15);
        int busca = v.buscaBinaria(5);
        int busca2 =v.buscar(10);

        System.out.println(busca);

    }
}