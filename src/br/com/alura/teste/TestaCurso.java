package br.com.alura.teste;

import br.com.alura.Aula;
import br.com.alura.Curso;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Desenvolvimento Mobile","Rafael Souza");

        javaColecoes.adiciona(new Aula("Empredeedorismo", 10));
        javaColecoes.adiciona(new Aula("Banco de Dados", 50));
        javaColecoes.adiciona(new Aula("LFA", 19));
        javaColecoes.adiciona(new Aula("Teoria da Computacão", 100));


        System.out.println(javaColecoes.getAulas());
    }
}
