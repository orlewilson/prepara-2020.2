/*
 * Aula do Prepara AV2 
 * Facilitador:	Orlewilson Maia (https://orlewilson.github.io/)
 * Data:		14/11/2020
 * Descrição:	Representação de um modelo para professor
 * 				
 */
public class Aluno extends Pessoa {

	// atributos
	private String matricula;
	private String curso;

	// construtores
	public Aluno() {
		// primeira forma
//		setNome("");
//		setEndereco("");
//		setSexo("");
//		setDataNascimento("");
//		this.matricula = "";
//		this.curso = "";

		// segunda forma
//		super();
//		this.matricula = "";
//		this.curso = "";

		// terceira forma
		super("", "", "", "");
		this.matricula = "";
		this.curso = "";
	}

	public Aluno(String nome, String endereco, String sexo, String dataNascimento, String matricula, String curso) {
		// primeira forma
//		setNome(nome);
//		setEndereco(endereco);
//		setSexo(sexo);
//		setDataNascimento(dataNascimento);
//		this.matricula = matricula;
//		this.curso = curso;

		// segunda forma

		// terceira forma
		super(nome, endereco, sexo, dataNascimento);
		this.matricula = matricula;
		this.curso = curso;
	}

	// métodos
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getCurso() {
		return this.curso;
	}

	public void mostrarInformacoes() {
		// primeira forma
//		System.out.println("Nome: " + getNome());
//		System.out.println("Endereço: " + getEndereco());
//		System.out.println("Sexo: " + getSexo());
//		System.out.println("Data de Nascimento: " + getDataNascimento());
//		System.out.println("Matrícula: " + getMatricula());
//		System.out.println("Curso: " + getCurso());

		// segunda forma
		super.mostrarInformacoes();
		System.out.println("Matrícula: " + getMatricula());
		System.out.println("Curso: " + getCurso());
	}
}
