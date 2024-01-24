import java.util.HashSet;
import java.util.Set;

public class Curso {


    private String nome;

    private int id;

    private Set<Alunos> alunosMatriculados;

    public Curso (int id, String nome){
        this.id = id;
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void matricularAluno(Alunos aluno){
        this.alunosMatriculados  = new HashSet<>();
        alunosMatriculados.add(aluno);
    }

    public Set<Alunos> getAlunosMatriculados(){
        return  this.alunosMatriculados;
    }

    @Override
    public String toString() {
        return "Curso" + nome;
    }
}
