package animais;
public class Peixe extends Animal {
    private String corEscama;
    
    public void setCorEscama(String c){
        this.corEscama = c;
    }
    public String getCorEscama(){
        return this.corEscama;
    }
    
    public String soltarBolhas(){
        return "O PEIXE ESTÁ SOLTANDO BOLHAS";
    }

    @Override
    public String locomover() {
        return "Nadando";
    }

    @Override
    public String alimentar() {
        return "Comendo Algas";
    }

    @Override
    public String emitirSom() {
        return "Som De Peixe";
    }
    
    
}
