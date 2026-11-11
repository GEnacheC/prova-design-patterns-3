package questao1.observer;

import java.util.List;
import java.util.ArrayList;

public class Produto implements Subject{
    private String nome;
    private int quantidade = 0;
    private List<Observer> observadores = new ArrayList<>();

    public Produto(String nome, int initQtd) {
        this.nome = nome;
        this.quantidade = initQtd;
    }

    public void setQuantidade(int qtd){
        
        this.quantidade = qtd;
        this.notificar();
    }
    public int getQuantidade(){ return this.quantidade; }
    public String getNome(){ return this.nome; }

    public void notificar(){
        for(Observer o : observadores){
            o.update(this.getNome(), this.getQuantidade());
        }
    }

    public void inscrever(Observer o){
        observadores.add(o);
    }

    public void desinscrever(Observer o){
        observadores.remove(o);
    }
}
