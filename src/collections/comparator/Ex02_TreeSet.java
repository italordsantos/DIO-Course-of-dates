/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.comparator;

import collections.comparator.exemploaula.Estudante;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author italo
 */
public class Ex02_TreeSet {
    
    /**
     * Crie uma lista de um objeto complexo com as seguintes operações:
     *      Adicione elementos nesta lsita
     *      Ordene implementando a interface java.util.Compataror no seu objeto complexo
     *      Ordene implementando um novo objeto com a interface java.util.Comparable
     *  Ordene usando uma expressão lambda na chamada de suaLista.sort()
     *  Ordene usando referências de métodos e os métodos estátcos de Comparator
     *  Ordene coleções TreeSet e TreeMap
     * 
     * @param args 
     */
    public static void main(String[] args) {
        TreeSet<Estudante> listaSemOrdenacao = new TreeSet<>(),
                           listaOrdemNatural = new TreeSet<>(Comparator.comparingInt(Estudante::getIdade)),
                           listaOrdemReversa = new TreeSet<>(Comparator.comparingInt(Estudante::getIdade).reversed());
        
        listaSemOrdenacao.add(new Estudante("Italo", 20));
        listaSemOrdenacao.add(new Estudante("Karol", 19));
        listaSemOrdenacao.add(new Estudante("Bili", 17));
        listaSemOrdenacao.add(new Estudante("Auau", 15));
        listaSemOrdenacao.add(new Estudante("Astoufo", 25));
        
        listaOrdemNatural.addAll(listaSemOrdenacao);
        listaOrdemReversa.addAll(listaSemOrdenacao);
        
        System.out.println("->Ordene implementando a interface java.util.Compatator no seu objeto complexo");
        System.out.println(listaOrdemNatural);
        System.out.println(listaOrdemReversa);
        
    }
}
