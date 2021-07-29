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
public class TamanhoPizza {

    int quantidadeSabores;
    double precotamanho;
    double precoBorda;
    String tamanho;
    int validador = 0;
    SaborBorda saborBorda = new SaborBorda();
    
    public int selecioneTamanho(int controle) {

        switch (controle) {
        
        case  1 :
                quantidadeSabores =  5 ;
                tamanho =  " Gigante " ;
                precotamanho =  75 ;
                precoBorda =  80 ;
                break ;

            case  2 :
                quantidadeSabores =  4 ;
                tamanho =  " Família " ;
                precotamanho =  66 ;
                precoBorda =  69.5 ;
               break ;

            case  3 :
                quantidadeSabores =  3 ;
                tamanho =  " Mídia " ;
                precotamanho =  52 ;
                precoBorda =  56.5 ;
                break ;

            case  4 :
                quantidadeSabores =  3 ;
                tamanho =  " Pequena " ;
                precotamanho =  42 ;
                precoBorda =  44.5 ;
                break ;

            case  5 :
                quantidadeSabores =  2 ;
                tamanho =  " Broto " ;
                precotamanho =  28 ;
                validador =  1 ;
                break ;
        }
        return quantidadeSabores;
    }
}
