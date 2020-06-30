/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.comparator.exemploaula;

/**
 *
 * @author italo
 */
public class Estudante implements Comparable<Estudante> {
    
    private int idade;
    private String nome;

    public Estudante(String nome, int idade) {
        this.idade = idade;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "Estudante{" + "idade=" + idade + '}';
    }

    @Override
    public int compareTo(Estudante o) {
        return idade - o.idade;
    }
}
