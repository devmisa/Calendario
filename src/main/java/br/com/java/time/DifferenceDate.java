package br.com.java.time;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DifferenceDate {

    public static void main(String[] args){

        LocalDate today = LocalDate.now();
        LocalDate anyDate = LocalDate.of(2021, Month.JANUARY, 04);

        long diferencaEmMeses = ChronoUnit.MONTHS.between(anyDate, today);

        System.out.println("Diferença de meses =  " + diferencaEmMeses);


    }

}
