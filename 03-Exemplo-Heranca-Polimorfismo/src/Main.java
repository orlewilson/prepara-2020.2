/*
 * Aula do Prepara AV2 
 * Facilitador:	Orlewilson Maia (https://orlewilson.github.io/)
 * Data:		14/11/2020
 * Descri��o:	Cria��o de objetos a partir das classes Professor e Aluno
 */

public class Main {

	public static void main(String[] args) {

		// instanciar um Objetos
		Professor joao = new Professor();

		// informar valores a cada atributo
		joao.setNome("Jo�o da Silva");
		joao.setEndereco("Rua Padre Anchieta");
		joao.setSalario(1200.0);
		joao.setSexo("Masculino");
		joao.setDataNascimento("05/05/1982");
		joao.setDisciplinas("POO, Algoritmos");
		joao.mostrarInformacoes();

		Aluno maria = new Aluno("Maria Joana", "Rua Bel�m", "Feminino", "14/11/2000", "2365400",
				"Tecnologia da Informa��o");
		System.out.println("\n\n-----");
		maria.mostrarInformacoes();
	}
}