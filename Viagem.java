package uber; // Leticia Lima e Igor Galvão

public class Viagem extends Uber{ //Herança
    private String Origem;
    private Int Destino;
    
    //encapsulamento

    public String getOrigem() {
        return Origem;
    }
    public void setOrigem(String Origem) {
        this.Origem = Origem;
    }
    public Int getDestino() {
        return Destino;
    }
    public void setDestino(String Destino) {
        this.Destino = Destino;
    }
    
}
