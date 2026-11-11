package questao1.observer;

public class Auditoria implements Observer{
    
    public void update(String nome, int qtd){
        System.out.println("AUDITORIA: [LOG] - quantidade do produto '" + nome + "' alterado para '" + qtd + "'.");
    }
}
