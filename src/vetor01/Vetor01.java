/*
https://faianofsilva-2022.atlassian.net/jira/software/c/projects/TRE/

  tAREFA tre-1

Faça um programa que
-> preencha três vetores com dez posições cada
um: o primeiro vetor, com os nomes de dez produtos;
dois: vetor com os códigos dos dez produtos;
trÊs:  com os preços dos produtos. 

Mostre um relatório 
-> apenas com o nome, o código, o preço e o novo preço dos produtos que sofrerão
aumento.

Sabe-se que osprodutos que sofrerão aumento código par ou preço superior 
a R$ 1.000,00. 

-> para os produtos que satisfizerem às duas condições anteriores, 
código e preço,
       *** o aumento será de 20%; 

-> para aqueles que satisfizerem apenas à condição do código, 
       *** aumento será de 15%; 
-> para aqueles que satisfizerem apenas à condição de preço,
       *** o aumento será de 10%.

 */
package vetor01;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Fabiano F Silva
 */
public class Vetor01 {

    /**
     * @param args the command line arguments1
     * 
     */
    public static void main(String[] args) {
        Calculos cal = new Calculos();
        cal.criaVetor();
    }
}