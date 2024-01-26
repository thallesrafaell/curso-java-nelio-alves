import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Curso a = new Curso(1,"A");
        Curso b = new Curso(2,"B");
        Curso c = new Curso(3,"C");


        a.matricularAluno(new Alunos(1,"Maria", a.getNome()));
        a.matricularAluno(new Alunos(2,"João", a.getNome()));
        a.matricularAluno(new Alunos(3,"Pedro", a.getNome()));

        b.matricularAluno(new Alunos(1,"Maria", b.getNome()));
        b.matricularAluno(new Alunos(2,"João", b.getNome()));


        c.matricularAluno(new Alunos(3,"Pedro", c.getNome()));

        Set<Alunos> d = new HashSet<>(a.alunosMatriculados);
        d.addAll(b.alunosMatriculados);
        d.addAll(c.alunosMatriculados);
        d.removeAll(a.alunosMatriculados);

        System.out.println();

        System.out.println("How many students for course A? " + a.alunosMatriculados.size());
        for(Alunos aluno : a.alunosMatriculados ){
            System.out.println(aluno.toString());
        }

        System.out.println();

        System.out.println("How many students for course B? " + b.alunosMatriculados.size());
        for(Alunos aluno : b.alunosMatriculados ){
            System.out.println(aluno.toString());
        }

        System.out.println();

        System.out.println("How many students for course C? " + c.alunosMatriculados.size());
        for(Alunos aluno : c.alunosMatriculados ){
            System.out.println(aluno.toString());
        }

        System.out.println();

        System.out.println("Alex tem " + d.size() + " alunos matriculados nos seus cursos!");

    }
}
