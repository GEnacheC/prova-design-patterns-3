public class Tiquete { // Context
    private final double valor;
    private Cobranca cobranca;
    private String placa;
    private int tempo; //Minutos para ficar facil de calcular sem converter etc...

    public Tiquete(double valor, Cobranca cobranca, String pl, int tp){
        this.valor = valor;
        this.cobranca = cobranca;
        this.placa = pl;
        this.tempo = tp;
    }

    public void setCobranca(Cobranca cobranca){ this.cobranca = cobranca; }
    
    public double total(){ return cobranca.aplicar(valor, tempo); }

    public String formaEscolhida(){ return cobranca.nome(); }

    public String getPlaca() { return this.placa; }
}
