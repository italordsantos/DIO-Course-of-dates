/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.optional;

import java.util.Optional;

/**
 *
 * @author italo
 */
public class Ex01_Optional {
    
    /**
     * Crie um optional de um determinado tipo de dado
     *  Crie com estado vazio, estado presente, e com null
     *  Se presente, exiba o valor no console
     *  Se vazio, lance uma exceção IllegalStateException
     *  Se vazio, exiba "Optional vazio" no console
     *  Se presente, transforme o valor e exiba no console
     *  Se presente, pegue o valor do oprtional e atribua em uma variável
     *  Se presente, filtre o optional com uma determinada regra de negócio
     * 
     * @param args 
     */
    public static void main(String[] args) {
        Optional<String> o = Optional.of("Italo");
        Optional<String> oo = Optional.empty();
        Optional<String> ooo = Optional.ofNullable(null);
        
        System.out.println(o.isPresent());
        System.out.println(oo.isPresent());
        System.out.println(ooo.isPresent());
        
        //Java 14
        //ifPresentOrElse
    }
}
