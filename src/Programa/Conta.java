package Programa;

import javax.swing.JOptionPane;

import Utilitarios.Utils;

public class Conta {
	
	private static int contadorDeContas = 1;
	
	private int numeroConta;
	private Pessoa pessoa;
	private Double saldo = 0.0;
	
	public Conta(Pessoa pessoa) {
		this.numeroConta = contadorDeContas;
		this.pessoa = pessoa;
		contadorDeContas += 1;
	}
	
	//getters e setters
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
	public String toString() {
		return "\nNome: " + this.pessoa.getNome() +
				"\nEmail: " + this.pessoa.getEmail() +
				"\nN�mero da conta: " + this.getNumeroConta() +
				"\nCpf: " + this.pessoa.getCpf() +
				"\nSaldo: " + Utils.doubleToString(this.getSaldo()) +
				"\n";
	}
	
	public void depositar (Double valor) {
		if (valor > 0) {
			setSaldo(getSaldo() + valor);
			JOptionPane.showMessageDialog(null, "Seu dep�sito foi realizado com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "N�o � poss�vel realizar seu dep�sito.");
		}
	}
	
	public void sacar (Double valor) {
		if (valor > 0 &&  this.getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "N�o foi poss�vel realizar o saque.");
		}
	}
	
	public void transferir (Conta contaParaDeposito, Double valor) {
		if(valor > 0 && this.getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
			
			JOptionPane.showMessageDialog(null, "Transfer�ncia realizada com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "N�o foi poss�vel realizar a transfer�ncia.");
		}
	}
	
}
