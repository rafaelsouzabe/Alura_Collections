package br.com.alura.teste;

import br.com.alura.Aluno;
import br.com.alura.Aula;
import br.com.alura.Curso;

public class TestaCursoComAluno {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso(" Java OO","Rafael Souza ");

        javaColecoes.adiciona(new Aula("Disp de Dados", 50));
        javaColecoes.adiciona(new Aula("Teoria da Computacão", 100));
        javaColecoes.adiciona(new Aula("PO", 19));
        javaColecoes.adiciona(new Aula("ADM", 10));

        Aluno a1 = new Aluno("Thiago",4213456);
        Aluno a2 = new Aluno("Mauricio",156798);
        Aluno a3 = new Aluno("Thiago",566567);
        Aluno a4 = new Aluno("Joao",567);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println(javaColecoes.getAlunos());

        System.out.println("\n\n______________________________________________");
        System.out.println(javaColecoes.estaMatriculado(a3));
        System.out.println("\n\n______________________________________________");

        Aluno turini = new Aluno("Thiago",4213456);
        System.out.println("E esse Turini, esta matriculado?");
        System.out.println(javaColecoes.estaMatriculado(turini));
        System.out.println("______________________________________________");
        System.out.println("O a1 é equals ao Turini?");
        System.out.println(a1.equals(turini));

    }
}
