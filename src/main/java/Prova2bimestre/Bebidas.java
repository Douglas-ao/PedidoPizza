/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova2bimestre;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Douglas
 */
public class Bebidas {

    private int escolha; 
    int validador = 1;   
    private String Bebida;
    double precoBebidas;
    ArrayList<String> listBebidas = new ArrayList();

    public int validacaoBebida(int escolha) {

        switch (escolha) {
            case 1:
                selecionarBebida();
                break;
            case 2:
                validador = validador - 1;
                break;

        }
        return 0;
    }

    public ArrayList selecionarBebida() {
        Scanner entradaBebida = new Scanner(System.in);
        System.out.println("Digite o numero da bebida ");
        System.out.println("1- Coca Cola 2 LT");
        System.out.println("2- Cerveja Heineken 330 ML ");
        System.out.println("3- Suco Pratz 900 ML");
        System.out.println("4- Agua Mineral 600 ML");
        escolha = entradaBebida.nextInt();
        
        switch (escolha) {
            case 1:
                listBebidas.add("Coca Cola 2 LT");
                precoBebidas = precoBebidas + 9.5;
                break;

            case 2:
                listBebidas.add("Cerveja Heineken 330 ML");
                precoBebidas = precoBebidas + 6.5;
                break;

            case 3:
                listBebidas.add("Suco Pratz 900 ML");
                precoBebidas = precoBebidas + 12.5;
                break;

            case 4:
                listBebidas.add("Agua Mineral 600 ML");
                precoBebidas = precoBebidas + 3.5;
                break;
        }

        return listBebidas;

    }
    
}
