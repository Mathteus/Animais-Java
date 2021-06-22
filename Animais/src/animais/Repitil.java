package animais;
public class Repitil extends Animal{
    private String corEscama;
    
    public void setCorEscama(String c){
        this.corEscama = c;
    }
    public String getCorEscama(){
        return this.corEscama;
    }

    @Override
    public String locomover() {
        return "Rastejar";
    }

    @Override
    public String alimentar() {
        return "Comendo Bixos";
    }

    @Override
    public String emitirSom() {
        return "Som De Repitil";
    }
}
