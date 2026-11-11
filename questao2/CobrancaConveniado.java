public class CobrancaConveniado implements Cobranca{
    @Override
    public double aplicar(double valor, int tempo){ 
        if(tempo <= 30) return 0;  
        
        double horas = (tempo/60 < 1 ? tempo/60 + 1 : tempo/60);
        double perc = 30/(double)tempo;
        double val = (valor * horas) - (valor * perc); 

        return val;
    }

    @Override
    public String nome() { return "Conveniado"; }
}
