package animais;
public class Mamifero extends Animal{
    
    private String corPelo;
    
    public void setCorPelo(String c){
        this.corPelo = c;
    }
    public String getCorPelo(){
        return this.corPelo;
    }
    
    
    @Override
    public String locomover() {
        return "Correndo";
    }

    @Override
    public String alimentar() {
        return "Comendo Carne";
    }

    @Override
    public String emitirSom() {
        return "Som De Mamifero";
    }
    
}
