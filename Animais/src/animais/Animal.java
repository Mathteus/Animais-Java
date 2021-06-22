package animais;
public abstract class Animal {
    private int idade, membros;
    private float peso;
    
    public void setIdade(int i){
        this.idade = i;
    }
    public int getIdade(){
        return this.idade;
    }
    
    public void setMembros(int i){
        this.membros = i;
    }
    public int getMenbros(){
        return this.membros;
    }
    
   public void setPeso(float f){
       this.peso = f;
   }
   public float getPeso(){
       return this.peso;
   }
   
   public abstract String locomover();
   public abstract String alimentar();
   public abstract String emitirSom();
}
