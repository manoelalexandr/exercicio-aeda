package exercicio_Aeda;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Informe 1-Pessoa Fisica/ 2-Pessoa Juridica");
		int tipo = sc.nextInt();
	
		if(tipo==1) {
			System.out.println("Informe seu nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("Informe seu CPF: ");
			String cpf = sc.nextLine();
			
			System.out.println("Informe sua cor: ");
			String cor = sc.nextLine();
			
			System.out.println("Informe sua idade: ");
			int idade = sc.nextInt();
			
			System.out.println("Informe sua altura: ");
			double altura = sc.nextDouble();
			
			System.out.println("Informe seu peso: ");
			double peso = sc.nextDouble();
			
			System.out.println("Informe seu sexo");
			char sexo = sc.next().charAt(0);
			
			Pessoa pessoa = new Pessoa(nome, cor, idade , altura, peso, sexo, cpf);
			
			System.out.println(pessoa.identificarTipo(tipo)); 
			
			System.out.println(pessoa.dirigirCarro(idade));	
		}
		
		else {
			System.out.println("Informe o nome da empresa: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("Informe o CNPJ da empresa: ");
			String cnpj = sc.nextLine();
			
			Pessoa pessoa = new Pessoa(nome, cnpj);
			
			System.out.println(pessoa.identificarTipo(tipo));
			
			
		}
		
		sc.close();
	}

}
