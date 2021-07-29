/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova2bimestre;

import java.util.Scanner;

/**
 *
 * @author Douglas
 */
public class SaborBorda {

    int validador = 0;
    int controle;
    String borda;
    double precoBorda;
    Pedido pedido = new Pedido();

    public int validadorBorda(int controle) {
        switch (controle) {
            case 1:
                selecioneBorda();
                validador = 1;
                break;
            case 2:
                break;
        }
        return 0;
    }

    public String selecioneBorda() {
        Scanner escolhaBorda = new Scanner(System.in);

        System.out.println("digite o numero da borda");
        System.out.println("1-Cheddar");
        System.out.println("2-Catupiry ");
        System.out.println("3- 1/2 Nutella 1/2 Doce de Leite");
        System.out.println("4-Nutella");
        controle = escolhaBorda.nextInt();

        switch (controle) {
            case 1:
                borda = "Cheddar";
                break;

            case 2:
                borda = "Catupiry";
                break;

            case 3:
                borda = "Metade Nutella e Metade Doce de Leite";
                precoBorda = 3;
                break;

            case 4:
                borda = "Nutella";
                precoBorda = 4;
                break;
        }
        return borda;
    }
}
