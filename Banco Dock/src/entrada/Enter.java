package entrada;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import exceção.SaldoInsuficienteException;
import modelo.Cliente;
import modelo.Conta;
import operações.ContaCorrente;

public class Enter {

	private  String nome, cpf, data;
    private SimpleDateFormat d1 = new SimpleDateFormat("DD/MM/YYYY");
    private Integer idPessoa = 0, idAgencia = 0, op, ag; 
    private Double valor;
    private Conta c1;
    Scanner ler = new Scanner(System.in);
    
	 public Enter() throws SaldoInsuficienteException {	    
	    System.out.println("Criação de conta bancaria");
	    System.out.println("Porfavor entre com seu nome");
		nome = ler.next();
		System.out.println("Agora digite seu cpf...OBS Usando os traços");
		cpf = ler.next();
		System.out.println("Agora digite sua Data de nascimento - DD/MM/YYYY");
		data = ler.next();
		System.out.println("Criando Conta...");
		
		if(nome == null && cpf == null) {
			System.out.println("Porfavor digite seus dados");
		}else {
			System.out.println("Pofavor anote seus dados bancários");
			createConta();
		}
	}
	
	public void createConta() throws SaldoInsuficienteException {
		for(int i = 0; i<= 10; i++) {
			idPessoa = 2 + (i * 3);
			idAgencia = 2 * (i * 5);
		}
		Cliente cn = new Cliente(nome, cpf, idPessoa);//falta a data e já salvar no bd
		c1 = new ContaCorrente(idAgencia, idPessoa);
		
	}
	
	public void consulta() throws SaldoInsuficienteException, InterruptedException {
		System.out.println("Digite Agencia: ");
		 this.ag = ler.nextInt();
		if(ag != ag) { //var do bd
			System.out.println("Agencia inexistente!");
			consulta();
		}else {
			operacao();
		}
	}
	
	public void operacao() throws SaldoInsuficienteException, InterruptedException {
		
		System.out.println("Escolha a opção bancaria: ");
		System.out.println("1- Deposito 2- Saque 3- Saldo 4- Bloqueio");
		op =  ler.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("Digite o valor: ");
			valor = ler.nextDouble();
			c1.deposita(valor);
			break;
		case 2:
			System.out.println("Digite o valor pra sacar: ");
			valor = ler.nextDouble();
			c1.saca(valor);
			break;
		case 3: 
			System.out.println("Vizualizar saldo: ");
			double Cc1 = c1.getSaldo();
			System.out.println("Saldo: " + Cc1);
			break;
		case 4:
			ag.wait();
			break;
		} 
		
			
	}

}
