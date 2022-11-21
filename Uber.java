package uber; // Leticia Lima e Igor Galvão

public abstract class Uber { //classe abstrata
    private String Black;
    private String Normal;

    // Getters e Setters
    public String getBlack() {
        return Black;
    }
    public void setBlack(String Black) {
        this.Black = Black;
    }
    public String getNormal() {
        return Normal;
    }
    public void setNormal(String Normal) {
        this.Normal = Normal;
    }

public interface Aplicativo{  //interface
   public abstract CancelarUber(String recusar);
   public abstract PedirUber(String aceitar);

}
}
