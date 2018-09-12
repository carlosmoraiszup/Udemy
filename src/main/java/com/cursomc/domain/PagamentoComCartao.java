package com.cursomc.domain;

import com.cursomc.domain.enums.EstadoPagamento;

import javax.persistence.Entity;

@Entity
public class PagamentoComCartao extends Pagamento {

    private static final long serialVersionUID = 1L;
    private Integer numeroDeParcelas;
    public PagamentoComCartao(){}

    public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroParcelas) {
        super(id, estado, pedido);
        this.numeroDeParcelas = numeroParcelas;
    }

    public Integer getNumeroParcelas() {
        return numeroDeParcelas;
    }

    public void setNumeroParcelas(Integer numeroParcelas)
    {
        this.numeroDeParcelas = numeroParcelas;
    }
}
