/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafios;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
        String dataRecebida, dataRecebidaVetor[];
        int diasPagar = 10;

        System.out.println("Digite a data de vencimento, formato dd/mm/aaaa");
        dataRecebida = leia.next();

        dataRecebidaVetor = dataRecebida.split("/");

        Calendar data = new GregorianCalendar(Integer.parseInt(dataRecebidaVetor[2]), Integer.parseInt(dataRecebidaVetor[1]) - 1, Integer.parseInt(dataRecebidaVetor[0]));

        data.add(Calendar.DAY_OF_MONTH, 10);

        if (data.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            diasPagar = 12;
        } else if (data.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            diasPagar = 11;
        }

        System.out.println("Você tem " + diasPagar + " dias para pagar");
    }
}
