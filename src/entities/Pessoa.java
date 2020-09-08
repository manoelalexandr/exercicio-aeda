package entities;

public class Pessoa {

	private String nome;
	private String cor;
	private int idade;
	private double altura;
	private double peso;
	private char sexo;
	private int tipo;
	private String cpf;
	private String cnpj;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}

	public Pessoa(String nome, String cor, int idade, double altura, double peso, char sexo, String cpf) {
		
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
		this.cpf = cpf;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String identificarTipo (int tipo) {
		if(tipo==1) {
			return "Pessoa fisica : CPF " + this.cpf;
		}
		return "Pessoa Juridica : CNPJ " + this.cnpj;
	}
	
	public String dirigirCarro(int idade) {
		if (idade >= 18) {
			return "Pode Dirigir filha da puta";
		}
		return "vai tirar a catinga de mijo";
	}
	 
}
