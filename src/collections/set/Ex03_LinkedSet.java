/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.set;

import java.util.LinkedHashSet;

/**
 *
 * @author italo
 */
public class Ex03_LinkedSet {
    
    /**
     * Crie um set e execute as seguintes operações
     *      Adicione 5 números inteiros: 5, 88, 20, 44, 3
     *      Navegue no set exibindo cada número no console
     *  Remova o primeiro item do set
     *  Adicione um novo número no set: 23
     *  Verifique o tamanho do set
     *  Verifique se o set está vazio
     * 
     * @param args 
     */
    public static void main(String[] args) {
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        
        System.out.println("->Adicione 5 números inteiros: 5, 88, 20, 44, 3");
        System.out.println(hashSet);
        hashSet.add(5);
        hashSet.add(88);
        hashSet.add(20);
        hashSet.add(44);
        hashSet.add(3);
        System.out.println(hashSet);
        System.out.println("");
        
        System.out.println("->Navegue no set exibindo cada número no console");
        System.out.println(hashSet);
        System.out.println("");
        
        System.out.println("->Remova o primeiro item do set");
        System.out.println(hashSet);
        hashSet.remove(5);
        System.out.println(hashSet);
        System.out.println("");
        
        System.out.println("->Adicione um novo número no set: 23");
        hashSet.add(23);
        System.out.println(hashSet);
        System.out.println("");
        
        System.out.println("->Verifique o tamanho do set");
        System.out.println(hashSet.size());
        System.out.println("");
        
        System.out.println("Verifique se o set está vazio");
        System.out.println(hashSet.isEmpty());
    }
}
