package com.mycompany.matematica2;


import com.mycompany.matematica2.Matematica;



/**
 *
 * @author Larissa Fossato
 */
public class TesteMatematica {
    public static void main(String[] args) {
        double[]turmal = {5,5,5};
        double[]turma2 = {9,5,1};
        double media1, media2, variancia1, variancia2, desvio1, desvio2;
        media1 = Matematica.media(turmal);
        variancia1 = Matematica.variancia(turmal);
        desvio1 = Matematica.desvioPadrao(turmal);
        media2 = Matematica.media(turma2);
        variancia2 = Matematica.variancia(turma2);
        desvio2 = Matematica.desvioPadrao(turma2);
        System.out.printf("Turma 1:(Média: %2f, Variancia: %2f, Desvio Padrão: %2f)\n", media1,variancia1,desvio1);
        System.out.printf("Turma 2: (Média: %2f, Variancia: %2f, Desvio Padrão: %2f)\n", media2,variancia2,desvio2);
    }
}
