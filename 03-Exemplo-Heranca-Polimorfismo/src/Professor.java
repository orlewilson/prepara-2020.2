/*
 * Aula do Prepara AV2 
 * Facilitador:	Orlewilson Maia (https://orlewilson.github.io/)
 * Data:		14/11/2020
 * Descrição:	Representação de um modelo para professor
 * 				
 */
public class Professor extends Pessoa {

	// atributos
	private double salario;
	private String disciplinas;

	// construtores
	public Professor() {
		// primeira forma
//		setNome("");
//		setEndereco("");
//		setSexo("");
//		setDataNascimento("");
//		this.salario = 0.0;
//		this.disciplinas = "";

		// segunda forma
//		super();
//		this.salario = 0.0;
//		this.disciplinas = "";

		// terceira forma
		super("", "", "", "");
		this.salario = 0.0;
		this.disciplinas = "";
	}

	public Professor(String nome, String endereco, String sexo, String dataNascimento, double salario,
			String disciplinas) {
		// primeira forma
//		setNome(nome);
//		setEndereco(endereco);
//		setSexo(sexo);
//		setDataNascimento(dataNascimento);
//		this.salario = salario;
//		this.disciplinas = disciplinas;

		// segunda forma

		// terceira forma
		super(nome, endereco, sexo, dataNascimento);
		this.salario = salario;
		this.disciplinas = disciplinas;
	}

	// métodos
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setDisciplinas(String disciplinas) {
		this.disciplinas = disciplinas;
	}

	public String getDisciplinas() {
		return this.disciplinas;
	}

	public void mostrarInformacoes() {
		// primeira forma
//		System.out.println("Nome: " + getNome());
//		System.out.println("Endereço: " + getEndereco());
//		System.out.println("Sexo: " + getSexo());
//		System.out.println("Data de Nascimento: " + getDataNascimento());
//		System.out.println("Salário: " + getSalario());
//		System.out.println("Disciplinas: " + getDisciplinas());
		
		// segunda forma
		super.mostrarInformacoes();
		System.out.println("Salário: " + getSalario());
		System.out.println("Disciplinas: " + getDisciplinas());
		
	}
}
