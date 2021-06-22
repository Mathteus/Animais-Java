package animais;
public class Aves extends Animal {
    private String pena;
    
    public void setPena(String p){
        this.pena = p;
    }
    public String getPena(){
        return this.pena;
    }
    
    public String fazerNinho(){
        return "O PASSARO FEZ UM NINHO";
    }

    @Override
    public String locomover() {
        return "Voando";
    }

    @Override
    public String alimentar() {
        return "Comendo Frutas";
    }

    @Override
    public String emitirSom() {
        return "Som De Passaro";
    }
    
    
}
