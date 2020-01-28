package modelo;

import exceção.SaldoInsuficienteException;
import operações.ContaCorrente;

public abstract class Conta {

	protected double saldo;
	private double valor;
	private Integer idPessoa, idAgencia;

	public Conta(int idAgencia, int idPessoa) {
		this.idAgencia = idAgencia;
		this.idPessoa = idPessoa;
	}
	
	public void saca(double valor) throws SaldoInsuficienteException{
    	
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        } 
        
        this.saldo -= valor;       
    }
	
	public abstract void deposita(double valor);
	
	public abstract double getSaldo();
	
	
}
