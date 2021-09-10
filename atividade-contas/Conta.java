package Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conta {

    private Integer agencia;

    private Integer conta;

    private String titular;

    private Integer limite;

    private Integer saldo;

    private Integer valorLimite;

}
