package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente  {

    private String nome, cpf;
    private Date data;
    private Integer idPessoa;
    
    //Passar para a classe dentro do pacote Model e salvar
    public Cliente(String nome,String cpf, Integer idPessoa) {
    	
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa =  idPessoa;
	}

}
