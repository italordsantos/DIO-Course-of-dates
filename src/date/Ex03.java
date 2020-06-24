/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author italo
 */
public class Ex03 {

    /**
     * Converta a data atual no formato DD/MM/YYYY HH:MM:SS:MMM ~OBS: há uma
     * pegadinha, estas letras são case sensitive ;)
     *
     * @param args
     */
    public static void main(String[] args) {
        Date date = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS");
        
        String dataFormatada = sdf.format(date);
        
        System.out.println(dataFormatada);
    }
}
