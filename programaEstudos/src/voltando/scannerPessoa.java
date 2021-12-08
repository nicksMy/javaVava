package voltando;

import java.util.Formatter;
import java.util.Scanner;

public class scannerPessoa 
{

	public static void main(String[] args) 
	{
 		String nome, sobreNome, dataNascimento, altura;
		Formatter formatador = new Formatter();
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
		
		System.out.println("\n> > > > > SUA CARTEIRA DIGITAL ESTÁ PRONTA PARA USO < < < < <\n");
		
		formatador.format("|%s %20s %20s|\n", "Nome:", "Data:", "Altura:");
		formatador.format("|%s %s %20s %20s|", nome, sobreNome, dataNascimento, altura);
		System.out.println(formatador);
		
		entrada.close();
	}
}
