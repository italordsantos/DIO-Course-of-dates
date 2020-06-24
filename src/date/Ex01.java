/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author italo
 */
public class Ex01 {
    
    /*
    - Descubra o timeInMillis do dia que você nasceu
    - Converta em um objeto Date
    - Verifique se ele é anterior ou posterior a 15 de maio de 2010
    */
    
    public static void main(String[] args) {
        long mili = Instant.parse("2000-04-12T00:00:00.00Z").getEpochSecond();

        System.out.println("Tempo em milissegundos: " + mili);
        
        Date data = new Date(mili);
        
        System.out.println("É anterior: " + (data.compareTo(new Date(Instant.parse("2010-05-15T00:00:00.00Z").getEpochSecond())) > 0 ? "sim" : "não"));
        
    }
}
