package questao1.observer;

import java.util.*;

public class Vendas implements Observer {
    Map<String, String> hist = new HashMap<>();
    
    public void update(String nome, int qtd){
        if (hist.containsKey(nome) && qtd > 0){
            System.out.println("VENDAS: [LOG] - quantidade do produto '" + 
                            nome + "' maior que 0: '" + 
                            qtd + "'.");
        }

        if(qtd <= 0) hist.put(nome, "");
    }
}
