package br.com.alura.teste;

import br.com.alura.Aula;
import br.com.alura.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso(" Mobile","Rafael ");

        javaColecoes.adiciona(new Aula("Disp de Dados", 50));
        javaColecoes.adiciona(new Aula("Teoria da Computacão", 100));
        javaColecoes.adiciona(new Aula("PO", 19));
        javaColecoes.adiciona(new Aula("ADM", 10));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println("\n\ntempo total das aulas: "+ javaColecoes.getTotalTempo() + " minutos");

        System.out.println(javaColecoes);
    }
}
