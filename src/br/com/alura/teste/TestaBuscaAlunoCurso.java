package br.com.alura.teste;

import br.com.alura.Aluno;
import br.com.alura.Aula;
import br.com.alura.Curso;

public class TestaBuscaAlunoCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso(" Java OO", "Claudia Souza ");

        javaColecoes.adiciona(new Aula("Dados", 50));
        javaColecoes.adiciona(new Aula("TeoriaComputacão", 100));
        javaColecoes.adiciona(new Aula("POO", 19));
        javaColecoes.adiciona(new Aula("ADMM", 10));

        Aluno a1 = new Aluno("joao", 4213456);
        Aluno a2 = new Aluno("Mauricio", 566567);
        Aluno a3 = new Aluno("Thiago", 566567);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Quem eh o aluno com matricula 566567?");
        Aluno aluno = javaColecoes.buscaMatriculado(566567);
        System.out.println(aluno);
    }
}
