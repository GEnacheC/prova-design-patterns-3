package questao3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Bebida {
    private String nome;
    private String desc;
    private BigDecimal preco;

    public Bebida(
        String nome,
        String desc,
        BigDecimal preco
    ){
        this.nome = nome;
        this.desc = desc;
        this.preco = preco;
    }

    public BigDecimal getPreco() { 
       return this.preco;
    }

    public String getDesc() {
        return this.desc;
    }
}
