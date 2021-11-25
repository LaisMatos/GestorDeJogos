package br.senai.sp.jandira.jogo;

import br.senai.sp.jandira.fabricante.Fabricante;

public class Jogo {

	//atributos 
	private String titulo;
	private Fabricante fabricante;
	private boolean zerado;
	private Console console;
	private double preco;
	private String observacao;
	
	//metodos
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public boolean isZerado() {
		return zerado;
	}
	public void setZerado(boolean zerado) {
		this.zerado = zerado;
	}
	public Console getConsole() {
		return console;
	}
	public void setConsole(Console console) {
		this.console = console;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
		
	
}
