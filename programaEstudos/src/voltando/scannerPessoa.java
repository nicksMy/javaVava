package voltando;

// import java.util.Formatter;
import java.util.Scanner;

public class scannerPessoa 
{

	public static void main(String[] args) 
	{
 		String nome, sobreNome, dataNascimento, altura;
		Scanner entrada = new Scanner(System.in);
		// Formatter formatador = new Formatter();
	
		
		System.out.println("> > Faça sua carteira digital agora < <");
		
		System.out.println("\n>Escreva seu nome: ");
		nome = entrada.nextLine();
		
		System.out.println("\n>Escreva seu sobrenome: ");
		sobreNome = entrada.nextLine();
		
		System.out.println("\n>Escreva sua data de nascimento: ");
		dataNascimento = entrada.nextLine();
		
		System.out.println("\n>Escreva sua altura: ");
		altura = entrada.nextLine();
		
		nome = nome + " " + sobreNome;

		System.out.println("\n> > > > > > > > > > > > > > > SUA CARTEIRA DIGITAL ESTÁ PRONTA PARA USO < < < < < < < < < < < < < < <\n");
		
		System.out.printf("%23s %30s %33s\n", "Nome:", "Data:", "Altura:");
		System.out.printf("%25s %30s %30s", nome, dataNascimento, altura);
		System.out.println();

		System.out.println("\n> > > > > > > > > > > > > > > > > > > > > > > > > | < < < < < < < < < < < < < < < < < < < < < < < < <\n");		
		entrada.close();
	}
}
