package uber; // Leticia Lima e Igor Galvão
 
public class Passageiro extends Uber{ //Herança 
    private String Nome;
    private Int Idade;
    private Int Saldo;


    //encapsulamento       
    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public Int getIdade() {
        return Idade;
    }
    public void setIdade(String Idade) {
        this.Idade = Idade;
    }
    
    public interface Aplicativo{  //interface
        public String CancelarUber(String recusar);
        public String PedirUber(String aceitar);
    }
    public String getSaldo() {
        return Saldo;
    }
    public void setSaldo(String Saldo) {
        this.Saldo = Saldo;
    }

int pagar (double valor) { //Exceptions
    if (valor<0) {
        return 107; //codigo de erro para valor nagativo
    }else {
        this.saldo -=valor;
        return 0;
    }
}
        
}
    

