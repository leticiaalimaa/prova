package uber; // Leticia Lima e Igor Galvão

public class Motorista extends Uber{ //Herança
    private String Nome;
    private String Carro;
    
    //encapsulamento 
    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public String getCarro() {
        return Carro;
    }
    public void setCarro(String Carro) {
        this.Carro = Carro;
    }

String Escolha (String aceitar){ // metodo e polimorfismo
    if (aceitar == sim){
        System.out.println("Corrida aceita");
    }else {
        System.out.println("Corrida recusada");
    }

}
    
    
}


