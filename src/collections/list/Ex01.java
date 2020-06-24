/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author italo
 */
public class Ex01 {
    
    /**
     * Crie uma lista e execute os seguintes comandos
     *      Adicione 5 nomes: Juliana, Larissa, Carlos, Pedro e João
     *      Navegue na lista exibindo cada nome no console
     *      Substitua o nome 'Carlos' por 'Roberto'
     *      Retorne o nome da posição 1
     *      Remova o nome da posição 4
     *      Remova o nome 'João'
     *      Retorne a quantidade de nomes na lista
     *      Crie uma lista com os nomes: Ismael e Rodrigo
     *      Adicione todos os nomes da nova lista à primeira
     *      Ordene os nomes da lista em ordem alfabética
     *      Verifique se a lista está vazia
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        List<String> nomes1 = new ArrayList<>();
        
        nomes1.add("Juliana");
        nomes1.add("Larissa");
        nomes1.add("Carlos");
        nomes1.add("Pedro");
        nomes1.add("João");
        
        for (String nome : nomes1) {
            System.out.println("ForEach com for: " + nome);
        }
        
        System.out.println(" --");
        
        nomes1.forEach((nome) -> {
            System.out.println("ForEach bonito: " + nome);
        });
        
        System.out.println(" -- ");
        
        Iterator<String> iterator = nomes1.iterator();
        
        while (iterator.hasNext()) {
            System.out.println("iterator: " + iterator.next());
        }
        
        System.out.println("");
        
        System.out.println("--> Substitui 'Carlos' por 'Roberto'");
        System.out.println(nomes1);
        nomes1.set(nomes1.indexOf("Carlos"), "Roberto");
        System.out.println(nomes1);
        System.out.println("");
        
        System.out.println("--> Nome na posição 1: " + nomes1.get(1));
        System.out.println("");
        
        System.out.println("--> Remove o nome 'João'");
        System.out.println(nomes1);
        nomes1.remove("João");
        System.out.println(nomes1);
        System.out.println("");
        
        System.out.println("--> Retorne a quantidade de nomes na lista");
        System.out.println(nomes1.size());
        System.out.println("");
        
        List<String> nomes2 = new ArrayList<>();
        
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");
        
        System.out.println("--> Adicione todos os nomes da nova lista à primeira");
        System.out.println("1ª: " + nomes1);
        System.out.println("2ª: " + nomes2);
        nomes1.addAll(nomes2);
        System.out.println("1ª: " + nomes1);
        System.out.println("");
        
        System.out.println("--> Ordene os nomes da lista em ordem alfabética");
        System.out.println(nomes1);
        Collections.sort(nomes1);
        System.out.println(nomes1);
        System.out.println("");
        
        System.out.println("--> Verifique se a lista está vazia");
        System.out.println(nomes1.isEmpty());
        System.out.println("");
    }
}
