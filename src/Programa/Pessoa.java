package Programa;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private String email;
	//contador
	private static int counter = 1;

	//getters e setters
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//construtor 
	public Pessoa(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		counter += 1;
	}
	
	public String toString() {
		return "\nNome: " + this.getNome() +
				"\nCpf: " + this.getCpf() +
				"\nEmail: " + this.getEmail();
	}
	
	public Pessoa () {}
	
}
