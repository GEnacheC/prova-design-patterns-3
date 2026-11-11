package questao3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Pedido implements Prototype<Pedido>{
    private static long proximoId = 1;
    private long id;
    private String nome;
    private Bebida bebida;
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido(
        Bebida beb
    ){
        this.id = proximoId++;
        this.bebida = beb;
    }

    public long getId() { return this.id;}

    public List<ItemPedido> getItens() { return itens; }

    public BigDecimal getPreco() { 
        BigDecimal total = BigDecimal.ZERO;
        for(ItemPedido item : itens){
            total = total.add(item.subtotal());
        }
        
        return total.setScale(2, RoundingMode.HALF_UP).add(this.bebida.getPreco());
    }

    public String getDesc() {
        return bebida.getDesc() + " complementos: " + itens.toString();
    }

    @Override
    public Pedido clonar(){
        Pedido copia = new Pedido(this.bebida);
        for(ItemPedido item : this.itens){
            copia.itens.add(new ItemPedido(item));
        }

        return copia;
    }

    public void adicionar(ItemPedido item){
        itens.add(item);
    }
}
