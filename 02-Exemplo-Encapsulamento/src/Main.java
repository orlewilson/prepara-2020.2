/*
 * Aula do Prepara AV2 
 * Facilitador:	Orlewilson Maia (https://orlewilson.github.io/)
 * Data:		14/11/2020
 * Descrição:	Criação de objetos a partir da classe Cachorro 
 * 				(com encapsulamento) 
 */

public class Main {

	public static void main(String[] args) {

		// instanciar um Objetos
		Cachorro toto = new Cachorro();

		// informar valores a cada atributo
		toto.setApelido("Totó");
		toto.setCor("Branco e marron");
		toto.setRaca("Bichon havanês");
		toto.setIdade(5);

		// recuperar valores de cada atributo
		System.out.println("Apelido: " + toto.getApelido());
		System.out.println("Cor: " + toto.getCor());
		System.out.println("Raça: " + toto.getRaca());
		System.out.println("Idade: " + toto.getIdade());

		// chamar os métodos
		toto.latir();
		toto.correr();
	}
}