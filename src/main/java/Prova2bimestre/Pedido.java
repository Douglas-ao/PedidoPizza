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
public class Pedido {
   private int controle = 0;
   private double total, valor;;
    public void pedido() {
        TamanhoPizza tamanhoPizza = new TamanhoPizza();
        ListaSabor sabor = new ListaSabor();
        SaborBorda saborBorda = new SaborBorda();
        Bebidas bebidas = new Bebidas();

        Scanner entradaTamanho = new Scanner(System.in);

        System.out.println("Digite o numero do tamanho");
        System.out.println("1- Gigante contem 5 sabor ");
        System.out.println("2- Familia contem 4 sabor");
        System.out.println("3- Media contem 3 sabor");
        System.out.println("4- Pequena contem 3 sabor");
        System.out.println("5- Broto contem 2 sabor");
        tamanhoPizza.selecioneTamanho(entradaTamanho.nextInt());

        while (controle < tamanhoPizza.quantidadeSabores) {
            Scanner entradaSabor = new Scanner(System.in);

            System.out.println("Escolha um sabor por vez: ");
            System.out.println("1- 5 Queijos");
            System.out.println("2- Frango Catupiry ");
            System.out.println("3- Cheddar ");
            System.out.println("4- Calabresa");
            System.out.println("5- Chocolate ");
            System.out.println("6- Prestigio ");
            System.out.println("7- Salmao com alcaparras ");
            System.out.println("8- Camarao ");
            System.out.println("9- Abacaxi com Canela ");
            sabor.selecioneSabor(entradaSabor.nextInt());
            controle++;
        }

        if (tamanhoPizza.validador == 0) {
            Scanner entradaBorda = new Scanner(System.in);
            System.out.println("Digite o numero da escolha");
            System.out.println("1- Com borda");
            System.out.println("2- Sem borda");
            saborBorda.validadorBorda(entradaBorda.nextInt());
        } else {

        }

        if (saborBorda.validador == 1) {
            valor = tamanhoPizza.precoBorda;
        } else {
            valor = tamanhoPizza.precotamanho;
        }

        while (bebidas.validador == 1) {
            Scanner escolhaBebida = new Scanner(System.in);
            System.out.println("Digite o numero da escolha");
            System.out.println("1- Bebidas");
            System.out.println("2- Fechar a conta");

            bebidas.validacaoBebida(escolhaBebida.nextInt());
        }

        total = bebidas.precoBebidas + saborBorda.precoBorda + sabor.precoSabor + valor;

        System.out.println("Tamanho da pizza: " + tamanhoPizza.tamanho);
        System.out.println("Valor da pizza: R$:" + valor);
        System.out.println("Sabores da Pizza: " + sabor.listaSabor);
        System.out.println("Valor adicional do sabor da pizza: R$:" + (sabor.precoSabor));
        System.out.println("Sabores da borda:" + saborBorda.borda);
        System.out.println("Valor adicional da borda R$:" + (saborBorda.precoBorda));
        System.out.println("A bebida escolhida foi: " + bebidas.listBebidas);
        System.out.println("Valor das bebidas: " + bebidas.precoBebidas);       
        System.out.println("Total do pedido : R$" + total );


    }
    
}
