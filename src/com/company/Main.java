package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date dataNascimento = new Date(111380400000L);
        System.out.println("Nasci na data: " + dataNascimento);

        Date novaData = new Date(1273934783000L);
        System.out.println("A Nova data é: " + novaData);

        boolean anterior = dataNascimento.before(novaData);
        boolean posterior = dataNascimento.after(novaData);
        if (anterior) {
            System.out.println("A data é anterior a 15 de maio de 2010!");
        }
        else if (posterior) {
            System.out.println("A data é posterior a 15 de maio de 2010");
        }
    }
}
