/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.map;

import java.util.TreeMap;

/**
 *
 * @author italo
 */
public class Ex01_TreeMap {
        
    /**
     * Crie um map e execute as seguintes operações:
     *  Adicione os 26 estados Brasileiros no map, onde a sigla será a chave e o nome do estado o valor
     *  Remova o estado de Minas Gerais
     *  Adicione o Distrito Federal
     *  Verifique o tamanho do mapa
     *  Remova o estado do Mato Grosso do Sul usando o nome
     *  Navegue em todos os registros do map, mostrando no console no seguinte formato: NOME (SIGLA)
     *  Verifique se o estado de Santa Catarina existe no map buscando por sua sigla (SC)
     *  Verifique se o estado de Maranhão existe no map buscando por seu nome
     * 
     * @param args 
     */
    public static void main(String[] args) {
        TreeMap<String, String> estados = new TreeMap<>();
        
        System.out.println("-> Adicione os 26 estados Brasileiros no map, onde a sigla será a chave e o nome do estado o valor");
        System.out.println(estados);
        estados.put("AC", "Acre");
        estados.put("AL", "Alagoas");
        estados.put("AP", "Amapá");
        estados.put("AM", "Amazonas");
        estados.put("BA", "Bahia");
        estados.put("CE", "Ceará");
        estados.put("ES", "Espírito Santo");
        estados.put("GO", "Goiás");
        estados.put("MA", "Maranhão");
        estados.put("MT", "Mato Grosso");
        estados.put("MS", "Mato Grosso do Sul");
        estados.put("MG", "Minas Gerais");
        estados.put("PA", "Pará");
        estados.put("PB", "Paraíba");
        estados.put("PR", "Paraná");
        estados.put("PE", "Pernambuco");
        estados.put("PI", "Piauí");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("RN", "Rio Grande do Norte");
        estados.put("RS", "Rio Grande do Sul");
        estados.put("RO", "Rondônia");
        estados.put("RR", "Roraima");
        estados.put("SC", "Santa Catarina");
        estados.put("SP", "São Paulo");
        estados.put("SE", "Sergipe");
        estados.put("TO", "Tocantins");
        System.out.println(estados);
        System.out.println("");
        
        System.out.println("->Remova o estado de Minas Gerais");
        System.out.println(estados);
        estados.remove("MG");
        System.out.println(estados);
        System.out.println("");
        
        System.out.println("->Adicione o Distrito Federal");
        System.out.println(estados);
        estados.put("DF", "Distrito Federal");
        System.out.println(estados);
        System.out.println("");
        
        System.out.println("->Verifique o tamanho do mapa");
        System.out.println(estados.size());
        System.out.println("");
        
        System.out.println("->Remova o estado do Mato Grosso do Sul usando o nome");
        System.out.println(estados);
        estados.remove("MS", "Mato Grosso do Sul");
        System.out.println(estados);
        System.out.println("");
        
        System.out.println("->Navegue em todos os registros do map, mostrando no console no seguinte formato: NOME (SIGLA)");
        for (String estado : estados.keySet()) {
            System.out.println(estados.get(estado) + " (" + estado + ")");
        }
        System.out.println("");
        
        System.out.println("->Verifique se o estado de Santa Catarina existe no map buscando por sua sigla (SC)");
        System.out.println(estados);
        System.out.println(estados.containsKey("SC"));
        System.out.println("");
        
        System.out.println("->Verifique se o estado de Maranhão existe no map buscando por seu nome");
        System.out.println(estados);
        System.out.println(estados.containsValue("Maranhão"));
        System.out.println("");
    }
}
