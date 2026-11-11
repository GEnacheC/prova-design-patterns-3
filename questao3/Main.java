package questao3;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Main {
    private static void imprimir(Pedido p) {
        System.out.printf("Pedido #%d | Descrição: %s | total=R$ %.2f%n",
            p.getId(), p.getDesc(), p.getPreco()
        );
    }

    public static void main(String[] args){

        Bebida a = new Bebida("Café", "Bebida quente para deixar acordado.", new BigDecimal("20.00"));
        Bebida b = new Bebida("Expresso", "Bebida para lhe acompanhar de manhã.", new BigDecimal("30.00"));

        // criando itens do pedido
        ItemPedido cafe = new ItemPedido(
            "Chocolate 500g", 10, new BigDecimal("18.90")
        );
        
        ItemPedido acucar = new ItemPedido(
            "Açúcar 1kg", 20, new BigDecimal("4.50")
        );
        
        ItemPedido filtroDePapel = new ItemPedido(
            "Filtro de papel", 5, new BigDecimal("7.20")
        );
        

        ItemPedido leche = new ItemPedido(
            "Leite desnatado", 10, new BigDecimal("18.90")
        );
        
        ItemPedido bombom = new ItemPedido(
            "Bomobom", 20, new BigDecimal("4.50")
        );
        
        ItemPedido girassol = new ItemPedido(
            "Semente girassol", 5, new BigDecimal("7.20")
        );

        // adicionando o pedido
        Pedido pedidoModelo = new Pedido(a);
        pedidoModelo.adicionar(cafe);
        pedidoModelo.adicionar(acucar);
        pedidoModelo.adicionar(filtroDePapel);


        Pedido pedidoModeloB = new Pedido(b);
        pedidoModeloB.adicionar(leche);
        pedidoModeloB.adicionar(bombom);
        pedidoModeloB.adicionar(girassol);
        
        // adicionando o pedido no catalogo de pedidos
        CatalogoDePedidos catalogoDePedidos = new CatalogoDePedidos();
        catalogoDePedidos.registrar("Cafe-Mucho-Loco", pedidoModelo);

        catalogoDePedidos.registrar("Expresso-Mucho-Loco", pedidoModeloB);

        // pedidoA
        Pedido pedidoA = catalogoDePedidos.criar("Cafe-Mucho-Loco");

        // pedidoB
        Pedido pedidoB = catalogoDePedidos.criar("Expresso-Mucho-Loco");
        pedidoB.getItens().get(0).setQuantidade(20);
        
        // pedidoC
        Pedido pedidoC = catalogoDePedidos.criar("Cafe-Mucho-Loco");
        pedidoC.adicionar(new ItemPedido("Adoçante 100ml", 12, new BigDecimal("6.00")));
    
        imprimir(pedidoA);
        imprimir(pedidoB);
        imprimir(pedidoC);

    }
}
