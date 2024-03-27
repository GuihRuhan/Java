public class RadioGaga {
    public static void main(String[] args) {
        NovoRadio educativa = new NovoRadio(101.9f);
        educativa.ligarRadio();
        educativa.aumentarVolume();
        System.out.println(educativa.tocar());
        educativa.aumentarFrequencia(1.0f);
        System.out.println(educativa.tocar());
        educativa.desligarRadio();
        System.out.println(educativa.tocar());
    }
}
