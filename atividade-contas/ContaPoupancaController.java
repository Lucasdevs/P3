package Service;


import Models.ContaPoupanca;

public interface ContaPoupancaController {

    public  void  sacarContaPoupanca (Integer valor);

    public  void depositarContaPoupanca(Integer valor);

    public  void setValorLimiteContaPoupanca(Integer valor);

    public ContaPoupanca buildContaPoupanca();
}
