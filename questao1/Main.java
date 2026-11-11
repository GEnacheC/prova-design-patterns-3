package questao1.observer;

public class Main {
    public static void main(String[] args){
        Produto p = new Produto("Teste 1", 10);

        Auditoria auditoria = new Auditoria();
        Compras compras = new Compras();
        Vendas vendas = new Vendas();

        p.inscrever(auditoria);
        p.inscrever(compras);
        p.inscrever(vendas);

        p.setQuantidade(0);

        p.setQuantidade(5);
    }
}
