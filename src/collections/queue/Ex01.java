/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author italo
 */
public class Ex01 {
    
    /**
     * Crie uma fila e execute as seguintes operações
     *      Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João
     *      Navegue na fila exibindo cada nome no console
     *      Retorne o primeiro item da fila, sem removê-lo
     *      Retorne o primeiro item da fila, removendo o mesmo
     *      Adicione um novo nome: Daniel. Verifique a posição que o memso assumiu
     *      Retorne o tamanho da lista
     *      Verifique se a lista está vazia
     *      Verifique se o nome Carlos está na lista
     * 
     * 
     * @param args 
     */
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();
        
        filaBanco.add("Juliana");
        filaBanco.add("Pedro");
        filaBanco.add("Carlos");
        filaBanco.add("Larissa");
        filaBanco.add("João");

        filaBanco.forEach((nome) -> {
            System.out.println("Nome for> " + nome);
        });
        System.out.println("");
        
        System.out.println("->Retorne o primeiro item da fila, sem removê-lo");
        System.out.println(filaBanco);
        System.out.println(filaBanco.peek());
        System.out.println(filaBanco);
        System.out.println("");
        
        System.out.println("->Retorne o primeiro item da fila, removendo o mesmo"); 
        System.out.println(filaBanco);
        System.out.println(filaBanco.poll());
        System.out.println(filaBanco);
        System.out.println("");
        
        System.out.println("->Adicione um novo nome: Daniel. Verifique a posição que o memso assumiu");
        filaBanco.add("Daniel");
        System.out.println(filaBanco);
        System.out.println("");
        
        System.out.println("->Retorne o tamanho da lista");
        System.out.println(filaBanco);
        System.out.println(filaBanco.size());
        System.out.println("");
        
        System.out.println("->Verifique se a lista está vazia");
        System.out.println(filaBanco);
        System.out.println(filaBanco.isEmpty());
        System.out.println("");
        
        System.out.println("->Verifique se o nome Carlos está na lista");
        System.out.println(filaBanco);
        System.out.println(filaBanco.offer("Carlos"));
    }
}
