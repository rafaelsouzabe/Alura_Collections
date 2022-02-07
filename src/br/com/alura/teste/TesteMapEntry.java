package br.com.alura.teste;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesteMapEntry {
    public static void main(String[] args) {

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);

        System.out.println("Para acessar as chaves devemos executar:");
        Set<String> chaves = nomesParaIdade.keySet();
        for (String chave: chaves
             ) {
            System.out.println(chave);
        }
        System.out.println("_____________________________________");

        System.out.println("E para pegar os valores usamos:");
        Collection<Integer> valores = nomesParaIdade.values();
        for (Integer valor: valores
             ) {
            System.out.println(valor);
        }
        System.out.println("_____________________________________");

        System.out.println("A terceira coleção que devolve a associação de key e value eh a Entry: ");
        Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
        for (Entry<String, Integer> associacao : associacoes) {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }

    }
}
