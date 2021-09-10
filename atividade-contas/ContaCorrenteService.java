package Service;

import Models.ContaCorrente;

public final class ContaCorrenteService implements ContaCorrenteController {

    @Override
    public final void sacarContaCorrente (Integer valor){
        final ContaCorrente conta = buildContaCorrente();
        if(conta.getSaldo() > valor){
            Integer valorSacado = conta.getSaldo() - valor;
            conta.setSaldo(valorSacado);
        }
    }

    @Override
    public final void depositarContaCorrente(Integer valor){
        final ContaCorrente conta = buildContaCorrente();
        Integer valorDepositado = conta.getSaldo() + valor;
        conta.setSaldo(valorDepositado);
    }

    @Override
    public final void setValorLimiteContaCorrente(Integer valor){
        final ContaCorrente conta = buildContaCorrente();
        conta.setValorLimite(valor);
    }

    @Override
    public ContaCorrente buildContaCorrente(){
            ContaCorrente conta = new ContaCorrente();
            conta.setConta(16254);
            conta.setAgencia(9618);
            conta.setLimite(2000);
            conta.setSaldo(8000);
            conta.setValorLimite(6000);
            conta.setTitular("Lucas Costa");

            return conta;
    }

}
