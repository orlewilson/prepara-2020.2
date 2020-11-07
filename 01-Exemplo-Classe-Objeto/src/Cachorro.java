/*
 * Aula do Prepara AV2 
 * Facilitador:	Orlewilson Maia (https://orlewilson.github.io/)
 * Data:		14/11/2020
 * Descrição:	Representação de um modelo para cachorro 
 * 				(sem encapsulamento) 
 */

public class Cachorro {

	// atributos
	String apelido;
	String cor;
	String raca;
	int idade;
	
	// métodos
	public void latir() {
		System.out.println("au, au!");
	}
	
	public void correr() {
		System.out.println("correndo para pegar uma bola!");
	}
}
