/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafios;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author italo
 */
public class Ex02 {

    /**
     * Um cliente tem 10 dias para pagar uma fatura após sua data de vencimento
     * sem que os juros sejam cobrados
     *
     * Caso essa data caia em um sábado ou domingo, o cliente pode pagar na
     * segunda-feira seguinte
     *
     * Crie uma estrutura que receba uma data de vencimento e calcule quantos
     * dias ele tem para pagar 
     * 
     * @param args
     */
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        String dataRecebida, datas[];
        int dias = 10;
        
        System.out.println("Digite a data de vencimento, formato dd/mm/aaaa");
        dataRecebida = leia.next();
        
        datas = dataRecebida.split("/");
        
        LocalDate data = LocalDate.of(Integer.parseInt(datas[2]), Integer.parseInt(datas[1]), Integer.parseInt(datas[0]));
        
        data = data.plusDays(10);
        
        if (data.getDayOfWeek() == DayOfWeek.SATURDAY) {
            dias = 12;
        } else if (data.getDayOfWeek() == DayOfWeek.SUNDAY) {
            dias = 11;
        }
        
        System.out.println("Você tem " + dias + " dias para pagar");
    }
}
