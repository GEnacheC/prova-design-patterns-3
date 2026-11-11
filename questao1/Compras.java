package questao1.observer;

public class Compras implements Observer{

    public void update(String nome, int qtd){
        if(qtd < 5) System.out.println("COMPRAS: [LOG] - quantidade do produto '" + 
                            nome + "' menor que 5: '" + 
                            qtd + "'.");
        
    }
}
