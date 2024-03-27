public class RedeAleluia {
    public static void main(String[] args) {
        NovoRadio RedeAleluia = new NovoRadio(5.0f);
        RedeAleluia.ligarRadio();
        RedeAleluia.aumentarVolume();
        System.out.println(RedeAleluia.tocar());
        RedeAleluia.aumentarFrequencia(2.0f);
        System.out.println(RedeAleluia.tocar());
        RedeAleluia.desligarRadio();
        System.out.println(RedeAleluia.tocar());
    }
}
