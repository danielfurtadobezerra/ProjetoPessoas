package projetopessoa;

public class Aluno extends Pessoa {
//Atributos
    private int matricula;
    private String curso;

//Métodos
    public void cancelarMatr() {

    }
//Métodos especiais

    public int getMatricula() {
	return matricula;
    }

    public void setMatricula(int matricula) {
	this.matricula = matricula;
    }

    public String getCurso() {
	return curso;
    }

    public void setCurso(String curso) {
	this.curso = curso;
    }

}
