/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author italo
 */
public class Ex01_Stream {
    
    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();
        List<String> estudantesNovaColecao = new ArrayList<>();
        
        estudantes.add("Italo");
        estudantes.add("Karol");
        estudantes.add("Astoufo");
        estudantes.add("Marcos");
        estudantes.add("José");
        estudantes.add("Maria");
        estudantes.add("João");
        
        System.out.println("Retorna contagem de elementos");
        System.out.println(estudantes.stream().count());
        System.out.println("");
        
        System.out.println("->Retorna o elemento com maior número de letras");
        System.out.println(estudantes.stream().max(Comparator.comparingInt(String::length)));
        System.out.println("");
        
        System.out.println("->Retorna o elemento com menor número de letras");
        System.out.println(estudantes.stream().min(Comparator.comparingInt(String::length)));
        System.out.println("");
        
        System.out.println("->Retorna uma nova coleção de mesmo tipo com bse em um filtro");
        System.out.println(estudantes);
        System.out.println(estudantes.stream().filter((estudante) -> estudante.toLowerCase().contains("a")).collect(Collectors.toList()));
        System.out.println("");
        
        System.out.println("->Retorna uma nova colecao com o mesmo tamanho porem com dados do tipo que forem passados na expressao");
        System.out.println(estudantes.stream().map((estudante) -> estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));
        System.out.println("");
        
        System.out.println("->Limitar saída dos 3 primeiros da coleção");
        System.out.println(estudantes.stream().limit(3).collect(Collectors.toList()));
        System.out.println("");
        
        System.out.println("->Executa uma funcao para todos os elementos de uma colecao (ISSO É DEMAIS!!!!!!!) e depois retorna essa coleção");
        System.out.println(estudantes.stream().peek(System.out::println).collect(Collectors.toList()));
        System.out.println("");
        
        System.out.println("->Executa um foreach pra lista finalizando a cadeira de stream com void");
        estudantes.stream().forEach(System.out::println);
        System.out.println("");
        
        System.out.println("->TODOS os elementos CONTÉM 'a'?");
        System.out.println(estudantes.stream().allMatch((elemento) -> elemento.contains("a")));
        System.out.println("");
        
        System.out.println("ALGUM elemento CONTÉM 'a'?");
        System.out.println(estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));
        System.out.println("");
        
        System.out.println("->TODOS os elementos NÃO CONTÉM 'a'?");
        estudantes.stream().noneMatch((elemento) -> elemento.contains("a"));
        System.out.println("");

        System.out.println("->Retorna o primeiro elemento da coleção utilizando um Option");
        estudantes.stream().findFirst().ifPresent(System.out::println);
        System.out.println("");
        
        System.out.println("->Operações encadeadas");
        System.out.println(estudantes.stream()
                .peek(System.out::println)
                .map((estudante) ->
                        estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter((estudante) ->
                        estudante.toLowerCase().contains("a"))
                //.sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors
                        //.toList()
                        //.joining(", ")
                        //.toSet()
                        .groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 2))
                )
        );
    }
    
}
