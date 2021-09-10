package Service;

import Models.ContaCorrente;

public interface ContaCorrenteController {

    public  void  sacarContaCorrente (Integer valor);

    public  void depositarContaCorrente(Integer valor);

    public  void setValorLimiteContaCorrente(Integer valor);

    public ContaCorrente buildContaCorrente();
}
