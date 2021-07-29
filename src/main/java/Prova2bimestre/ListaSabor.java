/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova2bimestre;

import java.util.ArrayList;

/**
 *
 * @author Douglas
 */
public class ListaSabor {
    double precoSabor;
    TamanhoPizza tamanhoPizza = new TamanhoPizza();
    ArrayList<String> listaSabor = new ArrayList();

    Pedido pedido = new Pedido();

    public ArrayList selecioneSabor(int controle) {
        switch (controle) {
            case 1:
                listaSabor.add("5 Queijos");
                break;
            case 2:
                listaSabor.add("Frango Catupiry");
                break;
            case 3:
                listaSabor.add("Cheddar");
                precoSabor += 3.50;
                break;
            case 4:
                listaSabor.add("Calabresa");
                break;
            case 5:
                listaSabor.add("Chocolate");
                break;
            case 6:
                listaSabor.add("Prestigio");
                break;
            case 7:
                listaSabor.add("Salmao com alcaparras");
                precoSabor += 4;
                break;
            case 8:
                listaSabor.add("Camarao");
                precoSabor += 4.5;
                break;
            case 9:
                listaSabor.add("Abacaxi com Canela");
                break;
        }

        return listaSabor;
    }

}