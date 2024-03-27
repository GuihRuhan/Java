public class Ex1 {
    public static boolean isNumero(String str) {
       
        if (str.isEmpty()) {
            return true;
        }
        
        char caracter1 = str.charAt(0);
        if (caracter1 >= '0' && caracter1 <= '9') {
            
            return isNumero(str.substring(1));
        } else {
         
            return false;
        }
    }
    
    public static void main(String[] args) {
        String teste1 = "1234567890";
        String teste2 = "abc123";
        
        System.out.println(teste1 + " é número? " + isNumero(teste1));
        System.out.println(teste2 + " é número? " + isNumero(teste2));
    }
}
