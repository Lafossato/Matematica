
package com.mycompany.matematica2;

/**
 *
 * @author Larissa Fossato
 */
public class Matematica {
    //caucular a média da colecão recebida
    public static double media (double[]valores) {
        double soma = 0;
        for (int i = 0; i<valores.length; i++){
            soma += valores[i];
        }
        return soma / valores.length;
    }
    //calcula a variancia da colecão recebida
    public static double variancia ( double[] valores){
       double media = media (valores);
       double somaDiferencas = 0;
       for (int i = 0; i <valores.length; i++){
           somaDiferencas += Math.pow((valores[i] - media),2);
       }
       return somaDiferencas / (valores.length - 1);
    }
    //calcula o desvio padrão de uma colecão
    public static double desvioPadrao (double[]valores){
        return Math.sqrt(variancia(valores));
    }
}
