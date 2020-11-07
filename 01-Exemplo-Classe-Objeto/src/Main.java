/*
 * Aula do Prepara AV2 
 * Facilitador:	Orlewilson Maia (https://orlewilson.github.io/)
 * Data:		14/11/2020
 * Descri��o:	Cria��o de objetos a partir da classe Cachorro 
 * 				(sem encapsulamento) 
 */

public class Main {
	
	public static void main(String[] args) {
		
		// instanciar um Objetos
		Cachorro toto = new Cachorro();

		// informar valores a cada atributo
		toto.apelido = "Tot�";
		toto.cor = "Branco e marron";
		toto.raca = "Bichon havan�s";
		toto.idade = 5;

		// recuperar valores de cada atributo
		System.out.println("Apelido: " + toto.apelido);
		System.out.println("Cor: " + toto.cor);
		System.out.println("Ra�a: " + toto.raca);
		System.out.println("Idade: " + toto.idade);
		
		// chamar os m�todos
		toto.latir();
		toto.correr();
	}
}