package br.com.alura.teste;

import javafx.beans.binding.MapExpression;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
public class TesteKeySet {
    public static void main(String[] args) {
        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");

        pessoas.keySet().forEach(pessoa -> {
            System.out.println(pessoas.get(pessoa));
        });

        System.out.println("_____________________________________");

        Collection<String> valores = pessoas.values();
        for (String idade : valores) {
            System.out.println(idade);
        }
        System.out.println("_____________________________________");
        Set<Integer> chaves = pessoas.keySet();
        for (Integer idade : chaves) {
            System.out.println(idade);
        }
        System.out.println("_____________________________________");


    }
}
