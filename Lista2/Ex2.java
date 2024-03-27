public class Ex2 {
    public static String baseBinaria(int n) {
       
        if (n == 0) {
            return "";
        }
        
        return baseBinaria(n / 2) + (n % 2);
    }
    
    public static void main(String[] args) {

        System.out.println("Resultado retornado: " + baseBinaria(12));
        System.out.println();
        
        
    }
}
