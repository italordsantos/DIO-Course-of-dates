/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.comparator;

import collections.comparator.exemploaula.Estudante;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author italo
 */
public class Ex03_TreeMap {
    
    /**
     * Crie uma lista de um objeto complexo com as seguintes operações:
     *  Adicione elementos nesta lsita
     *  Ordene implementando a interface java.util.Compatator no seu objeto complexo
     *  Ordene mplementando um novo objeto com a interface java.util.Comparable
     *  Ordene usando uma expressão lambda na chamada de suaLista.sort()
     *  Ordene usando referências de métodos e os métodos estátcos de Comparator
     *  Ordene coleções TreeSet e TreeMap
     * 
     * @param args 
     */
    public static void main(String[] args) {
        TreeMap<Estudante, Object> listaSemOrdenacao = new TreeMap<>(),
                           listaOrdemNatural = new TreeMap<>(Comparator.comparingInt(Estudante::getIdade)),
                           listaOrdemReversa = new TreeMap<>(Comparator.comparingInt(Estudante::getIdade).reversed());
        
        listaSemOrdenacao.put(new Estudante("Italo", 20), null);
        listaSemOrdenacao.put(new Estudante("Karol", 19), null);
        listaSemOrdenacao.put(new Estudante("Bili", 17), null);
        listaSemOrdenacao.put(new Estudante("Auau", 15), null);
        listaSemOrdenacao.put(new Estudante("Astoufo", 25), null);
        
        listaOrdemNatural.putAll(listaSemOrdenacao);
        listaOrdemReversa.putAll(listaSemOrdenacao);
        
        System.out.println("->Ordene implementando a interface java.util.Compatator no seu objeto complexo");
        System.out.println(listaOrdemNatural);
        System.out.println(listaOrdemReversa);
    }
}
