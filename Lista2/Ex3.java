public class Ex3 {
    public static void imprimeSeqCollatz(int numero) {
        if (numero <= 0) {
            System.out.println(" Tente novamente.");
            return;
        }

        System.out.print(numero + ", ");
        
        if (numero == 1) {
            return;
        }
    
        if (numero % 2 == 0) {
            imprimeSeqCollatz(numero / 2);
        } else {
            imprimeSeqCollatz(3 * numero + 1);
        }
    }
    public static void main(String[] args) {
        imprimeSeqCollatz(6);
        System.out.println();
        
        
    }
}
