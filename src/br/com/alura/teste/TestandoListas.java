package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {

        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com cursos e Sets";
        String aula4 = "listas";

        ArrayList<String> aulas = new ArrayList<>();

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        aulas.add(aula4);

        System.out.println(aulas);

        aulas.remove(3);

        for (String a:aulas) {
            System.out.println("Aula: " + a);
        }

        String primeiraAula = aulas.get(0);

        aulas.forEach(aula -> {
            System.out.println("Percorrendo: " + aula);
        });
        aulas.add("Aumentando as aulas");
        Collections.sort(aulas);
        System.out.println(aulas);

    }
}
