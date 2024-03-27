public interface Radio {

    void aumentarFrequencia(float step);
    void diminuirFrequencia(float step);
    void ligarRadio();
    void desligarRadio();
    void aumentarVolume();
    void diminuirVolume();

    String tocar();
}
