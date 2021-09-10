package Service;

import Models.ContaPoupanca;

public final class ContaPoupancaService implements ContaPoupancaController {

    @Override
    public final void sacarContaPoupanca (Integer valor){
        final ContaPoupanca conta = buildContaPoupanca();
        if(conta.getSaldo() > valor){
            Integer valorSacado = conta.getSaldo() - valor;
            conta.setSaldo(valorSacado);
        }
    }

    @Override
    public final void depositarContaPoupanca(Integer valor){
        final ContaPoupanca conta = buildContaPoupanca();
        Integer valorDepositado = conta.getSaldo() + valor;
        conta.setSaldo(valorDepositado);
    }

    @Override
    public final void setValorLimiteContaPoupanca(Integer valor){
        final ContaPoupanca conta = buildContaPoupanca();
        conta.setValorLimite(valor);
    }

    @Override
    public ContaPoupanca buildContaPoupanca(){
        final ContaPoupanca conta = new ContaPoupanca();
        conta.setConta(16254);
        conta.setAgencia(9618);
        conta.setLimite(2000);
        conta.setSaldo(8000);
        conta.setValorLimite(6000);
        conta.setTitular("Lucas Costa");

        return conta;
    }

}
