/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.comparator.exemploaula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Wesley, professor na Digital Innovation One
 * 
 * Exemplo que ele deu na aula
 */
public class Main {
    
    public static void main(String[] args) {
        List<Estudante> lista = new ArrayList<>();
        
        lista.add(new Estudante("Italo", 20));
        lista.add(new Estudante("Karol", 19));
        lista.add(new Estudante("Batata", 22));
        lista.add(new Estudante("Bili", 15));
        lista.add(new Estudante("Auau", 16));
        
        System.out.println("->Lista não ordenada");
        System.out.println(lista);
        System.out.println("");
        
        System.out.println("->Lista ordenada com lambda");
        lista.sort((o1, o2) -> o1.getIdade() - o2.getIdade());
        System.out.println(lista);
        System.out.println("");
        
        System.out.println("->Lista ordenada com lambda + reverse");
        lista.sort((o1, o2) -> o2.getIdade() - o1.getIdade());
        System.out.println(lista);
        System.out.println("");
        
        System.out.println("->Lista ordenada com reference");
        lista.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println(lista);
        System.out.println("");
        
        System.out.println("->Lista ordenada com reference reverse");
        lista.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println(lista);
        System.out.println("");
        
        System.out.println("->Lista ordenada com Comparable");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
        
        System.out.println("->Lista ordenada com Comparator reverse");
        Collections.sort(lista, new EstudanteComparator());
        System.out.println(lista);
        
    }
}
