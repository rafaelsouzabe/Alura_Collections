package br.com.alura;

import java.util.*;

public class Curso {

    private int totalTempo;
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaAluno = new HashMap<>();


    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public String getInstrutor() {
        return instrutor;
    }

    public int getTotalTempo() {
        return totalTempo;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }



    public void adiciona(Aula aula){
        this.aulas.add(aula);
        totalTempo += aula.getTempo();
    }
    
//    public int getTempoTotal(){
//        int tempototal = 0;
//        for (Aula aula: aulas) {
//            tempototal += aula.getTempo();
//        }
//        return tempototal;
//    }

    @Override
    public String toString() {
        return "Curso: " +  nome + ", Tempo total: "+ getTotalTempo() + '\'' +
                ", instrutor='" + instrutor + '\'' +
                ", aulas=" + aulas +
                '}';
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaAluno.put(aluno.getNumeroMatricula(),aluno);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatriculado(int numeroMatricula) {
        return matriculaAluno.get(numeroMatricula);
    }
}
