import java.util.Locale;

public class Main {
    private static void imprimir(Tiquete c){
        System.out.printf("%-8s | R$ %.2f | PLACA: %-8s%n", c.formaEscolhida(), c.total(), c.getPlaca());
    }
    public static void main(String args[]){
        Tiquete carrinho = new Tiquete(100.00, new CobrancaRotativa(), "TST-1", 60);
        imprimir(carrinho);

        carrinho.setCobranca(new CobrancaConveniado());
        imprimir(carrinho);

        carrinho.setCobranca(new CobrancaMensalista());
        imprimir(carrinho);
    }
}
