/*
 * Aula do Prepara AV2 
 * Facilitador:	Orlewilson Maia (https://orlewilson.github.io/)
 * Data:		14/11/2020
 * Descrição:	Representação de um modelo para cachorro 
 * 				(com encapsulamento) 
 */

public class Cachorro {

	// atributos
	private String apelido;
	private String cor;
	private String raca;
	private int idade;

	// métodos para garantir o encapsulamento
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getApelido() {
		return this.apelido;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return this.cor;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getRaca() {
		return this.raca;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return this.idade;
	}

	// métodos
	public void latir() {
		System.out.println("au, au!");
	}

	public void correr() {
		System.out.println("correndo para pegar uma bola!");
	}
}
