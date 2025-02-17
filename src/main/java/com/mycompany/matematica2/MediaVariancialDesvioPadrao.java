
package com.mycompany.matematica2;

/**
 *
 * @author Larissa Fossato
 */
public class MediaVariancialDesvioPadrao {
    public static void main(String[] args) {
        double[] colecao = {9,5,1};
        //média
        double soma = 0;
        for (int i = 0; i <colecao.length; i++){
            soma += colecao[i];
        }
        double media = soma / colecao.length;
        //variancia
        double somaDiferencas = 0;
        for (int i = 0; i < colecao.length; i++){
            somaDiferencas += Math.pow((colecao[i] - media), 2);
        }
        double variancia = somaDiferencas / (colecao.length - 1);
        //desvio padrão
        double desvioPadrao = Math.sqrt(variancia);
        System.out.printf("Media: %2f, Variancia: %2f, Desvio Padrap: %.2f\n", media, variancia, desvioPadrao);
    }
}
