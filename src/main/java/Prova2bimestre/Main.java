/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova2bimestre;

/**
 *
 * @author Douglas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pedido pedido = new Pedido();
        TamanhoPizza tamanho = new TamanhoPizza();
        ListaSabor sabor = new ListaSabor();
        SaborBorda borda = new SaborBorda();
        Bebidas bebidas = new Bebidas();

        pedido.pedido();
    }
}
