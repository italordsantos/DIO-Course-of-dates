/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

import java.time.LocalDateTime;

/**
 *
 * @author italo
 */
public class Ex04 {

    /**
     * Adicione 4 anos, 6 meses e 13 horas ao momento 15/05/2010 10:00:00
     *
     * @param args
     */
    public static void main(String[] args) {
        LocalDateTime dataAtual = LocalDateTime.of(2010, 05, 15, 10, 0, 0);
        LocalDateTime dataModificada = dataAtual.plusYears(4).plusMonths(6).plusHours(13);
        
        System.out.println("Data antiga: " + dataAtual);
        System.out.println("Data atual : " + dataModificada);
    }
}
