package voltando;

import java.util.Scanner;

public class scannerPessoa 
{

	public static void main(String[] args) 
	{
		String[] dadosLidos;
 		String nome, sobreNome, dataNascimento, altura;
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("> > Faça sua carteira digital agora < <");
		
		System.out.println("\n>Escreva seu nome: ");
		nome = entrada.nextLine();
		
		System.out.println("\n>Escreva seu sobrenome: ");
		sobreNome = entrada.nextLine();
		
		System.out.println("\n>Escreva sua data de nascimento: ");
		dataNascimento = entrada.nextLine();
		
		System.out.println("\n>Escreva sua altura: ");
		altura = entrada.nextLine();
		
		System.out.println("\n> > Sua carteira digital está ok < <");
		
		System.out.println("I--------------------------------------------------------I");
		System.out.println("I COD: 1123F$#012938UJISK1278SAH2801978&*16763@!#5678901 I");
		System.out.format("I Nome: %s %s\nI Data de nascimento: %s Altura: %s", nome, sobreNome, dataNascimento, altura);
		System.out.println("I--------------------------------------------------------I");
		
	}
}
