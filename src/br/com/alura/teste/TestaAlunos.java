package br.com.alura.teste;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();

        alunos.add("Rafael");
        alunos.add("Joao");
        alunos.add("Ricardo");
        alunos.add("Gustavo");
        alunos.add("Felipe");
        alunos.add("Francisco");

        System.out.println(alunos);

        final boolean contemRafael = alunos.contains("Rafael");

        System.out.println(contemRafael);
    }
}
