package projetopessoa;

public class ProjetoPessoas {

    public static void main(String[] args) {
	// Projeto principal

	Pessoa p1 = new Pessoa();
	Aluno p2 = new Aluno();
	Professor p3 = new Professor();
	Funcionario p4 = new Funcionario();

	p1.setNome("Daniel");
	p2.setNome("Maria");
	p3.setNome("Cláudio");
	p4.setNome("Fabiana");

	p1.setIdade(27);
	p2.setIdade(23);
	p3.setIdade(50);
	p4.setIdade(33);

	p1.setSexo("M");
	p2.setSexo("F");
	p3.setSexo("M");
	p4.setSexo("F");

	p2.setCurso("Informática");
	p3.setSalario(5245);

	System.out.println("==========================================");
	System.out.println(p1.toString());
	System.out.println(p2.toString());
	System.out.println(p3.toString());
	System.out.println(p4.toString());

    }

}
