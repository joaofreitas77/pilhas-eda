public class TestePalindromo {
    static void main(String[] args) {
        Pilha<String> pilha = new Pilha<>(10);

        if(pilha.ehPalindromo("arara")){
            System.out.println("É palindromo");
        }else{
            System.out.println("Não é palindromo");
        }

        if (pilha.ehPalindromo("casa")){
            System.out.println("É palindromo");
        }else {
            System.out.println("Não é palindromo");
        }
    }
}
