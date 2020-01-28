package operações;

import exceção.SaldoInsuficienteException;
import modelo.Conta;

public class ContaCorrente extends Conta{

	public ContaCorrente(int idAgencia, int idPessoa) {
		super(idAgencia, idPessoa);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
        super.saldo += valor;//aqui devo mandar pro COnta
    }

	@Override
	public double getSaldo() {
		return super.saldo; //eu n seionde bota bd
	}
	
}
