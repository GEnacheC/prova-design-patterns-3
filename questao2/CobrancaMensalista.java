public class CobrancaMensalista implements Cobranca{
    @Override
    public double aplicar(double valor, int tempo){ return valor; }

    @Override
    public String nome(){ return "Mensalista"; }
}
