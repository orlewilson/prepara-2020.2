/*
 * Aula do Prepara AV2 
 * Facilitador:	Orlewilson Maia (https://orlewilson.github.io/)
 * Data:		14/11/2020
 * Descrição:	Representação de um modelo para pessoa
 * 				
 */
public abstract class Pessoa {

	// atributos
	private String nome;
	private String endereco;
	private String sexo;
	private String dataNascimento;

	// construtores
	public Pessoa() {
		this.nome = "";
		this.endereco = "";
		this.sexo = "";
		this.dataNascimento = "";
	}

	public Pessoa(String nome, String endereco, String sexo, String dataNascimento) {
		this.nome = nome;
		this.endereco = endereco;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
	}

	// métodos
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setSexo(String sexo) {
		
		sexo = sexo.toLowerCase(); // converte o texto para minúsculo
		
		if (sexo.equals("masculino") || sexo.equals("feminino")) {
			this.sexo = sexo;
		} else {
			System.out.println("Favor informar um valor válido");
		}
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getDataNascimento() {
		return this.dataNascimento;
	}

	public void mostrarInformacoes() {
		System.out.println("Nome: " + getNome());
		System.out.println("Endereço: " + getEndereco());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Data de Nascimento: " + getDataNascimento());
	}
}
