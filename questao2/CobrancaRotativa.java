public class CobrancaRotativa implements Cobranca{
    @Override
    public double aplicar(double valor, int tempo){ return valor * (tempo/60 < 1 ? tempo/60 + 1 : tempo/60); }

    @Override
    public String nome() { return "Rotativo"; }
}
