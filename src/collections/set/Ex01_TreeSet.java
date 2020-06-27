/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.set;

import java.util.TreeSet;

/**
 *
 * @author italo
 */
public class Ex01_TreeSet {
    
    /**
     * Crie um set e execute as seguintes operações
     *  Adicione 5 números inteiros: 5, 88, 20, 44, 3
     *  Navegue no set exibindo cada número no console
     *  Remova o primeiro item do set
     *  Adicione um novo número no set: 23
     *  Verifique o tamanho do set
     *  Verifique se o set está vazio
     * 
     * @param args 
     */
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        
        System.out.println("->Adicione 5 números inteiros: 5, 88, 20, 44, 3");
        System.out.println(treeSet);
        treeSet.add(5);
        treeSet.add(88);
        treeSet.add(20);
        treeSet.add(44);
        treeSet.add(3);
        System.out.println(treeSet);
        System.out.println("");
        
        System.out.println("->Navegue no set exibindo cada número no console");
        System.out.println(treeSet);
        System.out.println("");
        
        System.out.println("->Remova o primeiro item do set");
        System.out.println(treeSet);
        treeSet.remove(treeSet.first());
        System.out.println(treeSet);
        System.out.println("");
        
        System.out.println("->Adicione um novo número no set: 23");
        treeSet.add(23);
        System.out.println(treeSet);
        System.out.println("");
        
        System.out.println("->Verifique o tamanho do set");
        System.out.println(treeSet.size());
        System.out.println("");
        
        System.out.println("Verifique se o set está vazio");
        System.out.println(treeSet.isEmpty());
    }
}
