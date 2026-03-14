public class Teste2 {
    static void main(String[] args) {
        Pilha<String> nomes = new Pilha<>(6);

        nomes.empilha("I");
        nomes.empilha("A");
        nomes.empilha("S");
        nomes.empilha("M");
        nomes.empilha("I");
        nomes.empilha("N");

        System.out.println("Antes de inverter: " + nomes);
        nomes.inverte();
        System.out.println("Depois de inverter: " + nomes);
    }
}
