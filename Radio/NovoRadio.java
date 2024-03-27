public class NovoRadio {
    private float frequencia = 76.0f;
    private int volume = 0;
    private boolean estaLigado = false;
    public NovoRadio(float frequencia){
        this.frequencia = frequencia;
    }
    public void aumentarFrequencia(float step) {
        if (this.estaLigado)
            if(this.frequencia>76.0 && this.frequencia<108.0)
                this.frequencia = this.frequencia + step;
    }
    public void diminuirFrequencia(float step) {
        if (this.estaLigado)
            if(this.frequencia>76.0 && this.frequencia<108.0)
                this.frequencia = this.frequencia - step;
    }
    public void ligarRadio(){
        this.estaLigado = true;
    }
    public void desligarRadio(){
        this.estaLigado = false;
    }
    public void aumentarVolume(){
        if(this.estaLigado)
            if(this.volume >=0 && this.volume<10) //O volume precisa ser maior que 0 e menor que 10
                this.volume =+1;
    } 
    public void diminuirVolume(){
        if(this.estaLigado)
            if(this.volume >=0 && this.volume<10)
                this.volume =-1;
    }
    public String tocar(){
        if(this.estaLigado)
            return ("Radio FM" + this.frequencia + "MHz... tocando só música boa!");
        else
            return ("Radio FM" + this.frequencia + "MHz... desligada");
    }
         
}